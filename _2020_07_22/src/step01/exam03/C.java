/*
 * private : Ŭ��������� ���� ����
 * (default) : Ŭ�������+���� ��Ű���� Ŭ����
 * protected : Ŭ���� ���+���� ��Ű���� Ŭ����+�ڽ� Ŭ����
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
