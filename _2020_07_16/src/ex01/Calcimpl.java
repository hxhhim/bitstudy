package ex01;


//=>�������̽��� �����ϴ� �޼ҵ�� �ݵ�� �������̽��� ����� ��� �޼��带 ������ �Ѵ�.
// =>�� �Ѱ��� �޼���� �������� ������ �ش� Ŭ������ abstract�� �����ؾ� �Ѵ�.
//��? abstract �޼���� abstract Ŭ�������� ������ �ִ�.
public class Calcimpl implements Calc{

	//�������̽��� �޼��带 ������ �� ��Ģ
	//1)public �̾�� �Ѵ�.
	//2)����Ÿ���� ���ƾ� �Ѵ�.
	//3)�޼������ ���ƾ� �Ѵ�.
	//4)�Ķ���� Ÿ�Թ� ������ ���ƾ��Ѵ�.
	//5)�Ķ���� ���� �̸��� �������.
	@Override
	public int plus(int v1, int v2) {
		return v1+v2;
	}

	@Override
	public int minus(int a, int b) {
		return a-b;
	}
	
	

}
