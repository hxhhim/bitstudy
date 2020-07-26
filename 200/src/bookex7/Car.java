package bookex7;

public class Car {
	//필드
	Tire[] tires= {
			new Tire("앞왼쪽",6),
			new Tire("앞오른쪽",2),
			new Tire("뒤왼쪽",3),
			new Tire("뒤오른쪽",4),
	};
			
	
	
	
	
/*	Tire frontLeftTire = new Tire("앞왼쪽",6);
	Tire frontRightTire = new Tire("앞오른쪽",2);
	Tire BackLeftTire = new Tire("뒤왼쪽",3);
	Tire BackRightTire = new Tire("뒤오른쪽",4);
*/	//생성자
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		for(int i=0; i<tires.length;i++) {
			if(tires[i].roll()==false) {
				stop();
				return (i+1);
			}
		}
		
/*		if(frontLeftTire.roll()==false) {stop();return 1;}
		if(frontRightTire.roll()==false) {stop();return 2;}
		if(BackLeftTire.roll()==false) {stop();return 3;}
		if(BackRightTire.roll()==false) {stop();return 4;}
*/		return 0;
	}
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
