package test;
import java.util.Scanner;

//Ű����� 5���� ������� �Է¹޾� �迭�� �����ϰ� �迭�� �߿��� �ִ밪�� �ּҰ��� ���ϴ� 
//���α׷��� �ۼ��Ͻÿ�.

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int[] arr= new int[5]; 		
		for(int i=0;i<5;i++) {
			while(true) {
				System.out.println("�������� �Է��ϼ���:");
				num = Integer.parseInt(sc.nextLine());
				if(num<=0) {
					System.out.println("���� �������� �Է����ּ���.");
				}else {
					break;
				}
			}
			arr[i]=num;
		}
		System.out.print("�Էµ� 5���� ���� [");
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]);
			if(i==4) {
				break;
			}
			System.out.print(",");
		}
		System.out.print("]�Դϴ�.");
		//�ΰ��� ���Ͽ� ù��° ���� ũ�� ��ġ�� �ٲٰ� ��ü�迭�� ���� �ݺ��Ѵ�.
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
		System.out.println("�ִ밪��: "+arr[4]+"�Դϴ�.");
		System.out.println("�ּҰ���: "+arr[0]+"�Դϴ�.");
	}

}
