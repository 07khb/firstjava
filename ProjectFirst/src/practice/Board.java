package practice;


public class Board {
	private String subject;
	private String contents;
	private String writer;
	
	public Board (String subject, String contents, String writer) {
		this.subject = subject;
		this.contents = contents;
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "제목: " + subject + ", 내용: " + contents + ", 작성자: " + writer ;
	}
	
	
}
