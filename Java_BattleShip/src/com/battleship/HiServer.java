package com.battleship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HiServer {

	static Map map = new Map();

	public static void main(String[] args) {

		ServerSocket serverSocket = null; // client 접속을 받기 위한 ServerSocket
		Socket serviceSocket; // 접속한 clinet와 통신하귀 위한 Socket

		PrintWriter out = null; // 클라이언트에게 문자열을 보내기 위한 것
		BufferedReader in = null;
		BufferedReader stdin = null;

		try {
			// client 접속을 위한 소켓서버를 만든다. 아규먼트로 받은 포트 넘버에
			serverSocket = new ServerSocket(9999);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (true) {

			try {
				GamePlay sBattle = new GamePlay();
				sBattle.start("서버!!");

				serviceSocket = serverSocket.accept();
				in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
				out = new PrintWriter(serviceSocket.getOutputStream(), true);
				stdin = new BufferedReader(new InputStreamReader(System.in));

				System.out.print("Server 메세지 입력 : ");
				String inputLine;
				while ((inputLine = in.readLine()) != null) {
					// 종료 조건
					if (map.noMoreShip(map.getMap())) {
						System.out.println(Print.END_GAME);
						System.out.println(Print.GAME_RESTART);
						break;
					}

					// 폭격 받기!!
					System.out.println("client가 보낸 메세지 : " + inputLine);

					int str = Integer.parseInt(inputLine);
					int x = str / 10;
					int y = str - (x * 10);
					if (ThrowBomb.getBomb(map.getMap(), new Pair<Integer, Integer>(x, y))) {
						map.setMap(map.getMap(), x, y);
					}
					
					Print.printMap(map.getMap());
					
					// 폭격 날리기!!
					System.out.print("Server 폭격할 좌표를 입력하세욧(xy 붙여서) : ");
					while ((inputLine = stdin.readLine()) != null) {
						out.println(inputLine);
						break;
					}
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
