package bookex6;

public class AccoutExample {
	
	public static void main(String[] args) {
		Accout account = new Accout();
				
		account.setBalance(10000);
		System.out.println("ÇöÀç ÀÜ°í: "+ account.getBalance());
		
		account.setBalance(-100);
		System.out.println("ÇöÀç ÀÜ°í: "+ account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("ÇöÀç ÀÜ°í: "+ account.getBalance());
		
		account.setBalance(300000);
		System.out.println("ÇöÀç ÀÜ°í: "+ account.getBalance());
	}

}
