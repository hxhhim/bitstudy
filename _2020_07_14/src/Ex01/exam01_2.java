package Ex01;

import java.util.Calendar;

public class exam01_2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		//�׸� ��ȣ : ��(1),��(2)+1�ϴ����� 0���Ϳ���,��(5),��(12�ð�:10,24�ð�:11),��(12),��(13)
		System.out.printf("%d-%d-%d %d:%d:%d\n",
				cal.get(1),
				cal.get(2)+1,
				cal.get(5),
				cal.get(11),
				cal.get(12),
				cal.get(13));
		//��� �����: �ڵ尡 �б� ���ϴ�. ���ذ� ������.
		System.out.printf("%d-%d-%d %d:%d:%d\n",
				cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH)+1,
				cal.get(Calendar.DAY_OF_MONTH),
				cal.get(Calendar.HOUR_OF_DAY),
				cal.get(Calendar.MINUTE),
				cal.get(Calendar.SECOND));
				

	}

}
