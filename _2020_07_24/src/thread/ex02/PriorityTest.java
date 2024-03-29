package thread.ex02;
/*
 * 스레드에는 스케줄링(Jvm이 스레드에 cpu할당하는것)의 빈도수를
 * 제어하기 위해 Priority를 자기고 있다.
 * 기본적으로 Normal 우선순위를 가지고 있다.
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
