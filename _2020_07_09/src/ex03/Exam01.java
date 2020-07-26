package ex03;

public class Exam01 {

	public static void main(String[] args) {
		System.out.printf("A.var1 = %d\n",A.var1);
		System.out.printf("B.var2 = %d\n",B.var3);
		System.out.println("---------------------");
		
		B.m();
		System.out.printf("A.var1 = %d\n",A.var1);
		System.out.printf("B.var2 = %d\n",B.var3);
		System.out.println("---------------------");
		
		System.out.printf("B.var1= %d\n",B.var1);
		A.var1 = 1212;
		System.out.printf("B.var1= %d\n",B.var1);
		System.out.printf("A.var1= %d\n",A.var1);
	}

}
