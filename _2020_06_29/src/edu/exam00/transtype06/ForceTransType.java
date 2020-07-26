package edu.exam00.transtype06;

// 강제 형변환
// 자동으로 형변환이 이루어지지 않을때
// 우리의 의도하에 강제로 변환시키는 것
// 사이즈가 큰 것 or 범위가 큰것을
// ==> 작은 것으로 변환하려고 할때

public class ForceTransType {
	public static void main(String[] args) {
		//1byte를 제외한 3byte가 사라짐
		//byte범위를 넘는 숫자는 값이 왜곡됨
		int num = 0b00000_0000_0000_0000_0000_0001_0000_0011;
		byte b = (byte)num;
		System.out.println(num);
		System.out.println(b);
		
		//char(2byte) 0x0000~0xFFFF 캐릭터는 음수가 없다.
		//short(2byte) -7FFF~ 7FFF
		char ch = '가';
		int i;
		i = ch;
		short s = (short)ch;
		System.out.printf("ch:  0x%02X s: 0x%02X\n",i, s);
		System.out.println(s);
		
		
		//같은 4byte라 할지라도 float가 표현범위가 넓기 때문에
		//소수점이 업성진다.
		float f = 13.3f;
		int ii = (int)f;
		System.out.println(ii);
		
		//long 8byte 이고 float는 4byte지만
		//float가 표현범위가 크기때문에
		//lval은 float로 자동 변환된다.
		long lval = 1234L;
		float fNum = lval;
		System.out.println(fNum);
		
	}
}
