package List;

public class ListMain {

	public static void main(String[] args) {
	/*	Node n1 =new Node(100);
		Node n2 =new Node(200);
		Node n3 =new Node(300);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = null;
		
		Node head  = n1;
		print(head);
		*/
		List list = new List();
		list.addtail(4);
		list.addtail(5);
		list.addtail(6);
		list.addtail(7);
		print(list.head);
		list.delete(5);
		print(list.head);
		list.delete(6);
		print(list.head);
		list.delete(6);
		print(list.head);
//		list.add(4);
//		list.add(5);
//		list.add(6);
//		list.add(7);
//		print(list.head);
		
	}
	static void print(Node node) {
		Node temp = node;
		while(temp !=null) {
			System.out.printf("[%d]->",temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

}
