package step02.ex01;

public class Printer {

	java.util.Scanner sc = new java.util.Scanner(System.in);
	Printer[] printers = new Printer[10];
	
	static int printerNo;
	String modelNo;
	String company;
	String type;
	static int printingNo = 0;
	static int paper = 100;
	
	int i =0;
	
	public void print() {
		
		System.out.println("����ҳ����� �Է����ּ���:");
		String text = sc.nextLine();
		System.out.println("���� ����ұ��?:");
		int p = Integer.parseInt(sc.nextLine());
		for(int i=0;i<p;i++) {
			System.out.println(text);
			printingNo++;
			paper--;
		}
		System.out.println("����� �Ϸ��߽��ϴ�.");
		System.out.println("�μ�ż���:"+printingNo+"�� �Դϴ�.")	;
		System.out.println("���� �μ������:"+paper+"�� �Դϴ�.")	;
	}
	public void printerinput() {
		Printer printer = new Printer();
		System.out.println("������ �����Է��� �����մϴ�.");
		System.out.println("������ �𵨸��� �Է����ּ���.");
		this.modelNo = sc.nextLine();
		System.out.println("��������� �Է����ּ���.");
		this.company= sc.nextLine();
		System.out.println("�Է´��� ������ �Է����ּ���.");
		this.type= sc.nextLine();
		printerNo++;
		printers[i++] = printer;

	}
	public void printerInfo() {
		for(int i =0;i<printers.length;i++) {
		System.out.printf("������ �ѹ�: %d\n", printers[i].printerNo);
		System.out.printf("������ �𵨸�: %s\n",printers[i].modelNo);
		System.out.printf("������ ������: %s\n",printers[i].company);
		System.out.printf("�Է´�������: %s\n",printers[i].type);
		System.out.printf("�μ�ż�: %d\n",printers[i].printingNo);
	  }
	}	
	boolean prompt() {
		System.out.print("����Է��Ͻðڽ��ϱ�?(y/n)");
		String answer = sc.nextLine();
		if(answer.equals("n"))
			return true;
		return false;
    }
	
}
