package ex03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) throws IOException {
		File f = new File("Exam09_1.dat");
		FileOutputStream out = new FileOutputStream(f);
		
		Scanner sc = new Scanner(System.in);
		
		//1)write(int)=> �̸޼���� ������ 1����Ʈ�� ����Ѵ�.
		out.write(100);	//0x00000064   =>0x64
		out.write(256);	//0x00000100	=>0x00
		out.write(180243);//0x0002c013	=>0x13
		sc.nextLine();
		out.close();
		System.out.println("�����Ͽ����ϴ�.");
	}

}
