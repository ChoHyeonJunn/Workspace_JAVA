package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * udp
 */
public class MyClient {
	public static void main(String[] args) throws IOException {
		System.out.println("클라이언트 입니다.");

		// 클라이언트 생성
		DatagramSocket ds = new DatagramSocket();

		// 보낼 데이터 -> byte로 바꿔서
		byte[] buff = "연습입니다.".getBytes();

		// 패킷으로 감싼다!
		// 데이터 패킷 생성(데이터, 데이터 길이, ip id, port num)
		DatagramPacket sendPacket = new DatagramPacket(buff, buff.length, InetAddress.getByName("localhost"), 8888);

		// 패킷으로 감싸진 데이터를 보낸다!
		ds.send(sendPacket);

		ds.close();
		ds.disconnect();
	}
}
