package step01;

public class A2 {
	int var1= 100;
	int var2= 200;
	
	
	
	public String toString() {
		return "A2[var1 = " + this.var1 +"]"+"A2[var2 = " + this.var2 +"]";
		
	}
	
	public boolean equals(Object obj) {
		//obj ������ A2��ü�� �Ѿ�� ���̱� ������ ����ȯ�Ͽ� �������.
		A2 other = (A2)obj;
		if(this.var1 == other.var1) {
			return true;
		}return false;
	 }
	public int hashCode() {
		/*
		 * �������� hashCode()�� �ν��Ͻ� ���� ���� ������� ������ �ν��Ͻ� ���� ������ �ĺ��ڵ带 �����Ѵ�.
		 * =>������
		 * ���� ���� ���� �ν��Ͻ��� ���� �ؽ��ڵ带 �����ϰ� ����� ����.
		 */
		return this.var1;
	}
}
