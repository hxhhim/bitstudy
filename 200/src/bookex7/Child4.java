package bookex7;

public class Child4 extends Parent4{
	private String name;
	
	public Child4() {
		this("ȫ�浿");
		System.out.println("Child4() call");
	}
	public Child4(String name) {
		this.name = name;
		System.out.println("Child4(String name) call");
	}
}
