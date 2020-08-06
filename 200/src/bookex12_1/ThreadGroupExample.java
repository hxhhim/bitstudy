package bookex12_1;

public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main ������ �׷��� list() �޼ҵ� ��³��� ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println();
		
		try {Thread.sleep(3000);} catch(InterruptedException e) {}
		
		System.out.println("[ myGroup ������ �׷��� interrup() �޼ҵ� ȣ��]");
		myGroup.interrupt();
		

	}

}