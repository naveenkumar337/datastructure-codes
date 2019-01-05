/**
 * Bouble sort is an algorithm
.
 * 
 * here,values compare with adjecency values if values greter then another one values should be swap 
 * 
 * It,means the small values will place at before the larger values.
 * 
 * {10,20,30,40,50,60}
 * 
 * 
 */



package programmes;
import java.util.*;
public class boublesort {

	public static void main(String[] args) {
		
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
		int n=sc.nextInt();
	
		
		int[] arr= new int[n];
		System.out.println("enter elements:");
		for(int i1=0;i1<n;i1++) 
		{
			arr[i1]=sc.nextInt();
		}
		
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("sorting order is:");
		for(int i1=0;i1<arr.length;i1++) {
			System.out.println(arr[i1]);
		}
	}

}
