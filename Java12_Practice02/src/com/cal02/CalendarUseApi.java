package com.cal02;

import java.util.Calendar;

public class CalendarUseApi {

	public void prn(int year, int month) {
		// singleton patter : 메모리에 객체가 단 한번만 만들어지고, 이후에 다시 호출하면
		// 메모리에 있는 객체가 전달된다.
		// getInstance method returns a Calendar object whose calendar
		// fields have been initialized with the current date and time:
		Calendar cal = Calendar.getInstance();

		
		System.out.printf("\t\t%d년 %d월\n", year, month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");

		// set() : Calendar field 의 연, 월, 일을 셋팅한다.이 경우 사용자에게 Scanner로 입력받은 연, 월을 셋팅한다.

		// year field : 입력받은 연 그대로 입력
		// year field : Calendar 에서 month field 는 실제 1월은 0 2월은 1 ... 으로 셋팅
		// date field : 1일로 셋팅해서 아래 get() 메서드 사용하여 1일의 요일을 구함
		cal.set(year, month - 1, 1);	//2019 11월 1일

		// get() : Returns the value of the given calendar field.
		// calendar field DAY_OF_WEEK : sun(1) mon(2) tue(3) wed(4) thur(5) fri(6) sat(7)		
		int start = cal.get(Calendar.DAY_OF_WEEK);	//11월일 경우 start는 금요일(6)

		//시작 요일 전까지 공백 출력 
		for (int i = 1; i < start; i++) {
			System.out.print("\t");
		}

		//해당 월의 마지막 날까지 날짜 출력
		for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%d\t", i);

			//start 변수가 7의 배수이면 줄바꿈
			if (start % 7 == 0) {
				System.out.println();
			}
			start++;
		}

	}
}
