package bookex9;

public class A {
	A(){System.out.println("A객체가 생성됨");}
	
//	인스턴스멤버클래스
	class B{
		B(){System.out.println("B객체가 생성됨");}
		int field1;
		//static int field2;
		void method() {}
		//static void method2(){}
		
		}
	//정적멤버클래스
	static class C{
		C(){System.out.println("c객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	void method() {
		//로컬클래스
		class D{
			D(){System.out.println("D객체가 생성됨");}
			int field1;
			//static int field2;
			void method1() {}
			//static void method2(){}
		}
		D d= new D();
		d.field1 =3;
		d.method1();
	
	}
}
