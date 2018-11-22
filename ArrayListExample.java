package com.company;
//import com.sun.java.util.jar.pack.Instruction;

import java.util.*;
import java.lang.*;
import java.util.ArrayList;
/**
 * Java ArrayList class can contain duplicate elements.
 * Java ArrayList class maintains insertion order.
 * Java ArrayList class is non synchronized.
 * Java ArrayList allows random access because array works at the index basis.
 * In Java ArrayList class, manipulation is slow because a lot of shifting needs to occur if any element is removed from the array list.
 * Java arraylist is used for modify the list*/
//refer_calsses
 class ArrayListitem {
    private ArrayListitem al=new ArrayListitem();

     int size=0;

//add element to the arraylist
    public void addarraylistitem(int item){
        al.add(item);
    }
    //modify the element
    public void modifyarraylistitem(int pos,int newitem){
        al.set(pos,newitem);
        System.out.println("arraylist item"+(pos+1)+"has modified");
    }
    //remove element
    public void removearraylistitem(int pos){
        al.get(pos);
        al.remove(pos);
     }
    // find element
     public int findarraylistitem(int searchitem){
        //search item is on the list or not
        int pos =al.indexOf(searchitem);

        if(pos>=0){
            return al.get(pos);
        }
        return 0;
     }

 }

 //main class
public class ArrayListExample{
     private static Scanner sc=new Scanner(System.in);
     private static ArrayListitem ali=new ArrayListitem();

     public static void main(String[] args){
         int choice=0;

         while(true){

             System.out.println("1.additem");
             System.out.println("1.modifyitem");
             System.out.println("1.removeitem");
             System.out.println("1.searchitem");

             System.out.println("enter your choice");
             choice=sc.nextInt();
            //methods calling
             switch(choice){
                 case 1: additem();
                        break;

                 case 2: modifyitem();
                        break;

                 case 3: removeitem();
                        break;

                 case 4: searchitem();
                        break;

                  default:
                      System.out.println("enter correct choice");
             }

         }
     }
    //method initilization
     public static void additem(){
         System.out.println("enter item to add:");
         ali.addarraylistitem(sc.nextInt());
         /**
          * here object was not created but we access the data by using static method
          * in static method data will acceess using arraylist(obj).refer_classname()
          * */
     }
     //modify method initilization
     public static void modifyitem(){
         System.out.print("enter position to modify");
         int pos=sc.nextInt();
         System.out.print("enter newitem to modify");
         int newitem=sc.nextInt();
         ali.modifyarraylistitem(pos-1,newitem);
     }
     //remove method initilization
     public static void removeitem(){
         System.out.print("enter position to remove");
         int pos=sc.nextInt();
         ali.removearraylistitem(pos);
    }
    //search method initilization
     public static void searchitem(){
         System.out.print("enter search item");
         int searchitem=sc.nextInt();
         if(ali.findarraylistitem(searchitem)!=0){
             System.out.print("item found at"+searchitem+"place");
         }else{
             System.out.println("item not found");
         }
     }


 }









