package com.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mtest02 {

	public static void main(String[] args) {
		File fi = new File("a.txt"); // 프로젝트 폴더 안에 생성됩니다~!

		try {
			myOutput(fi);
			myInput(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void myInput(File fi) throws IOException {
		// read() 컴퓨터에서 화면으로 읽어온다

		FileReader fr = new FileReader(fi); // FileNotFoundException

		int ch;

		// fr.read() -> IOException 이게 FileNotFoundException 보다 상위개체라
		// throws 에 IOException만 나타납니다.
		while ((ch = fr.read()) != -1) {
			// read()
			// Returns:
			// The character read, as an integer in the range 0 to 65535 (0x00-0xffff), or
			// -1 if the end of the stream has been reached
			System.out.print((char) ch); // Character 로 형변환해서 출력!
		}

		fr.close();
	}

	// throws는 예외를 이전 호출 위치로 넘겨버린다. (main() 에서 호출한 곳으로)
	private static void myOutput(File fi) throws IOException {
		// write() 화면에서 컴퓨터로 쓴다

		FileWriter fw = new FileWriter(fi, true); // (fi, boolean) -> false면 덮어씀 / true면 이어서 계속 씀

		fw.write("연습중입니다. \n"); // 리턴값이 없어서 메소드 체이닝 불가능
		// Parameters:
		// str - String to be written
		// Returns:
		// void

		fw.append("abc\n").append("def\n").append("ghi\n"); // 메소드 체이닝 가능
		// Parameters:
		// csq - The character sequence to append. If csq is null, then the four
		// characters "null" are appended to this writer.
		// Returns:
		// This writer

		fw.close();
	}

}
