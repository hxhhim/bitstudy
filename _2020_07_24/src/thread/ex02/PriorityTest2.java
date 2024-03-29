package thread.ex02;
/*
 * 스레드에는 스케줄링(Jvm이 스레드에 cpu할당하는것)의 빈도수를
 * 제어하기 위해 Priority를 자기고 있다.
 * 기본적으로 Normal 우선순위를 가지고 있다.
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
