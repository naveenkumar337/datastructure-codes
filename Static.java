/**
 * static is a keyword,it is used for sherability purpose.
 * static method,variable are not create any object.
 * it was belongs to the class .
 * it mainly used for memory efficient(reduce).
 * here it was use without creating object
 */
/**
 * static variable: it was define with using static keyword
 *		                ex: static data_type variable_name;

 *		            if we access variable we use
 *				                refer_calssname.variablename;
 *
 *Static method:    it was define with Static keyword
 *                         ex:public static void method_name(){}
 *
 *                  if we access the static method we use
 *                          refer_classname.method_name(param);
 */
class A{
    //static variable
    static int name = 10;
}
class B{
    //static method
    public static int add(int a,int b){

        return a+b;

    }
    
    public void detail(){
            System.out.println("it is not static method");
    }
}
public class Static{
    public static void main(String[] args){
        System.out.println(A.name);		    //access of static variable
        int add=B.add(10,20);			    //access of static method
        System.out.println(add);
        
        B b=new B();                        //creation of object
           b.detail();
    }
}
