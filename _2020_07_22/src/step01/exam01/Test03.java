package step01.exam01;

public class Test03 {

	public static void main(String[] args) {
		//������ ȯ�ڸ�"Patient"��� Ŭ������ �߻�ȭ(������ȭ)���״�.
		Patient p = new Patient();
		p.name = "�Ӳ���";
		p.age = 30;
		p.weight = 90;
		p.height = 180;
		p.gender = false;
		
		Patient p2 = new Patient();
		p2.name = "ȫ�浿";
		p2.age = 300;		//ȯ�ڳ��̷� �������� �ʴ�.
		p2.weight = 70;
		p2.height = -30;	//ȯ���� Ű�� �������� �ʴ�.
		p2.gender = false;
		//p2�� ���ó�� ��ȿ���� �ʴ� ���� �ְԵǸ�,
		//ȯ�� �����ͷμ� �ŷڼ��� ����ϰ� �ȴ�.
		//=>Patient�� �߻�ȭ ��Ų �ǹ̰� ��ǵȴ�.
		//=>�ذ�å?
	

	}

}