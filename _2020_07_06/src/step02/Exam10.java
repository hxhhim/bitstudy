package step02;

public class Exam10 {

	public static void main(String[] args) {
		//1) ���۷���: �ν��Ͻ� �ּҸ� ����
		Board5 b = null;	//�ν��Ͻ� ���� ���� ��. null ? �ּ� ������ �ʱ�ȭ��ų �� ���
//		b.title = "����"; // ������� �߻�(runtime error) => NullPointerException
						 // �ν��Ͻ� �ּҰ� ���� ���¿��� �ν��Ͻ� ������ ���� �Ҽ� ����.
		b = new Board5();
		b.title = "����";
		
		//2)���۷��� �迭: �迭 ���� ������� �ʱ�
		Board5 b0,b1,b2,b3,b4,b5,b6,b7;
		b0 = new Board5();
		b1 = new Board5();
		b2 = new Board5();
		
		Board5[] arr = new Board5[5];
		
		for(int i= 0; i<arr.length ; i++)
			arr[i] = new Board5();
	
		arr[1].printInfo();
		arr[1].no = 5000;
		arr[1].printInfo();
	}
	
}
