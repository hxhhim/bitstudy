import java.util.Scanner;

public class Ex5_13 {

	public static void main(String[] args) {
		String[] words = {"television","computer","mouse","phone"};
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<words.length;i++) {
			char[] question = words[i].toCharArray();
			
			for(int j=0; j<question.length;j++) {
				int idx = (int)(Math.random()*question.length);
				
				char tmp = question[i];
				question[i] = question[idx];
				question[idx] = tmp;
			}//question[i]�� ������question[idx]�� ��ȯ
			System.out.printf("Q%d.%s�� ������ �Է��ϼ���.>",i+1, new String(question));
			String answer = scanner.nextLine();
			
			//trim���� answer�� �¿� ������ ����
			if(words[i].contentEquals(answer.trim()))
				System.out.printf("�¾ҽ��ϴ�.%n%n");
			else
				System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
			
		}
	}

}
