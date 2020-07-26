package Ex_after;

public class Exam03 {
	static int m1(int a, int b) {
		return a+b;
	}
	static void m2(int a, int b) {
		if(b==0) {
			return;
		}
		System.out.println(a/b);		
	}
	static int m3() {
		return 100;
	}
	static void m4() {
		System.out.println("?????");
	}
	static void fm() {
		System.out.println("fm()");
	}
	static void fm(int a) {
		System.out.println(a);
	}
	static void fm(short a) {
		System.out.println("short"+a);
	}
	static void fm(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		int result = m1(10,20);
		System.out.println(result);
		
		m2(5,2);
		System.out.println(m3());
		m4();
		fm();
		fm(1);
		fm((short)2);
		fm(1,2);
		System.out.println();
	}
	}
