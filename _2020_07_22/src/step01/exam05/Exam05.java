package step01.exam05;

public class Exam05 {

	public static void main(String[] args) {
		try {
			work3();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	//���������� ó���ؼ��� �ȵǴ� ���
	//�׷��� �����ϱ� ���� �ӽ� ó���ؾ� �ϴ� ���,
	//�׷� ��� try~catch ~�� ����Ͽ� ���������� ó���� �� 
	//ȣ���ڿ��� �����ϴ� ����� ���Ѵ�.
	static void work3() throws Exception{
		try {
			throw new Exception("�ͼ��� �߻�");
		}catch(Exception e) {
			System.out.println("�ͼ��� �߰�ó��");
			throw e;
		}
	}

}
