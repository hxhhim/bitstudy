package test;

import java.util.Scanner;

/*
 * ������԰��� ���α׷� ���� ��ũ�� ����Ʈ�� ����
 * ����ڷκ��� �̸�(name),�μ�(dept),��ȭ��ȣ(tel)�� �Է¹޾� �޸𸮿� ��������Ѵ�. 
 * ��������� �˻�,����,����,��� ����� �����Ѵ�.
 * ���޴� ���
 * 1)input Card
 * 	-name,dept,tel�� �Է� �޾� ��ũ�� ����Ʈ�� ����
 * 2)search Card
 * -name�� �Է¹޾� ���� ���� �˻�
 * -�̸��� �ִ� ��� ȭ�鿡 ã�� ���� ���
 * -�̸��� ���� ��� ȭ�鿡 ���� �޽��� ���
 * 3)list Card
 * ��� ���� ������ ���
 * 4)modify Cardsdfh23243fgj
 * -name�� �Է¹޾� ���� ���� ����
 * 5)Delete Card
 * -name�� �Է¹޾� ���� ���� ����
 * 6)exit
 * -���α׷�����
 */
public class ex10 {
	
	
	public static void main(String[] args) {
		CardController cc = new CardController();
		CardDoubleLinkedList list = new CardDoubleLinkedList();
		
		cc.inputCard();
		cc.inputCard();
		cc.listCard();
//		System.out.println(list.toString());
		
	}
	
	
	
		
	

}
