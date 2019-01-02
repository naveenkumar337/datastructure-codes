class InsertionSort 
{ 
	 public static void main (String[] args) {
	  
	    int j;
	 
	   int[] arr={1,5,3,8,2};
	   int n=arr.length;
     
     /**here set from element 1 to n-1,because we know last element 
     automatically set after complition of thos operations*/
     
	   for(int i=1;i<n;i++){
     
          //create one temp variable and store select value to in.
          
	       int k=arr[i];
         
	       j=i-1;
         //condition will true value will store at next index arr[j+1].
	   
     while(j>=0 && arr[j]>k){    
	            arr[j+1]=arr[j];
	            j=j-1;
	        }
          //else key value store at original position
	        arr[j+1]=k;
	     
	   }
	   for(int i=0;i<n;i++){
	       System.out.println(arr[i]);
	   }
	
	} 
} 
