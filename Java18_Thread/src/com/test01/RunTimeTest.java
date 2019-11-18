package com.test01;

import java.io.IOException;

public class RunTimeTest {

	public static void main(String[] args) {
		String path = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome";
		// Singleton Pattern : new 연산자를 쓸 수 없다.
		Runtime rt = Runtime.getRuntime();
		int Count = 2;
		
		while (Count-- > 0) {
			try {
				Process prc = rt.exec(path);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
}
