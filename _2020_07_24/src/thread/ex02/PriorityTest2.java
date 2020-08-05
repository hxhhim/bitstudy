package thread.ex02;
/*
 * �����忡�� �����ٸ�(Jvm�� �����忡 cpu�Ҵ��ϴ°�)�� �󵵼���
 * �����ϱ� ���� Priority�� �ڱ�� �ִ�.
 * �⺻������ Normal �켱������ ������ �ִ�.
 */
class Threadp2 extends Thread{
	private String msg;
	public Threadp2(String msg,int prio) {
		this.msg = msg;
		setPriority(prio);
	}
	public void run() {
		for(int i=0; i<100;i++)
			System.out.println(msg+"("+getPriority()+")");
	}
}
public class PriorityTest2 {

	public static void main(String[] args) {
		Threadp2 tp0 = new Threadp2("First",Thread.MAX_PRIORITY);
		Threadp2 tp1 = new Threadp2("Second",Thread.NORM_PRIORITY);
		Threadp2 tp2 = new Threadp2("Third",Thread.MIN_PRIORITY);

		tp0.start();
		tp1.start();
		tp2.start();
	}

}