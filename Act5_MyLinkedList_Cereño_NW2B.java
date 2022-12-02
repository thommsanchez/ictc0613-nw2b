
package act5_mylinkedlist_cereño_nw2b;

//import scanner and linkedlist package
import java.util.Scanner;
import java.util.LinkedList;

public class Act5_MyLinkedList_Cereño_NW2B {

  
    public static void main(String[] args) {
            
        Scanner s = new Scanner(System.in);
        LinkedList infoMembers = new LinkedList(); //linked list for science club members' information
        
        
        System.out.print("How many members’ information will be entered? "); //asks the user to input how many members to enter.
        
         int member = s.nextInt();//declares the number of member will be entered by the user
         
         //for loop for information input from user
         for(int i = 0; i< member; i++){
             
             int age;
             int areaCode;
             
             System.out.println("\nKindly give the information of member #"+(i+1)); //asks the user to input members' information to linked list
             
             System.out.print("Enter first name: ");
             String fname = s.next();
            
             System.out.print("Enter middle name: ");
             String mname = s.next();

             System.out.print("Enter last name: ");
             String lname = s.next();
             
             System.out.print("Enter area code: ");
             
             areaCode = s.nextInt();
             
             System.out.print("Enter telephone number: ");
             String phoneNum = s.next();
             
             System.out.print("Enter gender: ");
             String gender = s.next();
             
             System.out.print("Enter age: ");
             age = s.nextInt();
             
             //elements to add on linked list:
             infoMembers.add(fname);
             infoMembers.add(mname);
             infoMembers.add(lname);
             infoMembers.add(areaCode);
             infoMembers.add(phoneNum);
             infoMembers.add(gender);
             infoMembers.add(age);
         }
         
        int index = 0;
        
        //for loop for displaying inputted information of members
        for(int i = 0; i< member; i++){
            
            System.out.println("\nWelcome to the club "+ infoMembers.get(index)+ " " + infoMembers.get(index+1)+ " " + infoMembers.get(index+2)+"!");
            index = index + 3;
            
            System.out.println("Your area code and telephone number is (" + infoMembers.get(index)+ ") " + infoMembers.get(index+1)+".");
            index = index + 2;
            
            System.out.println("You are a "+ infoMembers.get(index)+ " member and your age is " + infoMembers.get(index+1)+".");
            index = index + 2;
            
        }
    }
}
    
    

