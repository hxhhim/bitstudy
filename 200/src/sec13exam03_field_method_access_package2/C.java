package sec13exam03_field_method_access_package2;

import sec13exam03_field_method_access_package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1;		default ���ٺҰ�
//		a.field3 = 1;		private ���ٺҰ�
		
		a.method1();
//		a.method2();		default ���ٺҰ�
//		a.method3();		private ���ٺҰ�
	}
}
