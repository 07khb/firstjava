package nestedInterfaces;
       //클래스이름
class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
	
}
class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("문자를 보냅니다.");
	}
	
}
public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button(); //인스턴스 
		
//		CallListener cListener = new CallListener();
//		btn.setOnClickListener(cListener); 이렇게 지정해도 가능
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		MessageListener mListener = new MessageListener();
		btn.setOnClickListener(mListener);
		btn.touch();
	}
}
