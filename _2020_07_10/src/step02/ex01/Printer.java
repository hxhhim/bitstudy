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
		
		System.out.println("출력할내용을 입력해주세요:");
		String text = sc.nextLine();
		System.out.println("몇장 출력할까요?:");
		int p = Integer.parseInt(sc.nextLine());
		for(int i=0;i<p;i++) {
			System.out.println(text);
			printingNo++;
			paper--;
		}
		System.out.println("출력을 완료했습니다.");
		System.out.println("인쇄매수는:"+printingNo+"매 입니다.")	;
		System.out.println("남은 인쇄용지는:"+paper+"매 입니다.")	;
	}
	public void printerinput() {
		Printer printer = new Printer();
		System.out.println("프린터 정보입력을 시작합니다.");
		System.out.println("프린터 모델명을 입력해주세요.");
		this.modelNo = sc.nextLine();
		System.out.println("제조사명을 입력해주세요.");
		this.company= sc.nextLine();
		System.out.println("입력단자 종류를 입력해주세요.");
		this.type= sc.nextLine();
		printerNo++;
		printers[i++] = printer;

	}
	public void printerInfo() {
		for(int i =0;i<printers.length;i++) {
		System.out.printf("프린터 넘버: %d\n", printers[i].printerNo);
		System.out.printf("프린터 모델명: %s\n",printers[i].modelNo);
		System.out.printf("프린터 제조사: %s\n",printers[i].company);
		System.out.printf("입력단자종류: %s\n",printers[i].type);
		System.out.printf("인쇄매수: %d\n",printers[i].printingNo);
	  }
	}	
	boolean prompt() {
		System.out.print("계속입력하시겠습니까?(y/n)");
		String answer = sc.nextLine();
		if(answer.equals("n"))
			return true;
		return false;
    }
	
}
