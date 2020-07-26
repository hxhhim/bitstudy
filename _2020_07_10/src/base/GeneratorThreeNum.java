package base;

import java.util.Random;

public class GeneratorThreeNum {
	private Random rd = new Random();
	
	public void makeRandomNum(int[] baseball) {
		int b1, b2, b3;
		b1 = rd.nextInt(10);
		while(true) {
			b2 = rd.nextInt(10);
			if(b1 != b2)
				break;
		}
		while(true) {
			b3 = rd.nextInt(10);
			if(b3 != b1 && b3 != b2)
				break;
		}
		baseball[0] = b1;
		baseball[1] = b2;
		baseball[2] = b3;
	}
}