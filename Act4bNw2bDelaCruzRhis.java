
package act4b.nw2b.delacruzrhis;
import java.util.Arrays; 
import java.util.Scanner;

public class Act4bNw2bDelaCruzRhis {

    
    
        public static void insert(){
     int migs, r;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        migs = s.nextInt();
        int array[] = new int[migs+1];
        System.out.println("Enter your Element");
        for(int i = 0; i < migs; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.print("Enter the element you want to insert: ");
        r = s.nextInt();
        array[migs] = r;
        System.out.print("After inserting: ");
        for(int i = 0; i <migs; i++)
        {
            System.out.print(array[i]+"\n");
        }
        s.close();
        System.out.print(array[migs]); 
  }
  
  public static void delete(){
     
        int migs, r, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        migs = s.nextInt();
        int array[] = new int[migs];
        System.out.println("Enter your Element");
        for(i = 0; i < migs; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.print("Enter the index of the element you want to delete: ");
        r = s.nextInt();
        System.out.println("\nElement to be deleted at index: "+ r); 
 
        int[] copyArr = new int[array.length - 1]; 
 
        System.arraycopy(array, 0, copyArr, 0, r); 
 
        System.arraycopy(array, r + 1, copyArr, r, array.length - r - 1); 
        s.close();
        System.out.println("Array after deleting an element: "+ Arrays.toString(copyArr));  
  }
  
  public static void traverse(){
        int migs;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        migs = s.nextInt();
        int array[] = new int[migs+1];
        System.out.println("Enter Element");
        for(int i = 0; i < migs; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.print("Elements in Array are:\n");
        for(int i = 0; i < migs; i++)
        {
        s.close();
            System.out.print(array[i]+" ");
        }
        s.close();
  }
  
  public static void exit(){
      System.out.println("Exit");
  }
  public static void main(String[] args) {
    
      Scanner s = new Scanner(System.in);
      System.out.print("\nChoose a options:");
      System.out.println("\n1. Insert a value");
      System.out.println("2. Delete a value"); 
      System.out.println("3. Traverse the array");
      System.out.println("4. Exit");
      System.out.print("\nEnter your operations: ");
      int choices = s.nextInt();
      System.out.println();
      switch(choices){
          case 1:
              insert();
              break;
          case 2:
              delete();
              break;
          case 3:
              traverse();
              break;
          case 4:
              exit();
              break;
      }
      System.out.println();
      s.close(); 
  }
}

        
        
        
        
    
    

