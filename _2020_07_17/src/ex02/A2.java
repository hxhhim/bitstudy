package ex02;

public class A2 {

	public final void m() {
		System.out.println("A2: m()");
	}
	public void m1() {
		System.out.println("A2: m1()");
	}
	public static void main(String[] args) {
		A2 a2 = new A2();
		a2.m();
		a2.m1();
		C c = new C();
		c.m();
		c.m1();
	}

}
class C extends A2{
//	public void m() {
//		System.out.println("C: m1()");
//	} final은 오버라이딩 안됨.
	
	public void m1() {
		System.out.println("C: m1()");
	}
}