package Ex02;

import java.util.Scanner;

/*
 * �̸�?ȫ�浿
 * ��ȭ?010-1111-1111
 * �̸���?hong@test.com
 * ȸ��?��Ʈķ��
 * ����?�븮
 * ����Է��Ͻðڽ��ϱ�?(y/n)
 * --------------------
 * �̸�?�Ӳ���
 * ��ȭ?010-222-3333
 * �̸���?lim@test.com
 * ȸ��?��Ʈķ��
 * ����?���
 */
public class Test06 {
	public static void main(String[] args) {
		Contact[] contacts =new Contact[10];				
		int i =0;
					
		while(i<10) {
			contacts[i++] = Func.inputContact();
			if(Func.prompt())
				break;
		}
		for(int j= 0; j<i;j++) {
			Func.printContact(contacts[j]);
		}
			

		}
	


}

