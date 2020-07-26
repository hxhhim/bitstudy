package thread.ex02;

class Steal extends Thread{
	private String name;
	public Steal(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0;i<10; i++) {
			System.out.println(name+":������ �ű�� �ִ�.");
			try {
				sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
		System.out.println(name+":������ ��� �Ű��.");
	}
}
class Fence extends Thread{
	private String name;
	public Fence(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(name +":������ �Ȱ� �ִ�.");
			try {
				sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
		System.out.println(name + ":������ ��� �ȾҴ�.");
	}
}
public class RightoutOUtLawTest {

	public static void main(String[] args) {
		System.out.println("������ �� ���� �о��");
		Steal steal = new Steal("����");
		Fence fence = new Fence("��������");
		
		steal.start();
		
		try {
			steal.join();
			System.out.println("�������� �� ������ ��� �Ⱦƶ�");
			fence.start();
			fence.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("ȫ�浿�� ������ ���������� ������ ������.~");
		
		

	}

}
