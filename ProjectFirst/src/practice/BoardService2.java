package practice;



public interface BoardService2 { //인터페이스에는 'abstract'void생략되어있음 추상메소드만 있음
	void insertBoard(Board board);//입력
	void updateBoard(Board board);//수정
	void listBoard();//리스트
	void removeBoard(String subject);//삭제package com.yedam.practice;


}
