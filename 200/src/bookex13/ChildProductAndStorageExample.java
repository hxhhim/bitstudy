package bookex13;

public class ChildProductAndStorageExample {

	public static void main(String[] args) {
		ChildProduct<Tv1,String,String>product = new ChildProduct<>();
		product.setKind(new Tv1());
		product.setModel("SmartTV");
		product.setCompany("Samsung");
		
		Storage<Tv1> storage = new StorageImpl<Tv1>(100);
		storage.add(new Tv1(), 0);
		Tv1 tv = storage.get(0);
				

	}

}
