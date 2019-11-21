package com.game;

public class Print {

	   static String START = "[[[[지뢰찾기 게임]]]]";
	   static String BYE = "수고하셨습니다~!";

	   private static String[][] printArr;
	   private static String[][] original;

	   static void makePrintArr(String[][] originalArr) {

	      original = originalArr;

	      int size = original.length;
	      printArr = new String[size][size];

	      for (int i = 0; i < printArr.length; i++) {

	         for (int j = 0; j < printArr[i].length; j++) {

	            printArr[i][j] = "■";
	         }
	      }
	   }

	   static String input(int x, int y) {

	      int transX = printArr.length - 1 - x;
	      printArr[transX][y] = original[transX][y];
	      
	      prn();
	      
	      return printArr[transX][y];
	   }
	   
	   static void prn() {
	      
	      for (int i = 0; i < printArr.length; i++) {

	         for (int j = 0; j < printArr[i].length; j++) {

	            System.out.println(printArr[i][j]);
	         }
	         
	         System.out.println();
	      }
	   }
	}