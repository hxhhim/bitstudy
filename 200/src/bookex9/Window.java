package bookex9;

public class Window {
	Button1 button1 = new Button1();
	Button1 button2 = new Button1();
	
	//�ʵ� �ʱⰪ���� ����
	Button1.OnClickListener listener = new Button1.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
			
		}
	};
	Window(){
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button1.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("�޽����� �����ϴ�.");
				
			}
		});
	}
}
