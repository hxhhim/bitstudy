package ex01;

 abstract class A{
	 void test() {
		System.out.println("A.test()");
		}
	 void test1() {
		 System.out.println("A.test()");
	 }
	 }
public class abst extends A{

	void test() {
		System.out.println("abst.test()");
	}
	public static void main(String[] args) {
	
	A a = new abst();
	a.test();
	a.test1();
	}

}
