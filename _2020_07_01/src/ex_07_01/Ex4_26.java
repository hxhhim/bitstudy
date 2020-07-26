package ex_07_01;

public class Ex4_26 {

	public static void main(String[] args) {
		java.util.Scanner stdln = new java.util.Scanner(System.in);
		System.out.println("정수를 더 합니다.");
		System.out.print("몇개를 더할까요?:");
		
		int n = stdln.nextInt();
		int sum = 0;
		int i;
		for(i =0;i<n;i++) {		//입력받은 n번동안 반복
			System.out.print("정수(0으로 종료):");
				int t = stdln.nextInt();
				if(t==0)break;  //0을 입력받으면 종료
				sum += t;
		}
		System.out.println("합계는 "+ sum +"입니다.");
		if(i!=0)
			System.out.println("평균은"+ sum/i +"입니다.");
	}

}
