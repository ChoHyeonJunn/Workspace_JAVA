package com.battleship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class HiClient implements Runnable {

	static Map map = new Map();
	
	@Override
	public void run() {

		try {
			Socket clientSocket;

			PrintWriter out = null;
			BufferedReader in = null;
			BufferedReader stdin = null;

			System.out.println("서버에 접속중 입니다...");

			clientSocket = new Socket("localhost", 9999);


			GamePlay sBattle = new GamePlay();
			sBattle.start("클라이언트!!");
			
			
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			stdin = new BufferedReader(new InputStreamReader(System.in
					));


			System.out.print("Client 폭격할 좌표를 입력하세욧(xy 붙여서) : ");
			String inputLine;
			while ((inputLine = stdin.readLine()) != null) {
				// 종료 조건
				if (map.noMoreShip(map.getMap())) {
					System.out.println(Print.END_GAME);
					System.out.println(Print.GAME_RESTART);
					break;
				}
				
				out.println(inputLine);
				String read = in.readLine();
				System.out.println("server로부터 받은 메세지 : " + read);
				
				int str = Integer.parseInt(read);
				int x = str / 10;
				int y = str - (x * 10);
				if (ThrowBomb.getBomb(map.getMap(), new Pair<Integer, Integer>(x, y))) {
					map.setMap(map.getMap(), x, y);
				}
				
				Print.printMap(map.getMap());
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
