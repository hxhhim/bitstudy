package step02.ex01;

public class Ex_print {
	
	
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		
		
		System.out.println("������͸� ����Ͻðڽ��ϱ�?(1.��ũ��)(2.������)");
		String sel = sc.nextLine();
		switch(sel) {
		case "1":
			Inkjet prin = new Inkjet();
			prin.printerinput();
					
			while(true) {
				prin.print();
				if(prin.prompt())
					break;
			}
			break;
			
		case "2":
			Laser prin1 = new Laser();
			prin1.printerinput();
				
			while(true) {
				prin1.print();
				if(prin1.prompt())
					break;
			}break;
		}
		
	}
}


