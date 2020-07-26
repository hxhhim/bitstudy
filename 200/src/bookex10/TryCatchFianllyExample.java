package bookex10;

public class TryCatchFianllyExample {

	public static void main(String[] args) {
		String[] strArray = {"10","6","2a"};
		int value =0;
		for(int i=0;i<=3;i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환 할수 없음");
			}finally {
				System.out.println(value);
			}
		}
				

	}

}
