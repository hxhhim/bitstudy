package bookex9;

public class Window {
	Button1 button1 = new Button1();
	Button1 button2 = new Button1();
	
	//필드 초기값으로 대입
	Button1.OnClickListener listener = new Button1.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
			
		}
	};
	Window(){
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button1.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
				
			}
		});
	}
}
