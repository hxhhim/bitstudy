package step01.exam05;

import java.io.FileOutputStream;

public class Exam13 {
	
	public static void main(String[] args) {
		
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream("Exam090_13.dat");
			out.write(100);
		}catch(Exception e) {
			
		}finally {//�ڿ������� finally���� �����Ѵ�.
			//�߿��� ���� �����ڰ� ���� �ڵ��ؾ��Ѵ�.
			try {
				if(out!=null)
					out.close();
				}catch(Exception e) {}
		}
	}
}
