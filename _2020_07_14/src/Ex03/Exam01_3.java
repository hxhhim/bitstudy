package Ex03;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * �迭ó�� �ε����� �ٷ�� �ִ� ��ϰ��� ��ü(�÷��ǰ�ü)�̴�.
 */
public class Exam01_3 {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		ArrayList names = new ArrayList();
		
		String name;
		while(true) {
			name = keyScan.nextLine();
			if(name.equals(""))
				break;
			names.add(name);
		}
		System.out.println("-------------------------");
		for(int x = 0;x<names.size();x++) {
			System.out.println(names.get(x));
		}
		keyScan.close();
	}

}
