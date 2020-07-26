package base;

public class BaseBallMain {
	public static int[] baseball = new int[3];
	public static void main(String[] args) {
		BaseBallMenu menu = new BaseBallMenu();
		GeneratorThreeNum gen = new GeneratorThreeNum();
		gen.makeRandomNum(baseball);
		for (int i : baseball) {
			System.out.print(i);
		}
		System.out.println();
		menu.menu(baseball);
	}
}
