package step02.ex01;

public class Laser extends Printer {
	int toner = 100;
public void print() {
		
		System.out.println("출력할내용을 입력해주세요:");
		String text = sc.nextLine();
		System.out.println("몇장 출력할까요?:");
		int p = Integer.parseInt(sc.nextLine());
		for(int i=0;i<p;i++) {
			System.out.println(text);
			printingNo++;
			paper--;
			toner--;
		}
		System.out.println("출력을 완료했습니다.");
		System.out.println("인쇄매수는:"+printingNo+"매 입니다.")	;
		System.out.println("남은 인쇄용지는:"+paper+"매 입니다.")	;
		System.out.println("남은 잉크량:"+toner+"퍼센트입니다.")	;
}
}
