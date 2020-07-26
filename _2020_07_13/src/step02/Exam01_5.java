package step02;
/*
 * ����: String Ŭ���� - Mutable �� Immutable ��ü
 * =>Mutable ��ü : ���� �ٲܼ� �ִ� ��ü
 * 	=> StringBuffer, StringBuilder
 * =>Immutable ��ü: ���� �ٲܼ� ���� ��ü
 * 	=>String
 */
public class Exam01_5 {

	public static void main(String[] args) {
		//1)Immutable ��ü
		//String Ŭ������ �ѹ� ���� �����ϸ� ���� �����Ҽ� ���� Immutable ��ü�̴�.
		String s1 = new String("abcdefghijk");
		
		//Ư����ġ�� ���ڿ��� �ٸ� ���ڿ��� ��ü�ϱ�
		String s2 = s1.replace("def", "xoxo");
		System.out.println(s1);//������  s1��ü
		System.out.println(s2);//���θ��� ��Ʈ�� ��ü
		

		//2)Mutable ��ü
		//StringBuffer�� ���� ���� �Ҽ� �ִ� mutable ��ü�̴�.
		StringBuffer sb1 = new StringBuffer("abcdefghijk");
		
		StringBuffer sb2 = sb1.replace(3, 6, "xoxo");//���ϰ��� �ڱ� �ڽ��� �ּ��̴�.
		if(sb1 == sb2) {
			System.out.println("sb1==sb2");
		}
		System.out.println(sb1);
		
		
	}

}
