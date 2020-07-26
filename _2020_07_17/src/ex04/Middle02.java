package ex04;
/*
  다음의 형태로 표현된 2차원 배열이 존재합니다
  1 2 3
  4 5 6
  7 8 9

  이러한 int형 2차원 배열이 parameter로 전달되면, 다음의 형태로 배열의 구조를
  변경시키는 메서드를 정의해보세요
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
