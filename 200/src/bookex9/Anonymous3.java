package bookex9;

public class Anonymous3 {
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
		}
	};
			
	void method1() {
		Vehicle locaVar= new Vehicle() {

			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
				}
			};
				
		locaVar.run();
	}
	void method2(Vehicle v) {
		v.run();
	}
}
