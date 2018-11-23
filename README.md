# Stack-code
with execution of code

##### Stack: 
            A stack is an abstract data type that serves as a collection of elements.
A stack is a container of objects that are inserted and removed according to the last-in first-out (LIFO) principle.
In the pushdown stacks only two operations are allowed: push the item into the stack, and pop the item out of the stack.
A stack is a limited access data structure - elements can be added and removed from the stack only at the top. 
push adds an item to the top of the stack, pop removes the item from the top. A helpful analogy is to think of a stack of books;
you can remove only the top book, also you can add a new book on the top.


##### PUSH:it is used for add or insert data to the stack.
##### POP: it is used for delete or retrive data to the stack.
##### PEEK: it display the top data in the stack.
##### TRAVARSE: it display's the data in stack. 

# ARRAY-LIST
with code
##### Definition:
            Java ArrayList class uses a dynamic array for storing the elements. It inherits AbstractList class and implements List interface.
         
Let's see the declaration for java.util.ArrayList class.
                       public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable


##### Generic Collection:
                        Java generic collection allows to have only one type of object in a collection(such as Int,String,Float).
                        ex:
                            public class Arraylist{
                                    public static void main(String[] args){
                                         ArrayList<String> al=new ArrayList<String>();
                                           al.add("mango");
                                           al.add("apple");
                                           al.add("orange");
                                           al.addFirst("grapes");//add at starting level
                                           al.addLast("banana");//add at ending level
                                           al.remove(3);//remove list
                                           al.set(1,"potato");//update list
                                            }
                                    }



# LINKEDLIST:
              Linked List is a very commonly used linear data structure which consists of group of nodes in a sequence.

Each node holds its own data and the address of the next node hence forming a chain like structure.

Linked Lists are used to create trees and graphs.

Linked List implements Serializable and Clonable interface but not RandomAceess interface.
Linkedlist is the best choice if our frequent operation is insertion or delition in the middle.
linkedlist is the worst choice if our frequent operation is retrieval operation.
##### LinkedList Constructores:
                        LinkedList li=new LinkedList(); -->create an emptylist
                        LinkedList li=new LinkedList(Collection c); -->create an equivalent object
## Difference Between ArrayList and LinkedList:

##### ArrayList	                                                            
1. ArrayList internally uses a dynamic array to store the elements.	
2. Manipulation with ArrayList is slow because it internally uses array.If any element is removed from the array, all the bits shifts in memory.
3. An ArrayList class can act as a list only because it implements List only.
4. ArrayList is better for storing and accessing data.
##### LinkedList
1. LinkedList internally uses a doubly linked list to store the elements.
2. Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
3. LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
4. LinkedList is better for manipulating data.

