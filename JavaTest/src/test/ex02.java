package test;
// 1+1+2+3+5+8+13+ .... �� ������ �����Ǵ� �Ǻ���ġ������ 10��° �ױ�����
//   �հ踦 ���ϴ� ���α׷��� �ۼ� �Ͻÿ�.
public class ex02 {

	public static void main(String[] args) {
		int input = 10;
		int sum = 0;
		for(int i=1;i<=input;i++) {
			System.out.print(fibo(i)+"+");
			sum+=fibo(i);
		}
		System.out.println();
		System.out.println("�Ǻ���ġ ������ 10��° �ױ��� ����:"+sum);

	}
	public static int fibo(int n) {
		if(n<=1) {
			return n;
		}else {
			return fibo(n-2)+fibo(n-1);
		}
	}

}
