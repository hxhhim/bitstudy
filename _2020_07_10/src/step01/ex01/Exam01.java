package step01.ex01;

public class Exam01 {
	public static void main(String[] args) {
		SUV r = new SUV();
		
		System.out.printf("cc = %d\n",r.cc);
		System.out.printf("maker = %s\n",r.maker);
		System.out.printf("rpm = %f\n",r.rpm);
		System.out.printf("capacity = %d\n", r.capacity);
		System.out.printf("weight =%d\n ",  r.weight);
		
	}
}

/*
 * �ν��Ͻ� ���� �غ� ����: new SUV();
 * 1)���� Ŭ������ ���赵�� �����Ͽ� �ν��Ͻ� ������ �غ��Ѵ�.
 *   ��� ������ 0���� �ʱ�ȭ �ȴ�.
 *   boolean(false),���۷���(null),����(0),�ε��Ҽ���(0.0), ����(0, /u0000)
 * 2)�ʱ�ȭ��(���� ���� ���Ե� �Ҵ繮)����
 *  =>cc(0),maker(null),capacity(20),weight(800),
 * 3)������ ����
 *  =>cc(100),maker("����"),capacity(4),weight(1200)
 */
