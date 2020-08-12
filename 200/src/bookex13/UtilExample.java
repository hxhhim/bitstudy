package bookex13;

public class UtilExample {

	public static void main(String[] args) {
		Pair1<String,Integer> pair = new Pair1<>("È«±æµ¿",35);
		Integer age = Util2.getValue(pair,"È«±æµ¿");
		System.out.println(age);
		
		ChildPair<String,Integer> childPair = new ChildPair<>("È«»ï¿ø",20);
		Integer childage= Util2.getValue(childPair,"È«»ï¼ø");
		System.out.println(childage);

	}

}
