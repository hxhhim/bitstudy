/*
 * Version 0.2
 */

//1. PhoneBookVer02.java 프로그램을 배열을 사용하도록 수정해서

//프로그램 사용자가 입력하는 정보가 최대 100개까지 유지되도록 프로그램을 변경하세요
//그리고 기능은 
//데이터 저장
//데이터 검색
//데이터 삭제
//데이터 수정
//데이터 전체 출력
//를 선택하도록 하세요
//
//
//
//실행하면 이렇게 나타납니다
//
//
//--선택하세요--
//1. 데이터 입력
//2. 데이터 검색
//3. 데이터 삭제
//4. 데이터 수정
//5. 데이터 전체 출력
//6. 프로그램 종료
//선택 : 1
//데이터 입력을 시작합니다..
//이름: 홍길동
//전화번호 : 222-3333
//생년월일 : 99년 12월 25일생
//데이터 입력이 완료되었습니다.
//
//--선택하세요--
//1. 데이터 입력
//2. 데이터 검색
//3. 데이터 삭제
//4. 데이터 수정
//5. 데이터 전체 출력
//6. 프로그램 종료
//선택 :
//

import java.util.Scanner;

class PhoneInfo {
	String name;
	String phoneNumber;
	String birth;

	public PhoneInfo(String name, String num, String birth) {
		this.name = name;
		phoneNumber = num;
		this.birth = birth;
	}

	public PhoneInfo(String name, String num) {
		this.name = name;
		phoneNumber = num;
		this.birth = null;
	}

	public void setPhoneInfo(String name, String num, String birth) {
		this.name = name;
		phoneNumber = num;
		this.birth = birth;
	}

	public void showPhoneInfo() {
		System.out.println();
		System.out.println("name: " + name);
		System.out.println("phone: " + phoneNumber);
		if (birth != null)
			System.out.println("birth: " + birth);

		System.out.println(""); // 데이터 구분을 위해
	}
}

class PhoneBookVer02 {
	static Scanner keyboard = new Scanner(System.in);

	static PhoneInfo[] pArr = new PhoneInfo[100];
	static int pNum = 0;

	public static void showMenu() {
		System.out.println();
		System.out.println("--선택하세요--");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 데이터 수정");
		System.out.println("5. 데이터 전체 출력");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택: ");
	}

	public static PhoneInfo readData() {
		System.out.println("데이터 입력을 시작합니다..");
		System.out.print("이름: ");
		String name = keyboard.next();
		System.out.print("전화번호: ");
		String phone = keyboard.next();
		System.out.print("생년월일: ");
		String birth = keyboard.next();

		PhoneInfo info = new PhoneInfo(name, phone, birth);
		return info;
	}

	public static void add(PhoneInfo pi) {
		if (pNum == pArr.length) {
			System.out.println("더이상 저장 못함");
			return;
		} else {
			pArr[pNum++] = pi;
		}
		System.out.println("데이터 입력이 완료되었습니다.");
	}

	public static void search(String pName) {
		for (int i = 0; i < pNum; i++) {
			if (pName.equals(pArr[i].name)) {
				pArr[i].showPhoneInfo();
			}
		}
	}

	public static void delete(String pName) {
		int idx = 0;
		for (int i = 0; i < pNum; i++) {
			if (pName.equals(pArr[i].name)) {
				idx = i;
			}
		}
		if (idx > pNum) {
			System.out.println("이곳은 삭제 불가");
			return;
		}

		if (idx == pNum - 1) {
			pArr[idx] = null;
		} else {
			for (int i = idx; i < pNum - 1; i++) {
				pArr[i] = pArr[i + 1];
			}

		}
		pNum--;
	}

	public static void update(String pName) {
		int idx = 0;
		for (int i = 0; i < pNum; i++) {
			if (pName.equals(pArr[i].name)) {
				idx = i;
			}
		}		
		System.out.print("수정할 이름을 입력해주세요 : ");
		String name = keyboard.next();
		System.out.print("수정할 번호를 입력해주세요 : ");
		String num = keyboard.next();
		System.out.print("수정할 생년월일을 입력해주세요 : ");
		String birth = keyboard.next();
		pArr[idx].setPhoneInfo(name, num, birth);
	}

	public static void showAll() {
		System.out.println("--------------------");
		for (int i = 0; i < pNum; i++) {
			pArr[i].showPhoneInfo();
		}
		System.out.println("--------------------");
	}

	public static void programExit() {
		System.exit(0);
	}

	public static void main(String[] args) {
		int choice;

		while (true) {
			showMenu();
			choice = keyboard.nextInt();
			keyboard.nextLine();

			switch (choice) {
			case 1:
				add(readData());
				break;
			case 2:
				System.out.println("검색하고 싶은 이름을 입력해주세요 : ");
				search(keyboard.nextLine());
				break;
			case 3:
				System.out.println("삭제하고 싶은 이름을 입력해주세요 : ");
				delete(keyboard.nextLine());
				break;
			case 4:
				System.out.println("수정하고 싶은 이름을 입력해주세요 : ");
				update(keyboard.nextLine());
				break;
			case 5:
				showAll();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				programExit();
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
}