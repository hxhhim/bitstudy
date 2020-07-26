package edu.exam01.conditionif14;

import java.util.Scanner;

/*
 * 0~100점을 입력하고
 * 학점을 출력하세요
 * A 90이상
 * B 80이상
 * C 70이상
 * D 60이상
 * F 60미만
 */
public class Conditionif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요:");
		int  score = sc.nextInt();
		String strScore;
		
/*		if(score >= 90)
			strScore = "A학점";
		else if(score >= 80)
			strScore = "B학점";
		else if(score >= 70)
			strScore = "C학점";
		else if(score >= 60)
			strScore = "D학점";
		else 
			strScore = "F학점";
*/		
/*		if(score < 60)
			strScore = "F학점";
		else if(score < 70)
			strScore = "D학점";
		else if(score < 80)
			strScore = "C학점";
		else if(score < 90)
			strScore = "B학점";
		else 
			strScore = "A학점";
		System.out.println("학점은:"+strScore);
		sc.close();			
*/
		if (score < 60)
			strScore = "F학점";
		else if (score >=60 && score < 70)
			strScore = "D학점";
		else if (score >=70 && score <80)
			strScore = "C학점";
		else if (score >= 80 && score <90)
			strScore = "B학점";
		else 
			strScore = "A학점";
		System.out.println("학점은:"+strScore);
	}

}
