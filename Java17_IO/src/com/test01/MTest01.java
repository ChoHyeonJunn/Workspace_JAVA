package com.test01;

import java.io.File;
import java.io.IOException;

public class MTest01 {

	public static void main(String[] args) {

		File fi = new File("C:/test_io");

		if (fi.exists()) {
			System.out.println("exists!");
		} else {
			System.out.println("new!");
			fi.mkdir();	// 디렉토리 생성
		}
		
		
		File fic1 = new File(fi, "AA");
		fic1.mkdir();
		
		File fic2 = new File("C:/test_io", "BB");
		fic2.mkdir();
		
		File fitxt = new File(fic1, "a.txt");
		try {
			//Checked Exception : 컴파일 시 자바가 예외를 알려줌
			fitxt.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
