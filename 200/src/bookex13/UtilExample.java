package bookex13;

public class UtilExample {

	public static void main(String[] args) {
		Pair1<String,Integer> pair = new Pair1<>("ȫ�浿",35);
		Integer age = Util2.getValue(pair,"ȫ�浿");
		System.out.println(age);
		
		ChildPair<String,Integer> childPair = new ChildPair<>("ȫ���",20);
		Integer childage= Util2.getValue(childPair,"ȫ���");
		System.out.println(childage);

	}

}
