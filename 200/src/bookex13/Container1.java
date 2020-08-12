package bookex13;

public class Container1 <T,M>{
	private T key;
	private M value;
	
	public T getKey() {return key;}
	public M getValue() {return value;}
	
	public void set(T key,M value) {
		this.key= key;
		this.value= value;
	}
}
