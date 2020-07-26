package step01.ex01;

class Shape {
	
	void Draw() {
		System.out.println("Shape() 그리기");
		
	}
}

class Tri extends Shape{
	void Draw() {
		System.out.println("Tri() 그리기");
	}
}

class Rect extends Shape{
	void Drw() {
		System.out.println("Rect() 그리기");
	}
}