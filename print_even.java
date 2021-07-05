//Write a recursive solution to print even numbers from 0 to X (x will be provided as an input)

import java.util.*;  

public class A{
   public static void Print_even(int X){
      if(X%2==0 && X!=0){
           Print_even(X-2);
       }
       else if(X%2!=0){
           Print_even( X-1);
       }
       if(X%2==0){
           System.out.println(X+" ");
       }
  }

     public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number- ");  
        int X= sc.nextInt();  
        System.out.println("Even numbers from 0 to "+ X + " are:-");  
        Print_even(X);
     }
}