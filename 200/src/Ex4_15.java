
public class Ex4_15 {
/*
 * 회문수를 구하는 프로그램
 * 회문수(palindrome) 숫자를 거꾸로 읽어도 앞으로 읽은것과 같은수
 */
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		
		int result = 0;
		
		while(tmp!=0) {
			result = result*10+tmp%10;
			tmp /=10;
		}
		if(number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");
		}
}
