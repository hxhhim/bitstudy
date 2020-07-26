package Ex03;

import java.util.Scanner;
//배열의 크기를 조정하기
public class Exam01_2 {

	public static void main(String[] args) {
		Scanner keyScan  = new Scanner(System.in);
		String[] names = new String[5];
		
		int i = 0;
		String name;
		while(true) {
			if(i>=names.length) {
				String[] names1 = new String[names.length+2];
				for(int j=0;j<names.length;j++)
					names1[j]=names[j];
				System.out.println("저장공간을 늘렸습니다.");
					names=names1;
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
