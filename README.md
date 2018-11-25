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



# VECTOR
            vector implements dynamic array. It is similar to Arraylist,but with two difference 
                        1.vector is synchronized.
                        2.vector contain lagacy methods thats not part of collection framework.
  ##### Vetor follows some points:
    1.Its allow duplicate values.
    2.Insertion order is Preserved.
    3.Null insertion is possible.
    4.Hetrogeneous objects are allowed.
    5.Vector class implements serializable,cloneble and randoaccess.
    6.It is best choice for if our frequent operation is retrieval.
    7.Underlying datastructure for vector is Resizable array.
## Difference between ArrayList and Vector:
##### ArrayList:
1. ArrayList is not synchronized.
2. ArrayList increments 50% of current array size if the number of elements exceeds from its capacity.
3. ArrayList is not a legacy class.
4. ArrayList is fast because it is allow multiple thead methods at a time.
##### Vector:
1. Vector is synchronized.
2. Vector increments 100% means doubles the array size if the total number of elements exceeds than its capacity.
3. Vector is a legacy class.
4. Vector is slow because it is allow only one thread method at a time.

# SETS
            Set is chaild interface of collections. If we represents a group of individual objects as a single entity,whre duplicates are not allowed and insertion order not preserved, Then we use sets.
            sets does not contain any new methods.
            
            Besically sets are:
            1. HashSet
            2. LinkedHashSet
            3. SortedSet
            4. NavigableSet
            5. TreeSet
            
## 1.HASHSET:
##### Importent points of HashSet
   1. The undelying datastructure is HASH TABLE.
   2. Duplicates are not allowed,if we trying to insert duplicate values,we won't get any compilation and runtime errors,it's simply returns flase.
   3. Insertion order not preserved and all objects will be inserted based on HASHCODE of objects
   4. Hetrogeneous objects are allowed.
   5. Null insertion is possible.
   6.implementation os Serializable and cloneble are possible.
   7. HashSet is best for our frequent operation is Search.
   
 #### Constructors of HashSet
            1.  Hashset set=new Hashset();
                       - It is empty set with initial capacity=16 and default Fill ratio=0.75(it means after insertion of 75% increase capacity).
            
            2.  Hashset set=new Hashset(int initialcapacity);
                        -Creates an empty hashset object with specified initial capacity and default fillratio=0.75.
                        
            3.  Hashset set=new Hashset(int initialcapacity,float loadcapacity);
            
                        -Creates an empty hashset object with specified initialcapacity and loadfactor.
            
            4.  Hashset set=new Hashset(Collection c);
                        -For inter convention between collection object.
                        

## 2.LINKEDHASHSET:
            It is chaild interface of Hashset.
   Importent points are:
  1. It was introduced in 1.4 version.
  2. It is exactly same as hashset except following difference
     1. The underlying datastructure is hashcode+linkedlist.
     2. insertion order is not preserved.
 
