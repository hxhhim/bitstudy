package ex04;

import java.util.Scanner;

/*
  StudentŬ������ �����ϰ� ����մϴ�
   �� Ŭ������ �ʵ�� �̸��� ����, ����, ����, ����
   ������ �����ϴ�
   �޼���� �ʵ带 �ʱ�ȭ�ϱ� ���� ������
            �⺻���� ���(�̸��� ����)
			��ü���� ���(��ü �ʵ�)
			���� ���
			��� ���
    �̷��� �����մϴ�.

 */
public class Basic03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�л����� �Է�
				
		System.out.println("�л��̸��� �Է����ּ���.");
		String name = sc.nextLine();
		System.out.println("������ �Է����ּ���.");
		String age = sc.nextLine();
		System.out.println("���������� �Է����ּ���.");
		int korscore = Integer.parseInt(sc.nextLine());
		System.out.println("���������� �Է����ּ���.");
		int mathscore = Integer.parseInt(sc.nextLine());
		System.out.println("���������� �Է����ּ���.");
		int engscore = Integer.parseInt(sc.nextLine());
		Student student = new Student(name,age,korscore,mathscore,engscore);
		
		
		student.sum();
		student.avg();
		
		student.basicprint();
		System.out.println("----------------");
		student.advanceprint();
		
		
		System.out.println("����: "+student.sum+"�Դϴ�.");
		System.out.printf("���: %.2f �Դϴ�.",student.avg);
		
		//
		//�⺻���(�̸�,����)
		//��ü�������(��ü�ʵ�)����,���
		
		
	}

}
