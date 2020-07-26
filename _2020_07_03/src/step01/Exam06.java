package step01;

public class Exam06 {
	public static void main(String[] args) {
		int [] arr = new int[20];
		Array.initByIndexValue(arr);
		Array.mix(arr);
		Array.printAll(arr,-1);
		Array.sort(arr);
		Array.printAll(arr,-1);
		System.out.println("-----------------------------------------------------");
		Array.mix(arr);
		Array.printAll(arr,-1);
		Array.sort(arr);
		Array.printAll(arr,-1);
		System.out.println(Math.sqrt(10.0));
		
	}
	
}
