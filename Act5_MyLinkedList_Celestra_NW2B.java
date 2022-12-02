
package act5_mylinkedlist_celestra_nw2b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;


public class Act5_MyLinkedList_Celestra_NW2B {


    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in); //Use to collect the data will be inputed by user
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in)); //Use to identify integer inputs
        
        String DataInput; //declaration for carrying the data the came from the user
        int Member; // declaration for carrying how many members will be inputed
        
        //declaring LinkedList
        LinkedList<String> Fname = new LinkedList<>(); 
        LinkedList<String> Mname = new LinkedList<>(); 
        LinkedList<String> Lname = new LinkedList<>(); 
        LinkedList<String> AreaCode = new LinkedList<>(); 
        LinkedList<String> Telephone = new LinkedList<>(); 
        LinkedList<String> Gender = new LinkedList<>();
        LinkedList<String> Age = new LinkedList<>(); 
        
        //used to track on how many members will be recorded
        System.out.print("How many member' information will be entered? ");
        Member = Integer.parseInt(io.readLine());
        
        //used looping for getting the information of the members
        for(int i=1; i<=Member; i++){    
        System.out.println();
        System.out.println("Kindly give the information of member #" + i);
        
        System.out.print("Enter first name: ");
        DataInput = scan.nextLine();
        Fname.add(DataInput);
        
        System.out.print("Enter middle name: ");
        DataInput = scan.nextLine();
        Mname.add(DataInput);
        
        System.out.print("Enter last name: ");
        DataInput = scan.nextLine();
        Lname.add(DataInput);
        
        System.out.print("Enter area code: ");
        DataInput = scan.nextLine();
        AreaCode.add(DataInput);
        
        System.out.print("Enter telephone number: ");
        DataInput = scan.nextLine();
        Telephone.add(DataInput);
        
        System.out.print("Enter gender: ");
        DataInput = scan.nextLine();
        Gender.add(DataInput);
        
        System.out.print("Enter age: ");
        DataInput = scan.nextLine();
        Age.add(DataInput);
    }
        //printing the gathered information of members by using looping
        for(int i=0; i<Member; i++){
        System.out.println();
        System.out.println("Welcome to the club " + Fname.get(i) + " " + Mname.get(i) + " " + Lname.get(i) + "!");
        System.out.println("Your area code and telephone number is " + "(" + AreaCode.get(i) + ") " + Telephone.get(i) + ".");
        System.out.println("You are a " + Gender.get(i) + " member and your age is " + Age.get(i) + ".");
       
        }
    }
}
