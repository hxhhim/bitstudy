package ex04;

/*
 * 사용자가 0을 입력하기 전까지 정수를 입력해서 출력하는
 * 메서드를 정의하고 사용하세요
 * void printInputNums();
 	//사용자에게 정수 입력
	//입력받은 정수 출력
	//0입력받기 전까지 반복

 */

public class Basic01 {
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	
	public static void main(String[] args) {
	
		printInputNums();
	
	}
	public static void printInputNums() {
		while(true) {
			System.out.println("정수를 입력하세요.");
			int num = sc.nextInt();
			if(num==0) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			System.out.println("입력한정수:"+num);
			
	}
   }
}
