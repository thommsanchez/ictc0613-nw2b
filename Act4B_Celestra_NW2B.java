
package act4b_celestra_nw2b;
import java.io.*;
import java.util.Scanner;

public class Act4B_Celestra_NW2B {

    public static int insertItem(int num[], int item, int location, int size){
       int value = item;
        
       findlocationInsert(num, value, location, size);

       return size;    
    }
    public static int findlocationInsert(int num[], int item, int location, int size){
        int loc = location;
        
        for(int i=loc-1 ; i>=size; i--){
            num[i] = num[i-1];
        }
        num[loc] = item;
       
        return size;
    }
    
    public static int deleteItem(int num[], int item, int location, int size){
       int value = item;
       if(num[location] == value){
       findlocationDelete(num, location, size);
       }
       else{
           System.out.print("The Item don't exist");    
       }
       return size;        
    }
    public static int findlocationDelete(int num[], int location, int size){
        int loc = location;
        for(int i=loc; i<size; i++){
            num[i] = num[i+1];
            
            num[i+1] = 0;
        }
        
        return size;
    }
    
    public static int[] num;
    
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     Scanner var = new Scanner(System.in);
     String Option;
     int location, item;
     
     System.out.println("Hi! Welcome to Insertion/Deletion/Transverse");
     System.out.println();
     System.out.print("Enter Size of an Array: ");
     int size = var.nextInt();
     num = new int[size];
     size = size - 1;
     for(int i=0; i<=size ;i++){
     System.out.print("Enter value for num"+ " ["+ i +"}: ");
     num[i] = var.nextInt();
     }
do{

     System.out.println();
     System.out.println("Enter an option you want to execute: ");
     System.out.println("   Insert\n   Delete\n   Transverse\n   Exit");
     System.out.println();
     System.out.print("Option: ");
     Option = scan.nextLine();
     System.out.println();
     
     switch (Option.toLowerCase()){
         case "insert":
             System.out.print("Enter the item to be insert: ");
             item = var.nextInt();
             System.out.print("Enter the location of the item: ");
             location = var.nextInt(); 
             insertItem(num, item, location, size);
             System.out.print("Successfully Inserted");
             break;
             
         case "delete":
             System.out.print("Enter the item to be delete: ");
             item = var.nextInt();
             System.out.print("Enter the location of the item: ");
             location = var.nextInt();          
             deleteItem(num, item, location, size);
             System.out.print("Successfully Deleted");
             break;
             
         case "transverse":
             
             
             for(int i=0; i<num.length; i++){
                 System.out.println("The Value of num["+i+"] "+num[i]);
             }
             break;
             
         case "exit":
             System.exit(0);
             break;    
     }
     System.out.println();
}
while(true);

         
    }
    
}
