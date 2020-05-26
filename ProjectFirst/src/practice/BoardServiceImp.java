package practice;

import java.util.List;

public class BoardServiceImp implements Boardservice {

	@Override
	public void insertBoard(List<Board> list, Board board) {
		list.add(board);
	}

	@Override
	public void updateBoard(List<Board> list, Board board) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSubject().equals(board.getSubject())) {
				list.get(i).setContents(board.getContents());
			}
		}
	}

	@Override
	public void listBoard(List<Board> list) {
		for(Board board : list) {
			System.out.println(board.toString());
		}
	}

	@Override
	public void removeBoard(List<Board> list, String subject) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSubject().equals(subject)) {
				list.remove(i);
			}
		}
	}

}
