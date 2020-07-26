package edu.exam02.array09;

public class Foreach {

	public static void main(String[] args) {
		int [] scores = {89,99,100,21,10};
		for(int i=0; i<scores.length;i++)
			System.out.print(scores[i] + ", ");
		System.out.println();
		
		for (int score : scores)
			System.out.print(score + ", ");
	}

}
