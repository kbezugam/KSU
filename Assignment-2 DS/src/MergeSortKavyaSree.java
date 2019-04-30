import java.util.*;


public class MergeSortKavyaSree {

	
	public static void main(String args[]) 
    { 
        int input[] = new int[10]; 
        Scanner scanner = new Scanner(System.in);
        for(int i =0; ;i++)
        
  
        System.out.println("Given Array"); 
        printArray(input); 
  
        mergeSort(input,5); 
        
  
        System.out.println("\nSorted array"); 
        printArray(input); 
    } 
	
	
	static void printArray(int input[]) 
    { 
        int n = input.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(input[i] + " "); 
        System.out.println(); 
    } 
  
	
	
	public static void mergeSort(int[] input, int n) {
	    if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];
	 
	    for (int i = 0; i < mid; i++) {
	        l[i] = input[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = input[i];
	    }
	    mergeSort(l, mid);
	    mergeSort(r, n - mid);
	 
	    merge(input, l, r, mid, n - mid);
	}
	public static void merge(
			  int[] a, int[] l, int[] r, int left, int right) {
			  
			    int i = 0, j = 0, k = 0;
			    while (i < left && j < right) {
			        if (l[i] <= r[j]) {
			            a[k++] = l[i++];
			        }
			        else {
			            a[k++] = r[j++];
			        }
			    }
			    while (i < left) {
			        a[k++] = l[i++];
			    }
			    while (j < right) {
			        a[k++] = r[j++];
			    }
			}

}
