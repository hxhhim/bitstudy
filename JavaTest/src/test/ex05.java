package test;
import java.util.Scanner;

//키보드로 5개의 양수값을 입력받아 배열에 저장하고 배열값 중에서 최대값과 최소값을 구하는 
//프로그램을 작성하시오.

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int[] arr= new int[5]; 		
		for(int i=0;i<5;i++) {
			while(true) {
				System.out.println("정수값을 입력하세요:");
				num = Integer.parseInt(sc.nextLine());
				if(num<=0) {
					System.out.println("양의 정수값을 입력해주세요.");
				}else {
					break;
				}
			}
			arr[i]=num;
		}
		System.out.print("입력된 5개의 값은 [");
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]);
			if(i==4) {
				break;
			}
			System.out.print(",");
		}
		System.out.print("]입니다.");
		//두값을 비교하여 첫번째 값이 크면 위치를 바꾸고 전체배열에 대해 반복한다.
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				if(arr[j]>arr[j+1]) {
					int temp;
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println();
//		for(int a :arr) {
//			System.out.print(a+",");
//		}
		System.out.println("최대값은: "+arr[4]+"입니다.");
		System.out.println("최소값은: "+arr[0]+"입니다.");
	}

}
