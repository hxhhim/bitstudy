package thread.ex02;
/*
 * 2개의 스레드를 만든다.
 * 1번째 스레드는 1~50까지의 합을 계산
 * 2번째 스레더는 51~100까지 합을 계산
 * main 스레드는 계산이 끝나고 2개의 총합을 화면에 출력
 */

class ShareSum{
	private int sum = 0;
	
	public int getSum() {
		return sum;
	}
	public synchronized void setAddsum(int n) {
		sum += n;
	}
}

class SThread extends Thread{
//	private int sum;
	private ShareSum sSum;
	private int startNum;
	private int endNum;
	public SThread(ShareSum sSum,int startNum, int endNum) {
		this.sSum = sSum;
		this.startNum = startNum;
		this.endNum = endNum;
		
	}
	public void run() {
		for(int i=startNum;i<=endNum;i++)
			sSum.setAddsum(i);
	}
}

public class ThreadSum {

	public static void main(String[] args) throws InterruptedException {
		ShareSum sSum = new ShareSum();
		SThread ts0 = new SThread(sSum,1,3000);
		SThread ts1 = new SThread(sSum,3001,4000);
		SThread ts2 = new SThread(sSum,4001,10000);
		int sum;
		ts0.start();
		ts1.start();
		ts2.start();
		
		ts0.join();
		ts1.join();
		ts2.join();
		
		System.out.println(sSum.getSum());

	}

}
