package step01;

public class Exam09 {
	public static void main(String[] args) {
		
		Array3 instance1 = new Array3();
		instance1.arr = new int [20];
		
		Array3 instance2 = new Array3();
		instance2.arr = new int [10];
		
		Array3.initByIndexValue(instance1);
		Array3.mix(instance1);
		Array3.printAll(instance1,-1);
		Array3.sort(instance1);
		Array3.printAll(instance1,-1);
		System.out.println("-----------------------------------------------------");
		
		Array3.initByIndexValue(instance2);
		Array3.mix(instance2);
		Array3.printAll(instance2,-1);
		Array3.sort(instance2);
		Array3.printAll(instance2,-1);
		
				
		Array3.mix(instance1);
		Array3.printAll(instance1,-1);
		Array3.sort(instance1);
		Array3.printAll(instance1,-1);
	}
	
}
