package edu.exam02.array07;

import java.util.Arrays;

/*
 * <얕은복사>
 * 배연변수에 다른 배열 공간이 있는 배열변수를 대입하면
 * hashcode 값만 복사되므로 같은 힙공간을 가리키게 된다.
 * 이때는 새로 생성한 배열 변수에서 값을 수정하게 되면
 * 원래 변수를 통해 선언한 배열의 값이 바뀌게 된다.
 * 두개의 배열 변수는 같은 공간을 가리키게 된다.
 */

/*
 * <깊은 복사>
 * Arrays.copyOf의 도움을 받으면 
 * 깊은 복사가 일어난다.
 * 새로 변수선언과 동시에 새로운 공간도 할당되어
 * 값들이 복사되므로 2개의 배열변수들은 각각 자신들의 공간을 가리키게 된다.
 * 그러므로 1개의 배열변수는 다른 배열 변수에 영향을 미치지 않는다.
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
		
		//깊은 복사
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
