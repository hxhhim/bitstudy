package thread.ex02;
/*
 * java���� �����带 ����ϴ� Ŭ������ ���ٴ� 2���� ���
 * 1)Thread Ŭ������ ����Ѵ�.
 * 2)Runnable �������̽��� ����ϰ�
 * 	  ��ü�� Thread�� ���ڷ� �Ѱ��ش�.
 * 
 * 	2���� ����� �����ϴ� ����
 * 	java�� Ŭ������ ���� ����̱� ������
 * 	�̹� �ٸ� Ŭ������ ��ӹ��� Ŭ������
 * 	�����带 �����Ϸ���
 * 	Thread�� ��ӹ����� ����
 * 	��� Runnable�� ��ӽ��Ѽ� ����ϰ� �Ѵ�.
 */
class A{
	
}
class Ste extends A implements Runnable{
	private String name;
	public Ste(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(name);
		}
	}
}
class St implements Runnable{
	private String name;
	public St(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(name);
		}
	}
}
class Fe implements Runnable{
	private String name;
	public Fe(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(name);
		}
	}
}
public class Runn {

	public static void main(String[] args) {
		St steal = new St("steal");
		Fe fence = new Fe("fence");
		Ste ste = new Ste("����");
		Thread thMasook = new Thread(steal);
		Thread thChaDol = new Thread(fence);
		Thread thSte = new Thread(ste);
		thMasook.start();
		try {
			thMasook.join();
			System.out.println("steal end");
			thChaDol.start();
			thChaDol.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}