package bookex6;

import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountArray= new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int i = 0;
	
	public static void main(String[] args) {
		boolean run =true;
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("---------------------------------");
			System.out.println("����>");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo ==1) {
				createAccount();
			}else if(selectNo==2) {
				accountList();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
	//���»����ϱ�
	private static void createAccount() {
		
		System.out.println("-----------");
		System.out.println("���»���");
		System.out.println("-----------");
		System.out.println("���¹�ȣ:");
		String ano = scanner.nextLine();
		System.out.println("������:");
		String owner = scanner.nextLine();
		System.out.println("�ʱ��Աݾ�:");
		int balance = Integer.parseInt(scanner.nextLine());
		Account account = new Account(ano,owner,balance);
		accountArray[i] =account;
		i++;
		System.out.println("���:���°� �����Ǿ����ϴ�.");
	}
	//���¸�Ϻ���
	private static void accountList() {
		System.out.println("-----------");
		System.out.println("���¸��");
		System.out.println("-----------");
		for(int j=0;j<i;j++) {
			System.out.print(accountArray[j].getAno()+" ");
			System.out.print(accountArray[j].getOwner()+" ");
			System.out.println(accountArray[j].getBalance()+" ");
		}
	}
	//�����ϱ�
	private static void deposit() {
		System.out.println("-----------");
		System.out.println("����");
		System.out.println("-----------");
		
		System.out.println("���¹�ȣ:");
		String ano = scanner.nextLine();
		
		System.out.println("���ݾ�:");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("���:���°� �������� �ʽ��ϴ�.");
			return;
		}
		account.setBalance(account.getBalance()+balance);
		System.out.println("���:������ �����Ǿ����ϴ�.");
		
	}
	//����ϱ�
	private static void withdraw() {
		System.out.println("-----------");
		System.out.println("���");
		System.out.println("-----------");
		
		System.out.println("���¹�ȣ:");
		String ano = scanner.nextLine();
		
		System.out.println("��ݾ�:");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("���:���°� �������� �ʽ��ϴ�.");
			return;
		}
		if(account.getBalance()<balance) {
			System.out.println("���ݾ׺��� ���� �ݾ��� ����Ҽ� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance()-balance);
		System.out.println("���: ����� �����Ǿ����ϴ�.");
		
		
	}
	//Account �迭���� ano�� ������ Account ��üã��
	private static Account findAccount(String ano) {
		
		Account account =null;
		for(int j=0;j<accountArray.length;j++) {
			if(accountArray[j] !=null) {
				if(accountArray[j].getAno().equals(ano)){
				 account = accountArray[j];
			 }else {
				 System.out.println("���¹�ȣ�� �߸��ԷµǾ����ϴ�.");
			 }break;
		 }
		
	}return account;
	}
}
