package bookex7;

public class ComputerExample {

	public static void main(String[] args) {
		int r =13;
		Calculator calculator = new Calculator();
		System.out.println("������ : "+calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("������: "+computer.areaCircle(r));

	}

}
