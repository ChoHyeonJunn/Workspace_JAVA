package com.test01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class MTest02 {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://img.animalplanet.co.kr/news/2019/10/07/700/99pk9saw36t7q8t3o0gt.jpg");
		byte[] b = new byte[1];

		URLConnection urlConnection = url.openConnection();
		urlConnection.connect();

		DataInputStream di = new DataInputStream(urlConnection.getInputStream());

		FileOutputStream fo = new FileOutputStream("a.jpg");

		while (di.read(b, 0, 1) != -1) {
			fo.write(b, 0, 1);
		}

		fo.close();
		di.close();
	}

}
