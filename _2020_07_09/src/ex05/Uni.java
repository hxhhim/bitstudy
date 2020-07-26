package ex05;

public class Uni extends Student {
	String major;
	Uni(){
		
	}
	Uni(String major){
		if(major.contentEquals("korean"))
			this.major = major;
		else
			name = major;
	}
	Uni(String major,String hakyun){
		super(hakyun);
	//	this.major = major;
    //	this(major);
	}
	Uni(String major, String hakyun,String name,String phone){
		super(hakyun,name,phone);
		this.major = major;
	}
}
