package step01.ex01;

public class C extends B{
	public void m1() {
		System.out.println("C�� m1() ȣ��...");
		
	}
	public void m2() {
		System.out.println("C�� m2() ȣ��...");
	}
	public void m4() {
		System.out.println("-------------------");
		this.m1();
		this.m2();
		this.m3();
		
		System.out.println("-------------------");
		super.m2();
		super.m1();
	}
}
