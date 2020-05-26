package com.yedam.collection.set;

import java.util.HashSet;
import java.util.Set;

class Member {
	String name;
	int age;

	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return this.name + ", " + this.age;
	}
	@Override
	public int hashCode()  {//hashCode: 객체마다 가지고 있는 고유한 값
		return this.age;
	}
	@Override
	public boolean equals(Object obj) {
		Member mem = (Member) obj;
		return this.name.equals(mem.name);
	}
	
	
	
}

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> members = new HashSet<Member>();
		members.add(new Member("Hong", 10));
		members.add(new Member("Hong", 20));
		members.add(new Member("Hong", 10));
		
		for(Member member : members) {
			System.out.println(member.toString());
		}
		
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Hello"); // 중복된값은 덮어씌움

		for (String str : set) {
			System.out.println(str.toString());
		}
	}
}
