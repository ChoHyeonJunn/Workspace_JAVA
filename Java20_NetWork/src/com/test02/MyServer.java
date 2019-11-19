package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * udp
 */
public class MyServer {

	public static void main(String[] args) throws IOException {
		System.out.println("서버 입니다.");

		// 8888포트를 통해 서버를 생성
		DatagramSocket ds = new DatagramSocket(8888);

		// 받을 방 생성
		byte[] buff = new byte[1024];

		// 받을 방을 패킷으로 감쌋다.
		// 데이터 패킷 생성(데이터, 데이터 길이)
		DatagramPacket recievePacket = new DatagramPacket(buff, buff.length);

		// data를 받는다. 패킷으로 받았다. (패킷으로 보냈으니깐)
		ds.receive(recievePacket);

		// 받은 데이터(byte)를 스트링으로 변환해서 출력!
		System.out.println(new String(recievePacket.getData()));

		ds.close();
		ds.disconnect();
	}
}
