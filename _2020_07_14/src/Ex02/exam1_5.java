package Ex02;
/*
 * ���� ��ڽ�
 * =>�ν��Ͻ��� ���� �ڵ����� ���� �ִ°�.
 */
public class exam1_5 {

	public static void main(String[] args) {
		Integer obj = new Integer(30);
		
		int value = obj.intValue();
		int value2 = obj; //�ڵ����� intValue()�� ȣ��Ǿ� �� ���� ���� value2�� ����ȴ�.
						//�ڽ��� ����� �����͸� Ǭ�ٶ���ǹ̿��� "auto-unboxing"�̶� �θ���.
		
		//����
		//1)���� �ڽ��� ��
		Integer obj2 = 10; //new Integer(10);
		Object obj3 = 10;  //new Integer(10); �θ�Ŭ������ �ڽ�Ŭ������ �ν��Ͻ��ּҸ� ������ �ִ�. 
		//Float f = 10;
		
		//2)���� ��ڽ�
		int value3 = obj2;
		//int value4 = obj3; //Object Ÿ�Կ� ���ؼ��� ���� ��ڽ��� �ڵ����� �Ͼ�� �ʴ´�.
		int value5 =(Integer)obj3;//����ȯ�� �ؾ��Ѵ�.
		int value6 = (int)obj3;// ���� ����Ÿ������ ����ȯ�� �� �� �ִ�.
								//�� obj3�� Integer ��ü�� ����Ǿ��ٴ� �����Ͽ�

	}

}
