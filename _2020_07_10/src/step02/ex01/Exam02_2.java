package step02.ex01;

public class Exam02_2 {

	public static void main(String[] args) {
		String s1 = new String("Hello, world!");
		System.out.println(s1);
		
		String s2 = "Hello, world!";
		System.out.println(s2);
		
		String s3 = "Hello, world!";
		
		if(s2 == s3) {
			System.out.println("s2 == s3");
		}
		if(s1 == s3) {
			System.out.println("s1 == s3");
		}
		String s4 = new String("Hello, world!");

		if(s1 == s4) {
			System.out.println("s1 == s4");
		}
	}

}
