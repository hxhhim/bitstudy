package step01.ex01;

public class Test05 {
			
	public static void main(String[] args) {
		//계산: 3-5+7+2 =?
		//계산: 7+3-2-1 =?
		Calc4 calcA = new Calc4();
		
		Calc4 calcB = new Calc4();
		
		calcA.plus(3);
		calcA.minus(5);
		calcA.plus(7);
		calcA.plus(2);
		System.out.println(calcA.result);
		
		
		calcB.plus(7);
		calcB.plus(3);
		calcB.minus(2);
		calcB.minus(1);
		System.out.println(calcB.result);
	}
}
