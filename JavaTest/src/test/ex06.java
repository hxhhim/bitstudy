package test;
import java.util.Scanner;

//�л��̸�, ����, ����, ���� ���� 5���� ���� �Է¹޾� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�л� Ŭ������ ���� �̸�, ����, ���� , ���� ������ �Է¹ް� ��������� ���Ѵ�.
//��� ������ ������ ����ؼ� 

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		student[] st = new student[5];
		float [] score = new float[5];
		System.out.println("5���� �л������� �Է����ּ���.");
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+"��° �л� ������ �Է��ϼ���:");
			System.out.println((i+1)+"��° �л��� �̸��� �Է��ϼ���.");
			String name = sc.nextLine();
			System.out.println((i+1)+"��° �л��� ������� �Է��ϼ���.");
			int kor = Integer.parseInt(sc.nextLine());
			System.out.println((i+1)+"��° �л��� ������� �Է��ϼ���.");
			int eng = Integer.parseInt(sc.nextLine());
			System.out.println((i+1)+"��° �л��� ���м����� �Է��ϼ���.");
			int math = Integer.parseInt(sc.nextLine());
			student st1 = new student(name,kor,eng,math);
			st[i]=st1;
		}
		
		for(int i=0;i<5;i++) {
			score[i] = st[i].avr;
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				if(score[j]>score[j+1]) {
					float temp;
					temp = score[j];
					score[j]=score[j+1];
					score[j+1]=temp;
				}
			}
		}int j=5;
		for(int i=0;i<5;i++) {
			for(int k=0;k<5;k++) {
			if((st[k].avr)==(score[i])) {
				st[k].rank=j;
				j--;
				break;
			}
				
			}
		}
		for(student s: st) {
			System.out.println(s);
		}
//		for(float s: score) {
//			System.out.println(s);
//		}
		
		

	}

}
