package ex05;

public class Exam01 {

	public static void main(String[] args) {
		Uni person1 = new Uni();
		Uni person2 = new Uni("korean");
		Uni person3 = new Uni("math","3");
		Uni person4 = new Uni("english","3","ȫ�浿","101-1111-1111");
	
		System.out.println("name: " + person4.name);
		System.out.println("phone: " + person4.phone);
		System.out.println("major: " + person4.major);
		System.out.println("hakyun: " + person4.hakyun);
		
		Uni person5 = new Uni("ȫ�浿");
		System.out.println(person5.name);
	}

}
