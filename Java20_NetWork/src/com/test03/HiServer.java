package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HiServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;		//client 접속을 받기 위한 ServerSocket
		Socket serviceSocket;					//접속한 clinet와 통신하귀 위한 Socket
		
		
		PrintWriter out = null;					//클라이언트에게 문자열을 보내기 위한 것
		BufferedReader in = null;				
		
		try {
			// client 접속을 위한 소켓서버를 만든다. 아규먼트로 받은 포트 넘버에
			serverSocket = new ServerSocket(9999);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while(true) {
			System.out.println("client 를 기다립니다...");
			
			try {//클라이언트가 접속하면 이를 소켓으로 관리해준다.				
				serviceSocket = serverSocket.accept();	
				System.out.println("client가 접속했습니다.");
				
				// BufferedReader() : arg로 받은 캐릭터셋으로 버퍼링을 만든다.
				// InputStreamReader() : byte를 읽어 캐릭터셋으로 디코딩 한다.
				// Socket serviceSocket.getInputStream() : an input stream for reading bytes from this socket.
				in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
				
				//serviceSocket.getOutputStream() : 이 소켓의 아웃풋 스트림을 리턴한다.
				out = new PrintWriter(serviceSocket.getOutputStream(), true);
				
				String inputLine;
				while((inputLine = in.readLine()) != null) {
					System.out.println("client가 보낸 메세지 : " + inputLine);					
					
					out.println("*" + inputLine);
				}
				
				
				
				out.close();
				in.close();
				serviceSocket.close();
				serverSocket.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
		
	}
}
