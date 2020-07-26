package ex03;

import java.io.File;
import java.io.IOException;

public class Exam02 {

	public static void main(String[] args) throws IOException {
		
		File f = new File(""); //폴더 또는 파일을 지정하지 않을 경우
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getAbsolutePath());
		System.out.println("------------------------------");
		
		File f2 = new File("..");//.(현재폴더), ..(상위폴더)
		System.out.println(f2.exists());
		System.out.println(f2.isDirectory());
		System.out.println(f2.isFile());
		System.out.println(f2.getCanonicalPath());
		System.out.println(f2.getAbsolutePath());
		
	}

}
