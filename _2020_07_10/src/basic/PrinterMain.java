package basic;

public class PrinterMain {
	public static void main(String[] args) {

		InkjetPrinter ink = new InkjetPrinter("HP-1000", "HP", "USB");
		LaserPrinter laser = new LaserPrinter("DELL-2000", "DELL", "paraller port");
		ink.showInfo();
		ink.print(10);
		System.out.println();
		laser.showInfo();
		laser.print(5);
		System.out.println("-----------------------");
		ink.showInfo();
		System.out.println();
		laser.showInfo();
	}
}
