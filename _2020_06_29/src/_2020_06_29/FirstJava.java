package _2020_06_29;

public class FirstJava {
	public static void main(String[] args) {
		System.out.println("Hello.Java");
		int i = 0;
		for(i=0;i<args.length; i++) {
		System.out.println("args["+i+"]"+args[i]);
		}
	}
}
/*
 * while (i<args.length){
 * System.out.println("args[0]:"+args[i])
 * i++;
 * }
*/
