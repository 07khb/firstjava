package com.yedam.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	static class Member {
		String name;
		int age;
		Member(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
	}
	
	public static void main(String[] args) {
		
		List<Member> members = new ArrayList<>();
		members.add(new Member("Hong", 10));
		members.add(new Member("Hwnag", 11));
		members.add(new Member("Park", 12));
		for(Member mem : members) {
			System.out.println(mem.getName() + " , " + mem.getAge());
		}
		
		List<String> list = new ArrayList<String>();
		list.add("Hello");//0
		list.add("World");//1
		list.add("Hong");//2
		list.add(3, "Hwang");//3

		String str1 = list.get(0);//0번재 불러오기
		list.remove(1);//삭제

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		for(String str : list) {
			System.out.println(str);
		}
	}
}
