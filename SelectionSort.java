package heapSort1;

public class SelectionSort {
	int sArray[];
	SelectionSort(int array[]){
		sArray = array;
	}
	int[] selectionSort() {
		for(int j=0;j<sArray.length-1;j++) {
			int min = j;
			for(int k = j+1;k<sArray.length;k++) {
				if(sArray[min]>sArray[k]) {
					min = k;
				}
			}
			int temp = sArray[min];
			sArray[min] = sArray[j];
			sArray[j] = temp;
		}
		
		
	return sArray;
	}
}
