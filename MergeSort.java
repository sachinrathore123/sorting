package heapSort1;

public class MergeSort {
	int p; int r; int mArray[];
	MergeSort(int array[],int begin,int end){
		mArray = array;
		p = begin;
		r = end;
	}
	void mergeSort(int mArray[],int p,int r) {
		if(p<r) {
			int q = (p+r)/2;
			mergeSort(mArray,p,q);
			mergeSort(mArray,q+1,r);
			merge(mArray,p,q,r);
		}
	}
	void merge(int mArray[],int p,int q, int r) {
		int n1 = q-p+1;
		int n2 = r-q;
		int lArray[] = new int[n1];
		int rArray[] = new int[n2];
		for(int i = 0; i<n1; i++) {
			lArray[i] = mArray[p+i-1];
		}
		for(int j=0;j<2;j++) {
			rArray[j] = mArray[q+j];
		}
		int i=1;
		int j=1;
		for(int k=p;k<r;k++) {
			if(n1>n2) {
			if(i<n1 && lArray[i]<rArray[j]) {
				mArray[k] = lArray[i];
				i++;
			}
			else {
				mArray[k] = rArray[i];
				j++;
			}
			}
			else {
				if(j<n2 && lArray[i] < rArray[j]) {
		    		mArray[k]=lArray[i];
		    		i=i++;
		}
				else {
				mArray[k]=rArray[j];
				j++;
				}
				}
				
			
	}
	}
	
	void print(){
		for(int i =0 ; i < mArray.length; i++) {
			System.out.println(mArray[i]);
			
			
		}
		}
}
