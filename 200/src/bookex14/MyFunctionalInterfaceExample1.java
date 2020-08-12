package bookex14;

public class MyFunctionalInterfaceExample1 {

	public static void main(String[] args) {
		MyfunctionalInterface1 fi;
		
		fi=(x)->{
			int result = x *5;
			System.out.println(result);
		};
		fi.method(2);
		
		fi = (x)->{System.out.println(x*5);};
		fi.method(2);
		
		fi = x-> System.out.println(x*5);
		fi.method(2);

	}

}
