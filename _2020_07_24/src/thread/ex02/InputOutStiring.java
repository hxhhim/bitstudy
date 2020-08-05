package thread.ex02;

import java.util.Scanner;

//���� �����忡�� ������� �޾Ƽ� �ٸ� �����忡 �Ѱ��ֱ�
//1)�θ𽺷��带 ���� ������ ����(���� ����) O
//2)�� ��ü�� ���� ����(���� ����) X

class ShareNews{
	public String strNews = null; //���������ʵ�
}
class ThreadIn1 extends Thread{
	private Scanner sc = new Scanner(System.in);
	private ShareNews sNews;
	public ThreadIn1(ShareNews sn) {
		this.sNews = sn;
	}
	public void run() {
		System.out.print("���� �Է�:");
		sNews.strNews = sc.nextLine();
	}
}
class ThreadOut1 extends Thread{
	
	private ShareNews sNews;
	public ThreadOut1(ShareNews sn) {
		this.sNews = sn;
	}
	public void run() {
		System.out.print("��������:  "+sNews.strNews);
		
	}
}
public class InputOutStiring {

	public static void main(String[] args) throws InterruptedException {
		ShareNews sNews = new ShareNews();
		ThreadIn1 ti = new ThreadIn1(sNews);
		ThreadOut1 to = new ThreadOut1(sNews);
		ti.start();
		ti.join();
		to.start();
	}

}