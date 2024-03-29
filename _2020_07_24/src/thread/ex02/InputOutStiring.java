package thread.ex02;

import java.util.Scanner;

//메인 스레드에서 결과값을 받아서 다른 스레드에 넘겨주기
//1)부모스레드를 통한 데이터 공유(간접 공유) O
//2)힙 객체를 통한 공유(직접 공유) X

class ShareNews{
	public String strNews = null; //공유필필필드
}
class ThreadIn1 extends Thread{
	private Scanner sc = new Scanner(System.in);
	private ShareNews sNews;
	public ThreadIn1(ShareNews sn) {
		this.sNews = sn;
	}
	public void run() {
		System.out.print("뉴스 입력:");
		sNews.strNews = sc.nextLine();
	}
}
class ThreadOut1 extends Thread{
	
	private ShareNews sNews;
	public ThreadOut1(ShareNews sn) {
		this.sNews = sn;
	}
	public void run() {
		System.out.print("도착뉴스:  "+sNews.strNews);
		
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
