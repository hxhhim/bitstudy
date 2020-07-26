
public class Ex4_14 {

	public static void main(String[] args) {
		//1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int)(Math.random()*100)+1;
		int input =0;
		int count =0;
		
		//화면으로부터 사용자입력을 받기위해서 Scanner 클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요:");
			input = s.nextInt();
			
			if(answer>input) {
				System.out.println("더 큰수를 입력하세요.");
			}else if(answer<input) {
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는"+count+"입니다.");
				break;
			}
		}while(true);

	}

}
