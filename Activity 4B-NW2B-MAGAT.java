
package array;

import java.util.Scanner;
public class Array {

    
    public static void main(String[] args) {
        
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of elements in array");
        n=s.nextInt();
        
        int a[]= new int[n];
        int b[]= new int[n+1];
        System.out.println("Enter values");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
         
        }
        
        System.out.println("Enter index of new value to be inserted");
         int m = s.nextInt();
        System.out.println("Enter new value to be inserted");
         int p = s.nextInt();
        
        for(int i=0;i<n+1;i++)
        {
            if(i<m)
            {
                b[i]=a[i];
            }
            else if(i==m)
            {
                b[i]=p;
            }
            else
            {
                b[i]=a[i];
            }
        }
                              
         System.out.println("Elements are:");
        for(int i=0;i<n;i++)
        {
           System.out.println(b[i]);
         
        }
        
         
         
         
         
         
    }
    
}
