package step01.ex01;

class Shape {
	
	void Draw() {
		System.out.println("Shape() �׸���");
		
	}
}

class Tri extends Shape{
	void Draw() {
		System.out.println("Tri() �׸���");
	}
}

class Rect extends Shape{
	void Drw() {
		System.out.println("Rect() �׸���");
	}
}