package Ex03;

public class Book4 {
	String title;
	String author;
	int pageSize;
	
	public Book4() {}
	public Book4(String title, String author, int pageSize) {
		this.title = title;
		this.author = author;
		this.pageSize = pageSize;
	}
	@Override
	public String toString() {
		return "Book[title="+title+", author= "+author+", pageSize="+pageSize+"]";
	}
	@Override
	public int hashCode() {
		final int prime =31;
		int result = 1;
		result = prime *result+((author ==null)?0:author.hashCode());
		
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		Book4 other =(Book4)obj; //obj를 Book4형변환
		if(author == null) {
			if(other.author != null)
				return false;
		}else if(!author.equals(other.author)) {
			return false;
		}
		if(pageSize != other.pageSize)
			return false;
		
		if(title == null) {
			if(other.title != null)
				return false;
		}else if(!title.equals(other.title)) {
			return false;
		}
				
		return true;
		/*		if(this.title == obj.title) {
			if(this.author == obj.author) {
				 if(this.pageSize == obj.pageSize) {
					 return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
							
	}else {
		return false;
}*/
	}
}
