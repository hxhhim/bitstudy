package step02.ex01;

public class A2 {
	int var1 = 100;
	//1)toString() ������
	//=>toString()�� �ν��Ͻ��� ������ ������ �����Ѵ�.
	//=>Object�� ���� ��ӹ��� �������� �޼���� ����ϴ� �뵵�� �츮�ʹ� 
	//���� �ʴ�.
	//=>�ǹ� �ִ� ���ڿ��� �����ϵ��� ������ �ϰڴ�.
	public String toString() {
		return "A[var1="+var1+"]";
	}
	
	public boolean equals(Object obj) {
		A2 other = (A2)obj;
		if(this.var1==other.var1){
			return true;
		}
		return false;
	}
}
