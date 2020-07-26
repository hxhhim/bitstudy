package ex02;

class Camera{
	public void take() {
		System.out.println("take picture");
	}
}


class HDCamera{
	public void take() {
		System.out.println("take picture HDC");
	}
}
class People {
	public void useCamera(Camera p) {
		p.take();
	}
	public void useCamera(HDCamera p) {
		p.take();
	}
}

public class Main {

	public static void main(String[] args) {
		People p = new People();
		Camera c1 = new Camera();
		
		p.useCamera(c1);
		HDCamera  hdc = new HDCamera();
		p.useCamera(hdc);
		

	}

}
