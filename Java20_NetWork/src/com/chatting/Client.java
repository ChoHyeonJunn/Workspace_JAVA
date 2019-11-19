package com.chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import com.test03.HiClient;

public class Client implements Runnable {

	@Override
	public void run() {

		try {
			Socket clientSocket;
			PrintWriter out = null;	//서버에게 문자열을 보내기 위한 것
			BufferedReader in = null;
			BufferedReader stdin = null;

			System.out.println("서버에 접속중 입니다...");

			clientSocket = new Socket("localhost", 9999);

			out = new PrintWriter(clientSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			
			stdin = new BufferedReader(new InputStreamReader(System.in));

			String inputLine;
			while ((inputLine = stdin.readLine()) != null) {
				out.println(inputLine);
				System.out.println("server로부터 받은 메세지 : " + in.readLine());
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
