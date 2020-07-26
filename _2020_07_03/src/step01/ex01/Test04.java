package step01.ex01;

public class Test04 {
			
	public static void main(String[] args) {
		//계산: 3-5+7+2 =?
		//계산: 7+3-2-1 =?
		Calc3 calcA = new Calc3();
		
		Calc3 calcB = new Calc3();
		
		Calc3.plus(calcA,3);
		Calc3.minus(calcA,5);
		Calc3.plus(calcA,7);
		Calc3.plus(calcA,2);
		System.out.println(calcA.result);
		
		
		Calc3.plus(calcB,7);
		Calc3.plus(calcB,3);
		Calc3.minus(calcB,2);
		Calc3.minus(calcB,1);
		System.out.println(calcB.result);
	}
}
