//Given a matrix of size N*N, your task is to find the sum of the primary and secondary diagonal of the matrix.

import java.util.*;  

public class A{
   public static void Matrix_sum(int a[][],int n){
       int primary_sum =0;
       int secondary_sum=0;
       for(int i = 0;i<n;i++){
           primary_sum =primary_sum+a[i][i];
           secondary_sum = secondary_sum + a[i][n-i-1];
       }
      
      System.out.println("Primary sum: "+primary_sum);
      System.out.println("Secondary sum: "+secondary_sum);
      
  }

     public static void main(String []args){
       System.out.print("Enter matrix size : ");
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       System.out.println("Enter array elements : ");    
       int matrix[][]=new int[N][N];
       for(int i=0; i<N;i++)
         {            
            for(int j=0; j<N;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
         }
         Matrix_sum(matrix,N);
         
     }
}