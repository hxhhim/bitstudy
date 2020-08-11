package bookex13;

public class ChildProduct <T,M,C> extends Product1<T,M>{
	private C company;
	public C getCompany() {return this.company;}
	public void setCompany(C company) {this.company=company;}

}
