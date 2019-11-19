package com.chatting;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket serviceSocket;
		PrintWriter out = null;
		BufferedReader in = null;
		BufferedReader stdin = null;

		try {
			serverSocket = new ServerSocket(9999);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (true) {
			System.out.println("client 를 기다립니다...");

			try {
				serviceSocket = serverSocket.accept();
				System.out.println("client가 접속했습니다.");

				in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
				out = new PrintWriter(serviceSocket.getOutputStream(), true);

				
				String inputLine;
				while ((inputLine = in.readLine()) != null) {
					System.out.println("client가 보낸 메세지 : " + inputLine);
					
					
					//서버의 입력 값을 받음!!!
					stdin = new BufferedReader(new InputStreamReader(System.in));

					String severLine;
					while ((severLine = stdin.readLine()) != null) {
						out.println(severLine);
					}
					

//					out.println("서버 : " + inputLine);

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
