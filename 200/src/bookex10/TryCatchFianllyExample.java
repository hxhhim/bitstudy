package bookex10;

public class TryCatchFianllyExample {

	public static void main(String[] args) {
		String[] strArray = {"10","6","2a"};
		int value =0;
		for(int i=0;i<=3;i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�ε����� �ʰ�����");
			}catch(NumberFormatException e) {
				System.out.println("���ڷ� ��ȯ �Ҽ� ����");
			}finally {
				System.out.println(value);
			}
		}
				

	}

}