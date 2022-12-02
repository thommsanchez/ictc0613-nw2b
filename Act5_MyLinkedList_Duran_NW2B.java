package act5_mylinkedlist._duran_nw2b;
import java.util.LinkedList;
import java.util.Scanner;

public class Act5_MyLinkedList_Duran_NW2B {

    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
        LinkedList fname = new LinkedList();
        LinkedList mname = new LinkedList();
        LinkedList lname = new LinkedList(); 
        LinkedList arcode = new LinkedList(); 
        LinkedList telnumber = new LinkedList(); 
        LinkedList gender = new LinkedList();
        LinkedList age = new LinkedList();
    
        System.out.print("How many members' information will be entered? ");
        int CountingInfos = s.nextInt();
                
        for (int i = 0; i < CountingInfos; i++) {
            System.out.println("");
            System.out.println("Kindly give the information of member #" + (i+1));
                                                                                   
            System.out.print("Enter first name: ");                              
            String firstname = s.next();
            System.out.print("Enter middle name: ");
            String middlename = s.next();
            System.out.print("Enter last name: ");
            String lastname = s.next();

            System.out.print("Enter area code: ");
            int areacode = s.nextInt();
            System.out.print("Enter telephone number: ");
            int telephonenumber = s.nextInt();
            System.out.print("Enter gender: ");
            String sex = s.next();
            System.out.print("Enter age: ");
            int memberAge = s.nextInt();

            fname.add(firstname);
            mname.add(middlename);
            lname.add(lastname);
            arcode.add(areacode);
            telnumber.add(telephonenumber);
            gender.add(sex);
            age.add(memberAge);
        }
        
        for (int i = 0; i < CountingInfos; i++) {
            System.out.println("");
            System.out.println("Welcome to the club " + fname.get(i) + " " + mname.get(i) + " " + lname.get(i) + "!");
            System.out.println("Your are code and telephone number is (" + arcode + ") " + telnumber.get(i) + ".");
            System.out.println("You are a female member and your age is " + age.get(i) + ".");
        }
    }
}
    
