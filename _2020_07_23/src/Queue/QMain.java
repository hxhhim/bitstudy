package Queue;

public class QMain {

	public static void main(String[] args) {
		int i;
		Queue q = new Queue();
		
		q.put(3);
		System.out.println(q);
		q.put(4);
		System.out.println(q);
		q.put(5);
		System.out.println(q);
		q.put(6);
		System.out.println(q);
		q.put(7);
		System.out.println(q);
		q.put(8);
		System.out.println(q);
		q.put(9);
		
		
		i = q.get();
		System.out.println(q);
		i = q.get();
		System.out.println(q);
		i = q.get();
		System.out.println(q);
		i = q.get();
		System.out.println(q);
		i = q.get();
		System.out.println(q);
		i = q.get();
		System.out.println(q);
		i = q.get();
		System.out.println(q);
		i = q.get();
		System.out.println(q);
		i = q.get();
		System.out.println(q);
		i = q.get();
		System.out.println(q);
		i = q.get();
		System.out.println(q);
		i = q.get();
		System.out.println(q);
		i = q.get();
		
		q.put(5);
		System.out.println(q);
		q.put(4);
		System.out.println(q);
		q.put(3);
		System.out.println(q);
		q.put(2);
		System.out.println(q);
		q.put(1);
		System.out.println(q);
		q.put(2);
		System.out.println(q);
		q.put(3);
		System.out.println(q);
		q.put(4);
		System.out.println(q);
	}

}
