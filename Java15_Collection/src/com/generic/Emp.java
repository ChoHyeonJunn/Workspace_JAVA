package com.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * <T> : Type
 * <E> : Element
 * <K> : Key
 * <V> : Value
 */
public class Emp<T> {

//	/*
//	 * <> : generic -> collection 안에 들어가는 값의 타입을 강제한다. -> 만약 타입이 여러가지 종류일 경우 sort() 등의 메서드에서 의도치 않은 오류가 발생할 수 있습니다.
//	 */
//	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();
//		//list.add("1");
//		list.add(2);
//		//list.add('c');
//		list.add(null);
//		list.add(3);
//		
//		System.out.println(list);
//
//		Collections.sort(list);
//		System.out.println(list);	
//	}

	private T empno;
	private String ename;

	public Emp() {

	}

	public Emp(T empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}

	public T getEmpno() {
		return empno;
	}

	public void setEmpno(T empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + empno + "] " + ename;
	}
}
