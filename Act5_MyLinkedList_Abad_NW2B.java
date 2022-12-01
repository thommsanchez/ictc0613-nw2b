package y2s2;

import java.util.*;

public class Week5 {
    
public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        LinkedList fn = new LinkedList();       //fn = first name
        LinkedList mn = new LinkedList();       //mn = middle name
        LinkedList ln = new LinkedList();       //ln = last name
        LinkedList arcd = new LinkedList();     //arcd = area code
        LinkedList telnum = new LinkedList();   //telnum = telephone number
        LinkedList gndr = new LinkedList();     //gndr = gender
        LinkedList age = new LinkedList();
        
        //asks the user how many members information will be entered
        System.out.print("How many member's information will be entered? ");
        int memnum = scan.nextInt();
        //memnum = number of member/s
           
        for (int i = 0; i < memnum; i++) {
            System.out.println("\nKindly give the information of member #" + (i+1));
            //i is added to 1 to address the array numbering of members that will be displayed
            
            //obtaining info from the members
            System.out.print("Enter first name: ");
            String mfn = scan.next();
            //mfn = member's first name input
            
            System.out.print("Enter middle name: ");
            String mmn = scan.next();
            //mmn = member's middle name input
            
            System.out.print("Enter last name: ");
            String mln = scan.next();
            //mln = member's last name input
            
            System.out.print("Enter area code: ");
            int marcd = scan.nextInt();
            //marcd = member's area code input
            
            System.out.print("Enter telephone number: ");
            int mtelnum = scan.nextInt();
            //mtelnum = member's telephone number input
            
            System.out.print("Enter gender: ");
            String mgndr = scan.next();
            //mgndr = member's gender input
            
            System.out.print("Enter age: ");
            int mage = scan.nextInt();
            //mage = member's age input
            
            fn.add(mfn);
            mn.add(mmn);
            ln.add(mln);
            arcd.add(marcd);
            telnum.add(mtelnum);
            gndr.add(mgndr);
            age.add(mage);
        }
        
        //for displaying the informations about the (different) members
        for (int i = 0; i < memnum; i++) {
            System.out.println("\nWelcome to the club " + fn.get(i) + " " + mn.get(i) + " " + ln.get(i) + "!");
            System.out.println("Your area code and telephone number is (" + arcd.get(i) + ")" + telnum.get(i) + ".");
            System.out.println("You are a " + gndr.get(i) + " member and your age is " + age.get(i) + ".");
        }
    }
}
