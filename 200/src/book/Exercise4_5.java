package book;

public class Exercise4_5 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		for(x=1;x<=10;x++) {
			for(y=1;y<=10;y++) {
				if((4*x)+(5*y)==60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}
		
		

	}

}
