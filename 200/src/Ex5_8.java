
public class Ex5_8 {

	public static void main(String[] args) {
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[5];
		
		for(int i=0;i<answer.length;i++) {
			counter[answer[i]]++;
		}
		for(int i=0; i<counter.length;i++) {
			System.out.print("counter["+i+"]"+counter[i]);
			
			for(int j=0; j<counter[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
