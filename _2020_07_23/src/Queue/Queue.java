package Queue;

import java.util.Arrays;
/*
public class Queue {
	int[] arr;
	int front = 0;
	@Override
	public String toString() {
		return "Queue [arr=" + Arrays.toString(arr) + ", front=" + front + ", rear=" + rear + "]";
	}
	int rear = 0;
	public Queue(){
		this(5);
	}
	public Queue(int no) {
		arr = new int[no];
	}
	boolean isFull() {
		return rear ==arr.length;
	}
	boolean isEmpty() {
		return rear==front;
	}
	public void put(int val) {
		if(isFull()) {
			int[] temp = new int[arr.length*2];
			for(int j=0;j<arr.length;j++)
				temp[j]=arr[j];
			arr = temp;
			return;
		}
		arr[rear++] = val;
	}
	public int get() {
		if(isEmpty()) {
			System.out.println("큐가 비었습니다.");
			return-1;
		}
		return arr[front++];
	}
}*/
public class Queue {
	int[] arr;
	int front = 0;
	@Override
	public String toString() {
		return "Queue [arr=" + Arrays.toString(arr) + ", front=" + front + ", rear=" + rear + "]";
	}
	int rear = 0;
	public Queue(){
		this(5);
	}
	public Queue(int no) {
		arr = new int[no];
	}
	boolean isFull() {
//		return rear ==arr.length;
		return ((rear+1)%arr.length) == front;
	}
	boolean isEmpty() {
		return rear==front;
	}
	public void put(int val) {
		
		if(isFull()) {
			System.out.println("큐가 꽉찼습니다.");
		}
		arr[rear] = val;
		rear = (rear+1)%arr.length;
	}
	public int get() {
		int data;
		if(isEmpty()) {
			System.out.println("큐가 비었습니다.");
			return-1;
		}		
		data = arr[front];
		arr[front]=0;
		front = (front+1)%arr.length;
		return data;
	}
}