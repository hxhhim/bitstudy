package edu.exam01.conditionif14;

import java.util.Scanner;

/*
 * 0~100���� �Է��ϰ�
 * ������ ����ϼ���
 * A 90�̻�
 * B 80�̻�
 * C 70�̻�
 * D 60�̻�
 * F 60�̸�
 */
public class Conditionif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		int  score = sc.nextInt();
		String strScore;
		
/*		if(score >= 90)
			strScore = "A����";
		else if(score >= 80)
			strScore = "B����";
		else if(score >= 70)
			strScore = "C����";
		else if(score >= 60)
			strScore = "D����";
		else 
			strScore = "F����";
*/		
/*		if(score < 60)
			strScore = "F����";
		else if(score < 70)
			strScore = "D����";
		else if(score < 80)
			strScore = "C����";
		else if(score < 90)
			strScore = "B����";
		else 
			strScore = "A����";
		System.out.println("������:"+strScore);
		sc.close();			
*/
		if (score < 60)
			strScore = "F����";
		else if (score >=60 && score < 70)
			strScore = "D����";
		else if (score >=70 && score <80)
			strScore = "C����";
		else if (score >= 80 && score <90)
			strScore = "B����";
		else 
			strScore = "A����";
		System.out.println("������:"+strScore);
	}

}
