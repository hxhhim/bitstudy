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
		return "�̸�: "+name+" �μ�: "+dept+" ��ȭ��ȣ: "+tel;
	}
}
