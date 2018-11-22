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
