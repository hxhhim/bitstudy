package test;

public class Card {
	String name;
	String dept;
	String tel;
	
	public Card(String name,String dept,String tel) {
		this.name = name;
		this.dept = dept;
		this.tel = tel;
	}
	public String toString() {
		return "이름: "+name+" 부서: "+dept+" 전화번호: "+tel;
	}
}
