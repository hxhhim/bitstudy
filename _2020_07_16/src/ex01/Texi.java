package ex01;

public class Texi extends MyCarAdapter {
	@Override
	public void run() {
		System.out.println("택시 운행을 시작....");
	}
	@Override
	public void start() {
		System.out.println("택시시동건다....");

	}
	@Override
	public void stop() {
		System.out.println("목적지에 도착....");

	}
}
