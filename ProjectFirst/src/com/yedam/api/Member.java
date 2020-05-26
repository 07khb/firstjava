package com.yedam.api;

public class Member { //extends Object -> 따로 지정안되있을시 기본값 
	public String id;
	public Member() {
		//기본생성자
		
	}
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
//		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Member m = (Member) obj; //강제형변환 obj파일을 Member m 형식으로 바꾸겠다.
		return this.id.equals(m.id);
//		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "id값은" + this.id;
//		return super.toString();
	}
	
	
}
