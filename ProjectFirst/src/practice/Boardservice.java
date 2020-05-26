package practice;

import java.util.List;

public interface Boardservice { //인터페이스에는 'abstract'void생략되어있음 추상메소드만 있음
	void insertBoard(List<Board> list, Board board);//입력
	void updateBoard(List<Board> list, Board board);//수정
	void listBoard(List<Board> list);//리스트
	void removeBoard(List<Board> list, String subject);//삭제
}
