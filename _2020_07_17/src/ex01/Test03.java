package ex01;

interface Cal{
	int add(int a, int b);

}
/*
class CalImp implements Cal{

	int result;
	@Override
	public int add(int a, int b) {
		return result = a+b;
	}
	@Override
	public int sub(int a, int b) {
		return result = a-b;
	}
	public String toString() {
		return "result: "+result;
	}
	
}
*/
public class Test03 {

	public static void main(String[] args) {
		
		
		Cal cal = ((int a,int b)->{return a+b;}); 
		//람다함수 {(매개변수)->{코드})new를 안쓰는이유?스택에 잡혀서
		//인터페이스에 함수가 하나만 선언되었을때 사용가능
		System.out.println(cal.add(19, 39));
		
		
/*		
		CalImp a = new CalImp();
		a.add(10, 20);
		System.out.println(a);
		a.sub(10, 20);
		System.out.println(a);
*/	
	}

}
