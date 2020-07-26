package thread.ex03;
/*
 * 공유객체를 생성한다.
 * 스레드 2개를 생성하고 스레드에서는 공유객체를 공유한다.
 * 1개의 스레드는 for문으로 1~1000000 1씩 공유객체의 변수를 증가시킨다.
 * 1개의 스레드는 for문으로 1~1000000 1씩 공유객체의 변수를 감소시킨다.
 * main에서 공유객체의 최종결과는 0이 나와야 한다.
 */
class  ShareCnt1{
	
	private int cnt =0;
	public synchronized void pCnt() {
		cnt++;
	}
	public synchronized void mCnt() {
		cnt--;
	}
	public int getCnt() {
		return cnt;
	}
	
}
class ThreadPlus extends Thread{		//스레드 2개를 합쳐서 매개변수 추가하여 한개의스레드로 기능 가능.
	private ShareCnt1 sc;
	boolean sel; 
	public ThreadPlus(ShareCnt1 sc,boolean sel) {
		this.sc = sc;
		this.sel = sel;
	}
	public void run() {
		for(int i=0; i<1000000;i++)
			if(sel)
				sc.pCnt();
			else
				sc.mCnt();
	}
}
//class ThreadMinus extends Thread{
//	private ShareCnt1 sc;
//	public ThreadMinus(ShareCnt1 sc) {
//		this.sc = sc;
//	}
//	public void run() {
//		for(int i=0; i<1000000;i++)
//			sc.mCnt();
//	}
//}


public class ResultZero {

	public static void main(String[] args) throws InterruptedException {
		ShareCnt1 shareCnt = new ShareCnt1();
		ThreadPlus p1 =new ThreadPlus(shareCnt,true);
		ThreadPlus m1 = new ThreadPlus(shareCnt,false);
		
		p1.start();
		m1.start();
		
		p1.join();
		m1.join();
		
		System.out.println(shareCnt.getCnt());
		
	}

}
