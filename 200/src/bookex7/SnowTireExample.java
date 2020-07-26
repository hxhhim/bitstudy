package bookex7;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire1 tire =snowTire;
		
		snowTire.run();
		tire.run();
	}

}
