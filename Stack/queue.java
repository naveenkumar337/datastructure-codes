package programmes;
import java.util.*;
//import capacity 10;
public class Queue {
	
	private static Scanner sc=new Scanner(System.in);
	private static int rear=0;
	private static int front=0;
	private static int[] queue;
	public static void insert() {
		
		if(queue.length==rear) {
				System.out.println("\n\t ****QUEUE IS FULL**** ");
		}
		else {
			int ele;
			System.out.println("\nenter elel:");
			ele=sc.nextInt();
			queue[rear]=ele;
			rear++;
		}
		
	}
	public static void deletion() {
		if(front==rear) {
		System.out.println("\n\t****QUEUE IS EMPTY****");
	}
		else {
		System.out.println("\n deleted item is:"+queue[front]);
		
		for(int i=0;i<rear-1;i++) {
			queue[i]=queue[i+1];
			
		}
		rear--;
	}
		}
	public static void traverse() {
		if(front==rear) {
			System.out.println("\n \t****QUEUE IS EMPTY****");
		}
		else {
			System.out.println("\n elements are:");
			for(int i=front;i<rear;i++) {
				System.out.println(queue[i]);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		
		
		
		System.out.println("enter size of queue:");
		 int n=sc.nextInt();
		queue=new int[n];
		while(true) {
			System.out.println();
		System.out.println("1.insert");
		System.out.println("2.deletion");
		System.out.println("3.traverse");
		System.out.println("4.exit");
		//System.out.println("\n");
		
		System.out.println("\nenter your choice:");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1: insert();
			break;
		case 2: deletion();
			break;
		case 3: traverse();
			break;
		case 4: 
			System.exit(0);
		break;
		}
		}
		
	}

	
}
