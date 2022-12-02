package act5_mylinkedlist_marcelino_nw2b;
import java.util.*;
import java.util.LinkedList;

public class Act5_MyLinkedList_Marcelino_NW2B {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        LinkedList mi = new LinkedList<>();//Linked list for club members
        
        //Ask the user to input how many club members information will be entered
        System.out.print("\nHow many members' information will be entered? ");
         int number_of_members = sc.nextInt();
         
         //Ask the user to input information that will be recorded in the linked list
         for(int a = 0; a< number_of_members; a++)  
             
         {
             System.out.println("\nKindly give the information of member #"+(a+1));
             System.out.print("Enter first name: ");
             String firstname = sc.next();
             mi.add(firstname);
             
             System.out.print("Enter middle name: ");
             String middlename = sc.next();
             mi.add(middlename);
             
             System.out.print("Enter last name: ");
             String lastname = sc.next();
             mi.add(lastname);
             
             System.out.print("Enter area code: ");
             int areaCode;
             areaCode = sc.nextInt();
             mi.add(areaCode);
             
             System.out.print("Enter telephone number: ");
             int tpNum;
             tpNum = sc.nextInt();
             mi.add(tpNum);
             
             System.out.print("Enter gender: ");
             String gender = sc.next();
             mi.add(gender);
             
             System.out.print("Enter age: ");
             int age;
             age = sc.nextInt();
             mi.add(age);
         }
         //declare an index setter
        int Element=0;
        
        //display the member information that the user input
        for(int a = 0; a< number_of_members; a++)
            
        {
        System.out.println("\nWelcome to the club "+mi.get(Element)+" "+mi.get(Element+1)+" "+mi.get(Element+2));
           
            Element = Element + 3;
            
            System.out.println("Your area code and telephone number is ("+mi.get(Element)+") " +mi.get(Element+1));
            
            Element =Element + 2;
            
            System.out.println("You are a "+mi.get(Element)+" member, and your age is " +mi.get(Element+1));
            
            Element = Element + 2;
        }
       }
    
    
}
