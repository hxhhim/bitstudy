package edu.exam02.array05;

public class ArrayException {

	public static void main(String[] args) {
		int [] arr = {10,20,30};
		System.out.println("���̴�"+arr.length);
		//java.lang.ArrayIndexOutofBoundException
		//�迭�� ������ 0, �������� �迭���� -1
		System.out.println(arr[arr.length-1]);
		//System.out.println(arr[arr.length]); //Exception
		arr = new int[5];
		System.out.println(arr.length);
		
		
	}

}
