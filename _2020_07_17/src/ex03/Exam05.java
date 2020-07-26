package ex03;

import java.io.File;
import java.io.FileFilter;

public class Exam05 {

	public static void main(String[] args) {
		File f2 = new File(".");
		
		File[] list = f2.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if(pathname.isFile())
					return true;
				return false;
			}
		});
		
		for(File item : list) {
			System.out.printf("%s %s\n",item.isDirectory()?"d":"-", item.getName());
			
		}
	}

}
