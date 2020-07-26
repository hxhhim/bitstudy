package step01;

public class Exam10 {
	public static void main(String[] args) {
		
		Array4 instance1 = new Array4();
		instance1.arr = new int [20];
		
		Array4 instance2 = new Array4();
		instance2.arr = new int [10];
		
		instance1.initByIndexValue();
		instance1.mix();
		instance1.printAll(-1);
		instance1.sort();
		instance1.printAll(-1);
		System.out.println("-----------------------------------------------------");
		
		instance2.initByIndexValue();
		instance2.mix();
		instance2.printAll(-1);
		instance2.sort();
		instance2.printAll(-1);
		
				
		instance1.mix();
		instance1.printAll(-1);
		instance1.sort();
		instance1.printAll(-1);
	}
	
}
