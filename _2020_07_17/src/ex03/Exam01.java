package ex03;

import java.io.File;
import java.io.IOException;

/*
 * ����:������ �ٷ�� ����-File ����
 * File?
 * =>File System�� �ٷ�� ����
 * =>File System? ���丮�� ������ �����ϴ� �ý���
 * =>���丮 �Ǵ� ������ ������ �ٷ� �� �ִ�.
 */
public class Exam01 {

	public static void main(String[] args) throws IOException {
		//���� ���� �ٷ��
		//=> ��θ� �����ϴ� ���
		//1) ������
		//=> ��ü��θ� �����Ѵ�.
		//	�� c:\Users\Bitcamp\test\a.txt <==Window OS
		//	�� /User/test/a.txt 			  <==Unix,MacOS,Linux
		//2)�����
		// =>���� ��ġ�� �������� ��θ� �����Ѵ�.
		//	��)test/a.txt
		//=>��Ŭ�������� �����Ҷ�, ����δ� ������Ʈ�����̴�.
		File f = new File("board.dat");
		System.out.println(f.exists());//exists - ������ġ���� ��������Ȯ��
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getAbsolutePath());
		
		File f2 = new File("../java01/test01/test53.java");
		System.out.println(f2.getCanonicalPath());
		System.out.println(f2.getAbsolutePath());

	}

}
