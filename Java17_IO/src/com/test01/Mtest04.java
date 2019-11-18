package com.test01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Mtest04 {

	/*
	 * JVM (자바가상머신) 이 main() 을 호출한다!
	 */
	public static void main(String[] args) throws IOException {
		File fi = new File("b.txt");

		fileOutput(fi);
		fileInput(fi);
	}

	public static void fileInput(File fi) throws IOException {
		FileInputStream fin = new FileInputStream(fi);
		
		int res = 0;
		while((res = fin.read()) != -1) {
			System.out.print((char)res + " ");
		}
		fin.close();
	}

	public static void fileOutput(File fi) throws IOException {
		FileOutputStream fo = new FileOutputStream(fi);
		
		for(int i=65; i<= 90;i++) {
			fo.write(i);
		}
		fo.close();
	}
}
