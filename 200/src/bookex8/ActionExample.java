package bookex8;

public class ActionExample {

	public static void main(String[] args) {
		Action action = new Action() {
		public void work() {
			System.out.println("복사를합니다.");
		}
		
		};

				
		action.work();
	}

}
