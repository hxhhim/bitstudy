package step01.exam05;

import java.io.FileOutputStream;

/*
 * try=with-resource
 */
public class Exam14 {

	public static void main(String[] args) {
		
		try(//�� ��ȣ�ȿ� ����� ��ü�� try~ catch~����� ������ ����
			//�ڵ����� close()�� ȣ���Ͽ� �ڿ� ������ ������ ���̴�.
			//�����ڰ� ����finally ��Ͽ� �ڿ����� �ڵ带 �ۼ��� �ʿ䰡 ���ٴ� �ǹ�
			//java.lang.AutoClosable ����ü�� ���ؼ��� ������ �� �ִ�.
			FileOutputStream out = new FileOutputStream("Exam090_13.dat");
			){
			out.write(100);
		}catch(Exception e) {
			
		}
	}

}
