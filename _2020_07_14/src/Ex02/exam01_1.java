package Ex02;
/*
 * ����(wrapper)Ŭ����?
 * -�ڹ� ���� ������ Ÿ��(primitive data type)�� ��ü�� �ٷ�� ���� ���� Ŭ����
 * -byte, short,int,long,float,double,boolean,char
 *  byte => java.lang.Byte
 *  short=> java.lang.Short
 *  int => java.lang.Integer
 *  long =>java.lang.Long
 *  float =>java.lang.Float
 *  double => java.lang.Double
 *  char => jvava.lang.Character
 *  boolean =>java.lang Boolean
 */
public class exam01_1 {

	public static void main(String[] args) {
		byte b =10;
		Byte obj1 = new Byte(b);
		
		short s = 10;
		Short obj2 = new Short(s);
		
		int i=10;
		Integer obj3 = new Integer(i);
		
		long l=10L;
		Long obj4 = new Long(l);
		
		float f = 3.14f;
		Float obj5 = new Float(f);
		
		double d = 3.14;
		Double obj6= new Double(d);
		
		char c = '��';
		Character obj7 =new Character(c);
		
		boolean bool = true;
		Boolean obj8 = new Boolean(bool);
		
		
				
		
				}

}
