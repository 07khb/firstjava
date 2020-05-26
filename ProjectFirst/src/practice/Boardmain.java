package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boardmain {
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		List<Board> list = new ArrayList<>();
		
		Boardservice service = new BoardServiceImp();
		while(true) {
		System.out.println("================================");
		System.out.println("1.입력 2.수정 3.삭제 4.리스트 5.종료");
		System.out.println("================================");
		System.out.print("선택>");
		int menu = scr.nextInt(); scr.nextLine();
		if (menu == 1) {
			System.out.print("제목입력 : ");
			String subject = scr.nextLine();
			System.out.print("내용입력 : ");
			String contents = scr.nextLine();
			System.out.print("작성자 입력 : ");
			String wrighter = scr.nextLine();
			Board board = new Board(subject, contents, wrighter);
			service.insertBoard(list, board);
			
			} else if (menu == 2) {
				System.out.print("변경 제목 입력: ");
				String subject = scr.nextLine();
				System.out.print("내용 입력: ");
				String contents = scr.nextLine();
				Board board = new Board(subject, contents, "");
				service.updateBoard(list, board);
			
			} else if (menu ==3) {
				System.out.print("삭제할 제목 입력: ");
				String subject = scr.nextLine();
				service.removeBoard(list, subject);
			
			} else if (menu == 4) {
				service.listBoard(list);

			} else if (menu == 5) {
				System.out.println("종료");
				break;
			}
		}//end while
	}//end main
}
