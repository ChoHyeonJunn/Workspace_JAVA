package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class HiClient implements Runnable {

	@Override
	public void run() {

		try {
			Socket clientSocket; // 서버와 통신하기 위한 Socket

			PrintWriter out = null; // 서버에게 문자열을 보내기 위한 것
			BufferedReader in = null;
			BufferedReader stdin = null;

			System.out.println("서버에 접속중 입니다...");

			// Socket(InetAddress address, int port)
			// 클라이언트 소켓 스트림 생성, 특정 ip address의 특정 port 번호에 연결한다.
			clientSocket = new Socket("localhost", 9999);

			// flush() : 스트림을 비운다. -> 콘솔에 출력????
			out = new PrintWriter(clientSocket.getOutputStream(), true);

			// BufferedReader() : arg로 받은 캐릭터셋으로 버퍼링을 만든다.
			// InputStreamReader() : byte를 읽어 캐릭터셋으로 디코딩 한다.
			// Socket clientSocket.getInputStream() : 서버로 부터 날아온 문자를 받아온다.
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

			// 사용자의 입력값을 받아 놓는다.
			// BufferedReader() : arg로 받은 캐릭터셋으로 버퍼링을 만든다.
			//    buffering : 뭉태기로 뭉텅뭉텅 가져온다!! InputStreamReader로 받으면 바로바로 받아버리기 때문에
			// InputStreamReader() : byte를 읽어 캐릭터셋으로 디코딩 한다.
			stdin = new BufferedReader(new InputStreamReader(System.in));

			String inputLine;
			while ((inputLine = stdin.readLine()) != null) {
				out.println(inputLine);
				System.out.println("server로부터 다시 받은 메세지 : " + in.readLine());
			}

			out.close();
			in.close();
			stdin.close();
			clientSocket.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		Thread client = new Thread(new HiClient());
		client.start();

	}
}
