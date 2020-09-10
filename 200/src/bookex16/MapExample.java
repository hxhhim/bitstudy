package bookex16;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		List<Student1> studentList = Arrays.asList(
				new Student1("ȫ�浿",10),
				new Student1("�ſ��",20),
				new Student1("���̼�",30)
				);
		studentList.stream()
		.mapToInt(Student1 :: getScore)
		.forEach(score->System.out.println(score));
	}

}
