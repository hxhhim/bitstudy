package step02;
/*
 * StringBuffer Å¬·¡½º - replace(),delete(),insert()
 */
public class Exam02_3 {

	public static void main(String[] args) {
		StringBuffer b1 = new StringBuffer("abcdefghijk");
		StringBuffer b2 = b1.replace(3,6,"xoxo");
		
		if(b1 == b2) {
			System.out.println("b1 == b2");
		}
		System.out.println(b1);
		b1.delete(3, 6);
		System.out.println(b1);
		b1.insert(3, "xxx");
		System.out.println(b1);
		System.out.println(b2);
	}

}
