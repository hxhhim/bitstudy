package step01.ex01;

public class Test03 {
			
	public static void main(String[] args) {
		//계산: 3-5+7+2 =?
		//계산: 7+3-2-1 =?
		Calc02.plus(3);
		Calc02.minus(5);
		Calc02.plus(7);
		Calc02.plus(2);
		System.out.println(Calc02.result);
		Calc02.result = 0;
		
		Calc02.plus(7);
		Calc02.plus(3);
		Calc02.minus(2);
		Calc02.minus(1);
		System.out.println(Calc02.result);
	}
}
