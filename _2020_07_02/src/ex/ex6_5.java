package ex;

import java.util.Arrays;
import java.util.Scanner;

public class ex6_5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("�����:");
		int m = sc.nextInt();
		int[] arr = new int[m];
		int sum =0;
		int avg =0;
		for(int i = 0,cnt =1; i<m;i++) {
			System.out.println(cnt+"���� ����:");
			arr[i] =sc.nextInt();
			sum +=arr[i];
			cnt++;
		}
		avg = sum/m;
		Arrays.sort(arr);
		System.out.println("�հ��"+sum+"���Դϴ�.");
		System.out.println("��մ�"+avg+"���Դϴ�.");
		System.out.println("�ְ����� "+arr[m-1]+"�� �Դϴ�");
		System.out.println("�������� "+arr[0]+"�� �Դϴ�.");
		
		
	}

}
