package Ex03;

import java.util.Scanner;

public class Exam01_1 {

	public static void main(String[] args) {
		Scanner keyScan  = new Scanner(System.in);
		String[] names = new String[5];
		
		int i = 0;
		String name;
		while(true) {
			if(i>=names.length) {
				System.out.println("�̸��� ������ ������ �����մϴ�.");
				break;
			}
			name = keyScan.nextLine();
			if(name.contentEquals(""))
				break;
			names[i] = name;
			i++;
			
			}
		System.out.println("--------------------------");
		for(int x = 0; x<i;x++) {
			System.out.println(names[x]);
			
		}
		keyScan.close();
	}

}
