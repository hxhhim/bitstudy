package thread.ex02;

import java.util.Scanner;

//���� �����忡�� ������� �޾Ƽ� �ٸ� �����忡 �Ѱ��ֱ�
//1)�θ𽺷��带 ���� ������ ����(���� ����) O
//2)�� ��ü�� ���� ����(���� ����) X

class ThreadIn extends Thread{
	private String strNews;
	private Scanner sc = new Scanner(System.in);
	public String getStrNews() {
		return strNews;
	}
	public void run() {
		System.out.print("ThreadInput : ������ �Է��ϼ���.:>>");
		strNews = sc.nextLine();
		
	}
}

class ThreadOut extends Thread{
	private String strNews;
	public ThreadOut(String news) {
		strNews = news;
	}
	public void run() {
		System.out.println("Threadout: ���� ������ ������["+strNews+"]�Դϴ�.");
	}
}
public class ThreadInput {

	public static void main(String[] args) {
		ThreadIn ti = new ThreadIn();
		ti.start();
		try {
			ti.join();
			String news = ti.getStrNews();
			System.out.println("main : " + news);
			ThreadOut to = new ThreadOut(news);
			to.start();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
