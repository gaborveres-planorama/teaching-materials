/**************************************************************************************************
 * Workshop: Practice Exceptions: Nested Try Catch
 * 
 * Run this and explain the what the heck is going on
 *
 * ADD YOUR EXPLANATION HERE -----------------------------------
 *
 **************************************************************************************************/
import java.util.*;

public class Workshop05{
    public static void main(String[] args){

 //Parent try block
     try{
    	//Child try block1
         try{
            System.out.println("Inside block1");
            int b =45/0;
            System.out.println(b);
         }
         catch(ArithmeticException e1){
            System.out.println("Exception: e1");
         }
         //Child try block2
         try{
            System.out.println("Inside block2");
            int b =45/0;
            System.out.println(b);
         }
         catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("Exception: e2");
         }
        System.out.println("Just other statement");
    }
    catch(ArithmeticException e3){
    	 System.out.println("Arithmetic Exception");
         System.out.println("Inside parent try catch block");
    }
    catch(ArrayIndexOutOfBoundsException e4){
    	System.out.println("ArrayIndexOutOfBoundsException");
         System.out.println("Inside parent try catch block");
    }
    catch(Exception e5){
    	System.out.println("Exception");
         System.out.println("Inside parent try catch block");
     }
     System.out.println("Next statement..");
  }
}
}



