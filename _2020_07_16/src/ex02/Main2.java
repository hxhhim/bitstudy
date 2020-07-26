package ex02;

interface ICamera{
	public void take();
}

class Camera1 implements ICamera{
	public void take() {
		System.out.println("take picture");
	}
}


class HDCamera1 implements ICamera{
	public void take() {
		System.out.println("take picture HDC");
	}
}

class SHDCamera implements ICamera{
	public void take() {
		System.out.println("take picture SHDC");
	}
}
class People1 {
	public void useCamera(ICamera p) {
		p.take();
	}
}

public class Main2 {

	public static void main(String[] args) {
		People1 p = new People1();
		Camera1 c1 = new Camera1();
		
		p.useCamera(c1);
		HDCamera1  hdc = new HDCamera1();
		p.useCamera(hdc);
		SHDCamera shdc = new SHDCamera();
		p.useCamera(shdc);

	}

}
