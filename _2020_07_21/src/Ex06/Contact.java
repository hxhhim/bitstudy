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
		this.name= "ȫ�浿";
		this.phoneNum = "010-111-1111";
		this.email = "abcdef@abc.com";
		this.address = "����� ���α� ";
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
