package step01.exam05;

public class Exam03 {

	public static void main(String[] args) {
		
		try {
			work1();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("main end");
	}
	//���������� ó���ص� ������ ���� ������ ���
	//ȣ���ڿ��� �����ϴ� ��ĺ��� ��ü������ ó���ϴ� ���� �� ����.
	static void work1() {
		try {
			throw new Exception("�ͼ��� �߻�");//���ܹ߻�!
		}catch(Exception e) {
			System.out.println(e);	//��ü������ ó��. ȣ���ڴ� �𸥴�.
		}
	}

}