package edu.exam02.array07;

import java.util.Arrays;

/*
 * <��������>
 * �迬������ �ٸ� �迭 ������ �ִ� �迭������ �����ϸ�
 * hashcode ���� ����ǹǷ� ���� �������� ����Ű�� �ȴ�.
 * �̶��� ���� ������ �迭 �������� ���� �����ϰ� �Ǹ�
 * ���� ������ ���� ������ �迭�� ���� �ٲ�� �ȴ�.
 * �ΰ��� �迭 ������ ���� ������ ����Ű�� �ȴ�.
 */

/*
 * <���� ����>
 * Arrays.copyOf�� ������ ������ 
 * ���� ���簡 �Ͼ��.
 * ���� ��������� ���ÿ� ���ο� ������ �Ҵ�Ǿ�
 * ������ ����ǹǷ� 2���� �迭�������� ���� �ڽŵ��� ������ ����Ű�� �ȴ�.
 * �׷��Ƿ� 1���� �迭������ �ٸ� �迭 ������ ������ ��ġ�� �ʴ´�.
 * 
 */

public class DeepCopy {
	public static int[] arraycopy (int[] src,int cnt) {
		int[]  ret;
		ret = new int[cnt];
		
		for(int i=0 ; i<cnt;i++)
			ret[i] = src[i];
		
		return ret;
	}
	public static void main(String[] args) {
		int [] scores0 = {10,20,30,40,50};
		int [] scores1 = scores0;
		int [] scores2 = scores1;
		
		System.out.println(scores0);
		System.out.println(scores1);
		System.out.println(scores2);
		
		scores0[0] = 100;
		System.out.println(scores0[0]);
		System.out.println(scores1[0]);
		System.out.println(scores2[0]);
		
		//���� ����
		//int[] scores4 = Arrays.copyOf(scores0,scores0.length);
		
		int[] scores4 = arraycopy(scores0,scores0.length);
		
		
		System.out.println();
		System.out.println(scores0);
		System.out.println(scores1);
		System.out.println(scores2);
		System.out.println(scores4);
		scores0[0] = 1000;
		
		System.out.println();
		System.out.println(scores0[0]);
		System.out.println(scores1[0]);
		System.out.println(scores2[0]);
		System.out.println(scores4[0]);
		
	}

}
