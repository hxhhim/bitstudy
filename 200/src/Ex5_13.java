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
			}//question[i]와 랜던값question[idx]를 교환
			System.out.printf("Q%d.%s의 정답을 입력하세요.>",i+1, new String(question));
			String answer = scanner.nextLine();
			
			//trim으로 answer의 좌우 공백을 제거
			if(words[i].contentEquals(answer.trim()))
				System.out.printf("맞았습니다.%n%n");
			else
				System.out.printf("틀렸습니다.%n%n");
			
		}
	}

}
