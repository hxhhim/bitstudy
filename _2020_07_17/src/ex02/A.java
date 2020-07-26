package ex02;

final class B{
	int a= 10;
	void print() {
		System.out.println(a);
	}
}
/*
 * class C extends B{
	
}
*/
public class A {

	public static void main(String[] args) {
		B a = new B();
		a.print();

	}

}
