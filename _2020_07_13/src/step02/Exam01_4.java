package step02;
/*
 * ����:String Ŭ���� - intern(): �Ϲ� String �ν��Ͻ��� ���� ������ ���
 * ��Ʈ�� Ǯ�� �����Ѵ�.
 * 
 */
public class Exam01_4 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		
		String s2 = s1.intern();//s1�� ���ڿ��� ��� ��Ʈ�� Ǯ�� ���� �����.
		String s3 = "hello";//��� ��Ʈ�� Ǯ�� string �ν��Ͻ��� �����϶�
							//�̹� ������ ��� ��Ʈ�� Ǯ�� �ش簪�� ���� �ν��Ͻ��� �����ϰ� �ִ�.
		char[] ch = new char[5];
		ch[0] = 'H';
		ch[1] = 'e';
		ch[2] = 'l';
		ch[3] = 'l';
		ch[4] = 'o';
		
		System.out.println(ch);
		
		ch[2] = 'a';
		System.out.println(ch);
		s1 = s3;
		
		if(s2 == s3) {
			System.out.println("s2 == s3");
			
		}
		String s4 = new String ("hello");
		String s5 = s4.intern();
		if(s3==s5) {
			System.out.println("s3 == s5");
		}
	}
	
}
