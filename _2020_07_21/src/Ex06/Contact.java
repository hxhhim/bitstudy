package Ex06;

import java.io.Serializable;

public class Contact implements Serializable{
	
	int no;
	String name;
	String phoneNum;
	String email;
	String address;
	String password;
	
	public Contact() {
		this.no = 1;
		this.name= "홍길동";
		this.phoneNum = "010-111-1111";
		this.email = "abcdef@abc.com";
		this.address = "서울시 종로구 ";
		this.password = "1111";
	}
	public Contact(String name,String phoneNum,String email,String address
			,String password) {
		this();
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.address = address;
		this.password = password;
	}
}
