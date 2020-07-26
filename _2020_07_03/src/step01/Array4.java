package step01;

public class Array4 {
	int[] arr;
	
	void initByIndexValue() {
		for (int i =0; i< arr.length;i++) {
			arr[i]= i;
			}
}
 void sort() {
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
 void printAll( int keyIndex) {
	for (int i=0 ; i<arr.length ; i++) {
		if (keyIndex >=0 &&i ==keyIndex) {
			System.out.printf("[%d] ",arr[i]);
		}else {
			System.out.printf("%d ", arr[i]);
			
		}
	}System.out.println();
}


void mix () {
int index1, index2, temp;
for(int i=0; i<arr.length;i++) {
	index1= (int)(Math.random()*arr.length);
	index2= (int)(Math.random()*arr.length);
	temp = arr[index1];
	arr[index1] = arr[index2];
	arr[index2] = temp;
}
}
}
