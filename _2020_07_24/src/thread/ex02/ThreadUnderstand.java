package thread.ex02;

/*
 * ��� ���μ����� �ݵ�� 1���̻��� �����尡 �����Ѵ�.
 * �⺻ ������ main�޼��带 �����ϴ� �����带 "main ������"��� �Ѵ�.
 * �� ������� java������ jvm�� ���� �ο��ǰ� �����ȴ�.
 * 
 */
//�̰������� �߰��� 2�� �����带 �� ������

//ThreadŬ������ ����� �޾Ƽ� 1�� ��ü�� �����ؼ�
//������ �� ���� �����尡 �Ѱ��� �����.

/*
 * �����尡 ����ɶ��� ��Ȯ�ϰ� ������ ������� �ʰ�
 * ������� ���Ƿ� ����ð��� ���̰� ����� �ȴ�.
 * �׷��� �̷� �κ��� ��Ȯ�ϰ� ó���Ϸ��� ����ȭ �۾��� �ʿ��ϰ� �ȴ�.
 * 
 */
class ShowThread extends Thread{
	String threadName;
	public ShowThread(String name) {
		threadName = name;
	}
	//start()�� ��ü�� �����ϸ�
	//run()�޼��尡 �����忡 ���� ����ȴ�.
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("���Ⱥ����� â���б�"+threadName+""+i);
			try {
				sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(threadName +"���Ͻ����� �ϸ�ħ~~");
	}
}

//�� 3���� ������ ����
//1)main ������
//2)st0 ��ü�� �Ҵ�� �ڽ� ������
//3)st1 ��ü�� �Ҵ�� �ڽ� ������
public class ThreadUnderstand {
	
	static void test(String name) {
		for(int i=0; i<10; i++) {
			System.out.println("test: " +name);
			
		}
	}
	public static void main(String[] args) {
		System.out.println("ȫ�浿 ������ ���� ����...");
		ShowThread st0 = new ShowThread("����");
		ShowThread st1 = new ShowThread("��������");
		ShowThread st2 = new ShowThread("���");
		
		ThreadUnderstand a = new ThreadUnderstand();
//		a.test("����");
//		a.test("��������");
		st0.start();//��������� start�� �����ؾ� ������ ���� /�ڵ����� run()ȣ��
		st1.start();//���������
		st2.start();
		
		try {
			//Thread.sleep(5000);
			st0.join();
			st1.join();
			st2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("ȫ�浿 ������ ����");
	}

}