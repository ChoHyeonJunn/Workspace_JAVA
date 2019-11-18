package com.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MTest03 {

	public static void main(String[] args) {
		File fi = new File("a.txt");

		//같은 파일에 쓴다면 순서가 중요합니다! -> 당연 쓴다음에 읽어야지!
		myOutput(fi); // 저장
		myInput(fi); // 출력
	}

	private static void myOutput(File fi) {

		FileWriter fw = null;

		try {
			
			fw = new FileWriter(fi, true);
			fw.write("연습중입니다.");
			fw.append("abc").append("def\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// FileWriter 를 열었다면 close() 를 해줘야 한다.
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void myInput(File fi) {
		// try() : 나타날 수 있는 에러를 모두 catch 해주네요~

		// try with resource : try(예외가 발생할 수 있는 구문) {명령;} catch(){}...
		// 만일 close() 해줘야 하는 객체가 () 안에 있다면, 자동으로 close();
		try (FileReader fr = new FileReader(fi);) {

			int ch;
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
