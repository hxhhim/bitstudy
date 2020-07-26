package step01;

public class Car {
	int cnt = 0;
	static public int a =0;
    static public int b= 0;
	Car(){
		cnt++;
		System.out.println("Car()");
	}
	public void set(int a, int b) {
//		this.a = a;
//		this.b = b;
	}
	static public void show() {
		System.out.println("a: "+a+"b:"+b);
	}
	public void print() {
		System.out.println("a: "+a+"b:"+b);
	}
}
