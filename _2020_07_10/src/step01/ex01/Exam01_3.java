package step01.ex01;

public class Exam01_3 {
	public static void main(String[] args) {
		Motor r1 = new Car();
		
		r1.cc = 100;
		r1.maker = "비트자동차";
		
		//Car에서 선언한 변수 사용
//		r1.capacity = 200;
		/*
		 * 이유
		 * 컴파일러는 레퍼런스 타입에 선언된 항목만 사용할수 있다.
		 * 실제 해당 인스턴스 변수가 존재한다 하더라도 접근 불가능! 
		 *
		 */
		//r1이 실제 Car 인스턴스를 가리키는데 Car의 모든 기능을 사용하는 방법은 없을까
		Car c = (Car)r1;
		c.capacity = 200;
		c.cc = 200;
		System.out.println("r1.cc: "+r1.cc);
		System.out.println("c.cc: "+c.cc);
		
		
		Bus b1 = new Bus();
		Taxi t1 = new Taxi();
		Exam01_3 obj = new Exam01_3();
		obj.print(b1);
		obj.print(t1);
		
		
	}/*
	static void print(Bus b) {
		b.print();
		
	}
	static void print(Taxi t1) {
		t1.print();
	}*/
	
	void print(Car car) {  //다형성
		if(car instanceof Bus) { //Car가 Bus의 인스턴스인지 확인
			Bus b = (Bus)car;
			b.print();
		}
		if(car instanceof Taxi) {
			Taxi t = (Taxi)car;
			t.print();
		}
	}
}
