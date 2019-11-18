package com.test02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageTest {

	public static void main(String[] args) throws IOException {
		
		String fileName = "Cat.jpg";
		
		//FileInputStream fi = new FileInputStream(fileName);
		
		//***** 중요!!!!!!!
		//BufferedInputStream는 FileInputStream 객체를 파라미터로 받고 있다
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(fileName));
		
		FileOutputStream fo = new FileOutputStream(new File("c.jpg"));
		
		int a = 0;
		
		while((a = bi.read()) != -1) {
			fo.write(a);
		}
		
		fo.close();
		bi.close();
	}
}
