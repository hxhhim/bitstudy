package step02.ex01;

public class Laser extends Printer {
	int toner = 100;
public void print() {
		
		System.out.println("����ҳ����� �Է����ּ���:");
		String text = sc.nextLine();
		System.out.println("���� ����ұ��?:");
		int p = Integer.parseInt(sc.nextLine());
		for(int i=0;i<p;i++) {
			System.out.println(text);
			printingNo++;
			paper--;
			toner--;
		}
		System.out.println("����� �Ϸ��߽��ϴ�.");
		System.out.println("�μ�ż���:"+printingNo+"�� �Դϴ�.")	;
		System.out.println("���� �μ������:"+paper+"�� �Դϴ�.")	;
		System.out.println("���� ��ũ��:"+toner+"�ۼ�Ʈ�Դϴ�.")	;
}
}
