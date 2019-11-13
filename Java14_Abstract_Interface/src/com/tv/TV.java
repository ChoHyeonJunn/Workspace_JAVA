package com.tv;

public interface TV {

	int volumeUp();
	int volumeDown();
	
	/*
	 * TV를 상속받는 SamsungTV 와 LgTV 를 만들자.
	 * SamsungTV 는 volumeUp/Down 시 크기가 +-2 씩
	 * LgTV 는 volumeUp/Down 시 크기가 +-3 씩 증감한다.
	 * 
	 * SamsungTV와 LgTV에서 volume 이라는 field 를 만들고,
	 * 위의 기능을 하도록 코드를 작성하자.
	 * (getter & setter 도 생성)
	 */
}
