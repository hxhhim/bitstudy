/*
 * private : 클래스멤버만 접근 가능
 * (default) : 클래스멤버+같은 패키지의 클래스
 * protected : 클래스 멤버+같은 패키지의 클래스+자식 클래스
 */
package step01.exam03;

public class C {
	private int v1;
	protected int v2;
	protected int v3;
	public int v4;
	
	public void m() {
		v1 = 10;
		v2 = 20;
		v3 = 30;
		v4 = 50;
	}
	private void setv1(int v1) {
		this.v1 =v1;
	}
	public void setv1_1(int v1) {
		setv1(v1);
	}
}
class F{
	public void dm() {
	C c = new C();
	c.v2 = 10;
}
}	
 class D extends C{
	 public void dm() {
		 setv1_1(100);
		 v2 = 200;
		 v3 = 300;
		 v4 = 400;
	 }
 }
