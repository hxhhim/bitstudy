package ex04;

public class Student {
	String name;	//�̸�
	String age;		//����
	int korscore;	//��������
	int mathscore;	//��������
	int engscore;	//��������
	int sum;
	double avg;
	
	public Student(String name, String age, int korscore,int mathscore,int engscore){
		this.name = name;
		this.age = age;
		this.korscore = korscore;
		this.mathscore = mathscore;
		this.engscore = engscore;
	}
	public void sum() {
		 sum = korscore+mathscore+engscore;
	}
	
	public void avg() {
		avg = (double)sum/3;
	}
	public void basicprint() {
		System.out.println("�⺻�������");
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
	}public void advanceprint() {
		System.out.println("��ü�������");
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
		System.out.println("��������: "+korscore);
		System.out.println("��������: "+mathscore);
		System.out.println("��������: "+engscore);
	}
	
	
	}
	

