package thread.ex02;
/*
 * �����忡�� �����ٸ�(Jvm�� �����忡 cpu�Ҵ��ϴ°�)�� �󵵼���
 * �����ϱ� ���� Priority�� �ڱ�� �ִ�.
 * �⺻������ Normal �켱������ ������ �ִ�.
 */
class Threadp extends Thread{
	private String msg;
	public Threadp(String msg) {
		this.msg = msg;
	}
	public void run() {
		for(int i=0; i<5;i++)
			System.out.println(msg+"("+getPriority()+")");
	}
}
public class PriorityTest {

	public static void main(String[] args) {
		Threadp tp0 = new Threadp("First");
		Threadp tp1 = new Threadp("Second");
		Threadp tp2 = new Threadp("Third");

		tp0.start();
		tp1.start();
		tp2.start();
	}

}