package ex04;
/*
  ������ ���·� ǥ���� 2���� �迭�� �����մϴ�
  1 2 3
  4 5 6
  7 8 9

  �̷��� int�� 2���� �迭�� parameter�� ���޵Ǹ�, ������ ���·� �迭�� ������
  �����Ű�� �޼��带 �����غ�����
  7 8 9
  1 2 3
  4 5 6
 */

public class Middle02 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},
					   {4,5,6},
					   {7,8,9}};
//		parameter(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]);
			}System.out.println();
		}

	}
	/*
	public static void parameter(int[][] arr) {
		int[][] arr2 =new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr2[i][j]=arr[i+1][j];
			}
		}
		arr=arr2;
	}
*/
}
