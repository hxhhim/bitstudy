package thread.ex03;
/*
 * ������ü�� �����Ѵ�.
 * ������ 2���� �����ϰ� �����忡���� ������ü�� �����Ѵ�.
 * 1���� ������� for������ 1~1000000 1�� ������ü�� ������ ������Ų��.
 * 1���� ������� for������ 1~1000000 1�� ������ü�� ������ ���ҽ�Ų��.
 * main���� ������ü�� ��������� 0�� ���;� �Ѵ�.
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
class ThreadPlus extends Thread{		//������ 2���� ���ļ� �Ű����� �߰��Ͽ� �Ѱ��ǽ������ ��� ����.
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