package heapSort1;

public class HeapSort1{
	int hArray[];
	HeapSort1(int array[]){
		hArray = array;
	}
	void maxHeapify(int i,int hArray[], int heapSize){
		int l = 2*i+1;
		int r = 2*i+2;int largest;
		if (l<heapSize && hArray[l]>hArray[i]){
			largest = l;
		}
        else{
			largest = i;
		}
        if(r<heapSize && hArray[r]>hArray[largest]){
			largest = r;
		}
        if (largest != i){
			int temp = hArray[largest];
			hArray[largest] = hArray[i];
			hArray[i] = temp;
			maxHeapify(largest,hArray,heapSize);
		}  		
	}
void buildMaxHeap(int hArray[]){
	for(int i=(hArray.length/2)-1;i>=1;i--){
		maxHeapify(i,hArray,hArray.length);
	}
}
public int[] HeapSort(){
buildMaxHeap(hArray);
for( int i=hArray.length-1;i>=1;i--){
	int temp = hArray[1];
	hArray[i] = hArray[1];
	hArray[1] = temp;
	maxHeapify(0,hArray,i);
  }
  return hArray;
 }
}