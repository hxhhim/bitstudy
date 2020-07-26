package bookex6;

public class Accout {
	
	private int balance = 0; 
	public Accout() {
		
	}
	public int getBalance() {
		
		return balance;
	}
	public int setBalance(int num) {
		if(num<=0||num>=1000000) {
			return balance;
		}else {
			balance=num;
		}return balance;
		
	}
}
