
public class Ex5_11 {

	public static void main(String[] args) {
		int[][] score = {
				{100,100,100}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
				,{50,50,50}
		};
		
		int[][] result = new int[score.length+1][score[0].length+1];
		
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				result[i][j] = score[i][j]; //result배열에 score배열 옮기기
				result[i][score[0].length]+=result[i][j];//각행값의 총합을 마지막열에 입력
				result[score.length][j] += result[i][j];//각열의 총합을 마지막행에 입력
				result[score.length][score[0].length]+= result[i][j];//우측마지막행마지막열에 총합입력
				}
		}
		for(int i=0; i<result.length;i++) {
			for(int j=0; j<result[i].length;j++) {
				System.out.printf("%4d",result[i][j]);
			}
			System.out.println();
				
		}

	}

}
