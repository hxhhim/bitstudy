package step02;
/*
 * StringBuffer�� equals()�� ���������� �ʾҴ�.
 */
public class Exam02_2 {

	public static void main(String[] args) {
		StringBuffer b1 = new StringBuffer("hello");
		StringBuffer b2 = new StringBuffer("hello");
		
		if(b1.equals(b2)) {
			System.out.println("b1.equals(b2)");
		}

	}

}
