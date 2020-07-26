package ex05;

import java.util.ArrayList;

public class Test06 {

	public static void main(String[] args) {
		class Cookie{
			String name;
			int price;
			public Cookie(String name, int price) {
				this.name = name;
				this.price = price;
			}
			@Override
			public String toString() {
				return "Cookie [name= " + name +",pricd="+price+"]";
			}
		}
		ArrayList<Cookie> list = new ArrayList<>();
		list.add(new Cookie("»õ¿ì±ø",1000));
		list.add(new Cookie("¸Àµ¿»ê",1200));
		list.add(new Cookie("¿ÀÂ¡¾î¶¥Äá",1300));
		
		for(Cookie c : list) {
			System.out.println(c);
		}
	}

}
