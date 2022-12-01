package act5_mylinkedlist._tolentino_nw2b;
import java.util.Scanner;
import java.util.LinkedList;

public class Act5_MyLinkedList_Tolentino_NW2B {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList membersInfo = new LinkedList(); //linked list for science club members
        
        System.out.print("How many members' information will be entered? ");
        int numMember = scan.nextInt(); //numMember is a variable for the number of members the user will enter. 
        
        for(int i = 0; i< numMember; i++){
            //ask the user for information that will be keep in a linkedlist 
            System.out.println("\nKindly give the information of member #" + (i+1));
            System.out.print("Enter first name: ");
            String fname = scan.next();
            
            System.out.print("Enter middle name: ");
            String mname = scan.next();
            
            System.out.print("Enter last name: ");
            String lname = scan.next();
            
            System.out.print("Enter area code: ");
            int areaCode;
            areaCode = scan.nextInt();
            
            System.out.print("Enter telephone number: ");
            String telephoneNum = scan.next();
            
            System.out.print("Enter gender: ");
            String gender = scan.next();
            
            System.out.print("Enter age: ");
            int age;
            age = scan.nextInt();

            //adds elements to a linkedlist
            membersInfo.add(fname);
            membersInfo.add(mname);
            membersInfo.add(lname);
            membersInfo.add(areaCode);
            membersInfo.add(telephoneNum);
            membersInfo.add(gender);
            membersInfo.add(age);
        }
        
        int index = 0;

        //displaying information
        
        for(int i = 0; i< numMember; i++){
            System.out.println("\nWelcome to the club "+ membersInfo.get(index)+ " " + membersInfo.get(index+1)+ " " + membersInfo.get(index+2));
           
            index = index + 3;
            System.out.println("Your area code and telephone number is (" + membersInfo.get(index)+ ") " + membersInfo.get(index+1));
            
            index = index + 2;
            System.out.println("You are a "+ membersInfo.get(index)+ " member, and your age is " + membersInfo.get(index+1));
            
            index = index + 2;
        }

    }
    
}
