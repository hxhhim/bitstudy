package ex;

import java.util.Random;

public class ex6_7 {

	public static void main(String[] args) {
		int[] kor= new int[6];
		int[] num= new int[6];
		int[] add= new int[6];
		int sumk=0;
		int sumn=0;
		Random rd = new Random();
		
		for(int i=0; i<kor.length;i++) {
			kor[i] = rd.nextInt(100)+1;
			num[i] = rd.nextInt(100)+1;
			sumk+=kor[i];
			sumn+=num[i];
			add[i]=kor[i]+num[i];
			System.out.printf("%d�� ����:%d\n",i+1,kor[i]);
			System.out.println("     ����:"+num[i]);
		}
		
		
		
		System.out.println("no. "+" ���� "+" ���� "+"   ���");
		for(int i=0; i<kor.length;i++) {
			
			System.out.printf("%d    %d   %d   %.1f\n",i+1,kor[i],num[i],(float)add[i]/2);
		}
			System.out.printf("��� %.1f  %.1f ",(float)sumk/kor.length,(float)sumn/num.length);
		
	}

}
