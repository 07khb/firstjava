package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add(new String("Hello"));
		list.add("World");
		list.add(2, "Hong");
		list.add(2, "Hong"); //중복값도 가능
		list.add(2, "Hwang"); //같은 인덱스에 새로운 값을 입력하면 기존값들은 한칸씩 밑으로 밀림.
		list.set(2, "Park"); //set메소드는 기존 인덱스에 새로운값을 입력시 덮어씌움.
		
		for(String str : list) {
			System.out.println(str.toString());
		}
		
		System.out.println(list.get(1)); //get메소드는 입력값에 위치하는 인덱스의 값을 나타냄.
		
		list.remove(4); //해당위치에 해당하는 인덱스 값 삭제
		System.out.println("after remove(4)");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
//		for(String str : list) {
//			System.out.println(str.toString());
//		}
		
	}
}
