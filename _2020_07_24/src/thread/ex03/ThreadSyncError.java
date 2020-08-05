package thread.ex03;
/*
 * ������鰣�� ������ Ŭ���� ����
 * �ݺ����� �ݺ�Ƚ���� ������ ����
 * 
 */
class ShareCnt{
	private int cnt=0;
	public void increment() {
		synchronized(this){//cnt�� ����ȭ ��ų�� synchronized(this){}�� ���Ѵ�.
		cnt++;
		}
	}
	public int getCnt() {
		return cnt;
	}
}

class ThreadLoop extends Thread{
	private ShareCnt sc;
	public ThreadLoop(ShareCnt sc) {
		this.sc = sc;
	}
	public void run() {
		for(int i=0;i<1000000;i++)
			sc.increment();
	}
}
//class CNT{
//	static private int cnt=0;
//	public  void increment() {//
//		cnt++;
//	}
//	public int getCnt() {
//		return cnt;
//	}
//}
public class ThreadSyncError {

	public static void main(String[] args) {
//		int result =0;
//		
//		CNT a = new CNT();
//		CNT b = new CNT();
//		CNT c = new CNT();
//		
//		
//		for(int i=0;i<1000000;i++)
//			a.increment();
//		for(int i=0;i<1000000;i++)
//			b.increment();
//		for(int i=0;i<1000000;i++)
//			c.increment();
//		
//		result = a.getCnt();
//		System.out.println("result: "+result);
		
		ShareCnt shareCnt = new ShareCnt();
		ThreadLoop t1 = new ThreadLoop(shareCnt);
		ThreadLoop t2 = new ThreadLoop(shareCnt);
		ThreadLoop t3 = new ThreadLoop(shareCnt);
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			System.out.println(shareCnt.getCnt());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}