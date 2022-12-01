
package act5_mylinkedlist_ilao_nw2b.java;

import java.util.LinkedList;
import java.util.Scanner;
public class Act5_MyLinkedList_Ilao_NW2B {

    
    public static void main(String[] args) {
        // declared scanner for input
        Scanner scan = new Scanner(System.in);
        // declare linklist for specific subject
        LinkedList Fname = new LinkedList();
        LinkedList Mname = new LinkedList();
        LinkedList Lname = new LinkedList();
        LinkedList AreaCode = new LinkedList();
        LinkedList TelNum = new LinkedList();
        LinkedList Gender = new LinkedList();
        LinkedList Age = new LinkedList();
        
        System.out.println("How many members information will be entered into the system?");
        //Icount is use as a container for how many members information will be entered into the system
        int Icount = scan.nextInt();
        scan.nextLine();
        
        for (int i=0; i<Icount; i++){
        int count = i;
        count++;
        //inout info from user that will be stored in LinkedList
        System.out.println();
        System.out.println("Please input Information of the member " + count);
        System.out.print("Enter First Name: ");
        String fname = scan.nextLine();
        System.out.print("Enter Middle Name: ");
        String mname = scan.nextLine();
        System.out.print("Enter Last Name: ");
        String lname = scan.nextLine();
        System.out.print("Enter Area Code: ");
        int Acode = scan.nextInt();
        scan.nextLine();//consuming the leftover new line using the nextLine() method.
        System.out.print("Enter Telephone Number: ");
        int telnum = scan.nextInt();
        scan.nextLine();//consuming the leftover new line using the nextLine() method.
        System.out.print("Enter Gender: ");
        String gender = scan.nextLine();
        System.out.print("Enter Age: ");
        int age = scan.nextInt();
        scan.nextLine();
        // add element in LinkedList
        System.out.println();
        Fname.add(fname);
        Mname.add(mname);
        Lname.add(lname);
        AreaCode.add(Acode);
        TelNum.add(telnum);
        Gender.add(gender);
        Age.add(age);
        }
        //print all info of members
        for (int i=0; i<Icount; i++){
        System.out.println("Welcome to the club "+ Fname.get(i)+" "+ Mname.get(i)+ " "+ Lname.get(i)+"!");
        System.out.println("Your area code and telephone number is "+"("+ AreaCode.get(i)+")"+" "+ TelNum.get(i));
        System.out.println("You are a "+ Gender.get(i)+" "+"member and your age is "+ Age.get(i));
        System.out.println();
         
        }
    }
    
}
