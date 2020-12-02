package heapSort1;

import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the Number:");
		int size = sc.nextInt();
		int array[] = new int[size];
		for (int i=0; i < size ; i++) {
			System.out.println("Enter the"+i+"th Element");
			array[i] = sc.nextInt();
		}
		//HeapSort
		HeapSort hs = new HeapSort(array);
		int hArray[] = hs.heapSort();
		for(int i=0 ; i< hArray.length; i++) {
			System.out.println(hArray[i]);
			
		}
		//MergeSort
		 MergeSort ms = new MergeSort(array,0,array.length-1);
		 ms.print();
		 
		 
		 
		 //SelectionSort
		 SelectionSort ss = new SelectionSort(array);
		 int sArray[] = ss.selectionSort();
		 for(int j=0 ; j<sArray.length ; j++) {
			 System.out.print(sArray[j]);
			 System.out.println("\t");
			 
		 }
		 //QuickSort
		System.out.println("");
		 System.out.println("QuickSort");
		 QuickSort qs = new QuickSort(array , 0 , array.length-1);
		 qs.quickSort(array , 0 , array.length-1);;
		 qs.print();
		 
		sc.close();
	}

}