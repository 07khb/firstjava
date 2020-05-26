package com.yedam.api.string;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException { //throws IOException=>try catch와 비슷;;
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes); //키보드에서 입력한 내용을 매개값으로 주어진 바이트 배열에 저장, 읽은 바이트 수를 리턴(Hello+엔터)
		
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}
}
