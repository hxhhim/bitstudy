package step01.exam05;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * throw new Exception("aaa")
 * throw [Throwable ��ü]
 * Throwable==>java.lang.Throwable
 */
public class Exam15 {

	public static void main(String[] args) {
		try {
			m4(2);
		}catch(Throwable e) {
			System.out.println(e);
		}

	}
	//�޼��忡 � ������ �������� �ݵ�� �����ؾ� �Ѵ�.
	//=>[����Ÿ��]�޼����(�Ķ����....)throws ����Ÿ��,����Ÿ��,...{,,,}
	static void m()throws Throwable{
		//throw new String("����");
		throw new Throwable("����");
	}
	static void m2() throws Exception {
		throw new Exception("���� Ŭ����");
	}
	static void m3(int i) throws Exception, IOException, FileNotFoundException{
		if(i ==0)
			throw new Exception();
		else if(i ==2)
			throw new IOException();
		else if(i ==3)
			throw new FileNotFoundException();
	}
	static void m4(int i) throws Exception{
		if(i ==0)
			throw new Exception();
		else if(i ==2)
			throw new IOException();
		else if(i ==3)
			throw new FileNotFoundException();
	}
	
}