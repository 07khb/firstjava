package com.yedam.classes.arrays;

public class Member implements Comparable<Member> { //Comparable들어가면 compareTo추상 메소드가 있음
	String name;
	Member(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Member o) {  //compareTo A와B가 같으면 0, A가B보다 크면 1, B가A보다 크면 -1
		return name.compareTo(o.name);
	}
}
