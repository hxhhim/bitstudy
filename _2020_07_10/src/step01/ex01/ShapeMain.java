package step01.ex01;

public class ShapeMain {

	public static void main(String[] args) {
		
		Rect r = new Rect();
		Tri t = new Tri();
		print(r);
		print(t);
	}
	static void print(Shape s) {
		if(s instanceof Rect) {
	
			Rect r =(Rect)s;
			r.Draw();
	}
		if(s instanceof Tri) {
			Tri t = (Tri)s;
			t.Draw();
		}
	}

}
