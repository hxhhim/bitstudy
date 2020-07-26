package step01;

//�޼��� �뵵
// static �޼���
// ==> ��ɾ ���� ���� �뵵
//==> ���� ����� ��ɾ �޴���� ������ ������� 
// ����θ� �ʿ��Ҷ� ���� ������ �� �ִ�.
// ==> �Ź� ���� �ڵ带 �ݺ��ؼ� ĥ �ʿ䰡 ����.
public class Exam05 {
	
		
	static void initByIndexValue(int[] arr) {
			for (int i =0; i< arr.length;i++) {
				arr[i]= i;
				}
	}
	static void sort(int[] arr) {
		int temp;
		for(int x =1; x<arr.length; x++) {
			for(int i =0 ; i<arr.length-x; i++) {
				if(arr[i]>arr[i+1]) {
					temp = arr[i];
					arr[i] =arr[i+1];
					arr[i+1]= temp;
				}
			}
		}
	}
	static void printAll(int[] arr, int keyIndex) {
		for (int i=0 ; i<arr.length ; i++) {
			if (keyIndex >=0 &&i ==keyIndex) {
				System.out.printf("[%d] ", arr[i]);
			}else {
				System.out.printf("%d ", arr[i]);
				
			}
		}System.out.println();
	}
	



static void mix (int[] arr) {
	int index1, index2, temp;
	for(int i=0; i<arr.length;i++) {
		index1= (int)(Math.random()*arr.length);
		index2= (int)(Math.random()*arr.length);
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
public static void main(String[] args) {
	int [] arr = new int[20];
	initByIndexValue(arr);
	mix(arr);
	printAll(arr,-1);
	sort(arr);
	printAll(arr,-1);
	System.out.println("-----------------");
	mix(arr);
	printAll(arr,-1);
	sort(arr);
	printAll(arr,-1);
	}
}