package step01;

public class Exam04 {
	// Ŭ������ �ε��� �� �޸�(Method Area)�� �غ��϶�� ���
	static int s1 = 10;
	static int s2 = 20;
	//new ����� ������ �� �޸�(Heap)�� �غ��϶�� ���
	int i1 = 100;
	
	//Ŭ���� �ε��� �Ϸ�(����ƽ ������ �غ�Ǿ���)�� �� �����϶�� ���
	static {
		System.out.println("Exam04 �ε���");
	}
	
	public static void main(String[] args) {
		//���ú���: �޼��尡 ȣ��� �� �޸�(Stack)�� �غ��ϴ� ���
		int l1 = 100;
		int l2 = 200;
		System.out.println("���� ���� �� ���� �Ϸ�!");
		
		Exam04 r1 = new Exam04();//Exam04 Ŭ������ ����� instance ������ Heap�� �غ��϶�.
		Exam04 r2 = new Exam04();
		System.out.println("�ν��Ͻ� ���� �Ϸ�!");
		
		r1.i1 = Other1.v2;
		r2.i1 = Other1.v2;
		System.out.println("�ν��Ͻ� ������ �� ����Ϸ�!");
		
		System.out.printf("Exam04.s1 = %d\n", Exam04.s1);
		System.out.printf("Exam04.s2 = %d\n", Exam04.s2);
		System.out.printf("Other1.v1 = %d\n", Other1.v1);
		System.out.printf("Other1.v2 = %d\n", Other1.v2);
		System.out.printf("l1 = %d\n", l1);
		System.out.printf("l2 = %d\n", l2);
		System.out.printf("r1.i1 = %d\n", r1.i1);
		System.out.printf("r2.i1 = %d\n", r2.i1);
		System.out.printf("r1.s1 = %d\n", r1.s1);
		System.out.printf("r2.s1 = %d\n", r2.s1);
		r1.s1 = 5000;
		System.out.printf("r1.s1 = %d\n", r1.s1);
		System.out.printf("r2.s1 = %d\n", r2.s1);
		
	}

}
/* #Ŭ���� �ε�����
 * - Ŭ������ ���Ǵ� ������ �ε��ȴ�.
 * - Ŭ�����´� �� ���� �ε��ȴ�.
 * 
 * #static ����
 * -Ŭ���� �ε��ɶ� �غ�ȴ�.
 * =JVM ������ ������ �����ȴ�.
 * -Method Area ������ �غ�ȴ�.
 * 
 * #instance ����
 * - new ����� ���� �غ�ȴ�.
 * - ������ �÷��Ϳ� ���� �����ȴ�.
 * - Heap ������ �غ�ȴ�.
 * 
 * #local ����
 * - �޼��尡 ȣ��ɶ� �غ�ȴ�.
 * - �޼��尡 ȣ���� ������ �����ȴ�.
 * - JVM Stack ������ �غ�ȴ�.
 */
 