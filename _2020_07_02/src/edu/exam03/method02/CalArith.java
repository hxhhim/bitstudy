package edu.exam03.method02;
/*
 * �޼���(�Լ�)
 * ����� ������������ ��� ����ϱ� ������ �����
 * �Ϻ��� ���� ���������
 * ���� ������ �ڵ尡 �ݺ��� �� �޼��带 �����.
 * 1) �ڵ� ���� �پ���.
 * 2) �Ѵ��� �ľ��� �ȴ�.
 * 3) �޼����� ���븸 �����ϸ� ����ϴ� ��� ���� ����ȴ�.
 * 4) �ڵ��� ��ǰó�� �Ϻΰ� ������ ����� �ش� ��ǰ(�޼���)��
 * 	   �����ϰų� ��ü�ϸ� �ȴ�(���/�ð��� �����ȴ�.)
 * 
 * 	  ����Ÿ�� �޼����(�Ű�����,...){
 * 	    return ����Ÿ�Ժ���;
 *    }
 * 	  int func(int a, int b){
 * 	      int ret;
 * 	      ret = a+b;
 * 	      return ret;
 * 
 * }
 * 		void func(int a, int b){
 * 			...
 * 	        return;
 * 
 * }
 * 
 */
public class CalArith {
	
	public static  void add(int num0,int num1){
		int result;
		result = num0 + num1;
		System.out.printf("%d + %d�� ���� [%d]\n",  num0,num1,result);
	}
	public static void main(String[] args) {
		add(10,20);
		add(100,200);
		add(1000,2000);
		
		
		
/*		num0= 10;
		num1= 20;
		result = num0 + num1;
		System.out.printf("%d + %d�� ���� [%d]\n",  num0,num1,result);
		
		num0= 100;
		num1= 200;
		result = num0 + num1;
		System.out.printf("%d + %d�� ���� [%d]\n",  num0,num1,result);
		
		num0= 1000;
		num1= 2000;
		result = num0 + num1;
		System.out.printf("%d + %d�� ���� [%d]\n",  num0,num1,result);
*/			

	}

}
