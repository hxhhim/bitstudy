import java.util.Random;

public class Ex4_7 {

	public static void main(String[] args) {
		int value = (int)(Math.random()*6)+1;
		
		System.out.println("value:" + value);
		
		Random rd = new Random();
		int num = rd.nextInt(6);
		System.out.println("value:" + (num+1));

	}

}
