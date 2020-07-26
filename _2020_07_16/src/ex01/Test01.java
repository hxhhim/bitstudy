package ex01;

public interface Test01 {
	//1)public static final 변수 선언 가능: 순서는 상관없다.
	public static final int V1 = 100;
//	protected static final int v2 = 200;
	static final int v3 = 300;
	public final int v4 = 400;
	public static int v5 = 500;
	int v6 = 600;
	
	//2)public abstract 메서드 선언 가능
	public abstract void m1();
	abstract void m2();
	public void m3();
	void m4();
	
//	private void m5();
//	void m6() {}

	
}
