package ex05;

public class Student extends Person {
	String hakyun;
	
	Student(){
		
	}
	Student(String hakyun){
		this.hakyun = hakyun;
	}
	Student(String hakyun, String name,String phone){
		super(name,phone);
		this.hakyun = hakyun;
	}
}
