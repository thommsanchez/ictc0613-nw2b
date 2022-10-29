
package activity04b_domingo;

import java.util.Scanner;
class array {
       
       int defaultArr[] = {1,2,3,4,5};

    Scanner s = new Scanner(System.in);
    
    


    void deleteArr(){
         System.out.print("The default Array element is "  ) ;
        for(int i = 0; i < 5; i++){
            System.out.print(defaultArr[i] + " ");
     
      
        }
        System.out.println();
        
        System.out.print("Enter the index of element you want to delete: ");
        int element = s.nextInt();
        
        for(int i = 0; i < 5;i++){
            if(element == defaultArr[i]){
            System.out.println("The element is found its position at index " + i+  "!");
      
            }
    
    }
        for(int i = 0; i< 5;i++){
            if(i > element){
                defaultArr[i-1] = defaultArr[i];
            }
        
        }
        System.out.println("The new value element in array are: ");
        for(int i = 0; i<4;i++){
            System.out.println("The new value at index " + i + " is " + defaultArr[i]);
        }
    
}
  
    
    void insertValue(){
        System.out.print("The default Array element is "  ) ;
        for(int i = 0; i < 5; i++){
            System.out.print(defaultArr[i] + " ");
     
      
        }
         System.out.println();
        System.out.print("Enter the index number you want to insert the value: ");
        int inst = s.nextInt();
        
        System.out.print("Enter the new value you want to insert: ");
        int n = s.nextInt();
        
        for(int i = 0; i < inst; i++){
            defaultArr[ i + 1] = defaultArr[i]; 
          
        }
           defaultArr[inst] = n;
       
        
        System.out.print("The new value for array are ");
        for(int i =0; i < 5; i++){
            System.out.print(defaultArr[i] + " ");
            
        
       }
        
    
    
    
    }
    void traverseArray(){
        System.out.println("The array are listed below and its index");
        for(int i = 0; i < 5;i++){
            System.out.println("The element of index " + i + " is " + defaultArr[i]);
        
        
        }
        if(defaultArr == null) System.out.println("The array is not full");
        else if(defaultArr != null) System.out.println("The array is already full");
    
    
    
    }

}

public class Activity04B_Domingo {
   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        array ar = new array();
       
    
       System.out.println("These are the options for what actions you want to take: " + "\n" 
       + "1. Insert a value" + "\n" + "2. Delete a value" + "\n" + "3. Traverse array" + "\n"
       + "4. Exit" + "\n");
       
    System.out.print("Enter the option you want to perform: ");
     int choice = s.nextInt();
       System.out.println();
             switch(choice){
            case 1:
               ar.insertValue();
                
            break;
            case 2:
               ar.deleteArr();
            break;
            case 3:
                ar.traverseArray();
               
            break;
            case 4:
                System.exit(0);
                
  
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        Scanner s = new Scanner(System.in);
//        
//        System.out.println("Insert value press 1");
//        System.out.println("Delete a value press 2");
//        System.out.println("Traverse in the array press 3");
//        System.out.println("exit press 4");
//        
//        
//        
//        
//        System.out.print("Enter your choice: ");
//        int choice = s.nextInt();
//        

//           System.out.println();
//        
//       
//   
//       
//    }
//    public static int findLocationDelete(int val){
//          Scanner s = new Scanner(System.in);
//          
//        System.out.print("Enter the value that you want to delete: ");
//        val = s.nextInt();
//        
//        System.out.print("Enter how many element to be inserted: ");
//        int x = s.nextInt();
//        
//        int listArray [] = new int[x];
//        for(int i = 0; i < x;i++){
//        System.out.print("Insert a number at index " + i +" : " );
//        listArray[i] = s.nextInt();
//           
//       
//        }
//      
//        
//           
//        for(int i =0 ; i< x; i++){
//            if(val == listArray[i]){
//  
//                
//             System.out.println("Search value found at index " + i );
//        
//        
//        }}
//         
//    
//    
    
    }
    
}
