/**

stack: the stack is an one operation to perform to collect data in acceding or descending order by using first-in-last-out (or)last-in-first-out technique.
 

it usage LIFO AND FILO

*/
package Stack;
import java.util.Scanner;
class Stack {
	static Scanner sc=new Scanner(System.in);
	static int size;
	static int stack[],top=-1;

	/**
		create a stack
	*/


static {
	Stack.create();
	}
	

	public static void main(String[] args) {
	int ch,item;
	/**
		in build operations to perform
	*/


	while(true) {
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Peek");
		System.out.println("4.Travarse");
		System.out.println("5.exit");
		
		System.out.println("enter your choice");
		ch=sc.nextInt();
			
		
		switch(ch){
		
/** 
Push:it is used for add or insert data into the stack.

call push operation:
	
*/


		case 1: System.out.println("enter element");
				item=sc.nextInt();
				push(item);
				break;
					
/** 
pop:it was used for delete top or recent enter data.
	call pop operation:
*/
					
		case 2: item=Stack.pop();
				if(item==0) {
					System.out.println("stack is underflow");
				}

				else {
					System.out.println("popped element"+item);
				}

				break;
							
/** 
peek:it display top data in a stack
   call peek() method
*/
							
		case 3:	item=Stack.peek();
				if(item==0) {

					System.out.println("stack is underflow");
				}

				else {

					System.out.println("peeked element"+item);
				} 

				break;





/** travarse: method for display data on the stack.
	call travarse() method.
*/

		
		case 4: 	Stack.travarse();
				break;
	
/** exit*/			
		case 5: 	System.exit(1);
				break;
				
		default:
				System.out.println("your choice is in correct");
					
			}
		}
		

}



/** coding for create a stack */

 static void create() {
	System.out.println("enter size of the stack");
	size=sc.nextInt();
	stack=new int[size];
	System.out.print("stack created successfully");
 }


/**
after call a push:
		code for push operation
*/


 static void push(int item){

	 		if(Stack.isFull()) 						/**isFull() method call*/
			{
	 			System.out.println("stack is overflow");
	 		}
	 		else {
	 			Stack.stack[++top]=item;
		 	}
 }


/**  code for isFull() operation  */
	 
	static boolean isFull() {
	 			if(Stack.top==size-1) {
	 				return true;
	 			}
	 			else {
	 				return false;
			 
	 			}
		 
	 		}


/** 
after calling pop:
		pop operation coding.
*/

static int pop() {
		if(Stack.isEmpty()) {
			 return 0;
		 }
		 else {
			 return stack[top--];
			 
		 }
	 }


	 static boolean isEmpty()						/** isEmpty() method coding */
	 {
		 	if(Stack.top==-1){
			 return true;
		 }
		 else {
			 return false;
			 
		 }
	 }


/**
after calling peek():
		coding for peek operation.
*/


static int peek() {
		 if(Stack.isEmpty()) {					/** isEmpty() operation going to previous is isEmpty() method*/
			 return 0;
		 }
		 else {
			 return stack[top];
			 
		 }
	 }


/** after calling travarse():
			coding for travarse()
*/

static void travarse() {
		 if(Stack.isEmpty()) {
			 System.out.println("stack is empty");
			 
		 }
		 else {
			 System.out.println("elements are:");
			 for(int i=top;i>=0;i--) {
				 System.out.println(stack[i]);
			 }
		 }
	 }
 }
 

