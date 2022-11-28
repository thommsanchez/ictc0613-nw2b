
package act5_mylinkedlist_domingo_nw2b;

import java.util.LinkedList;
import java.util.Scanner;
public class Act5_MyLinkedList_Domingo_NW2B {
    
    

    public static void main(String[] args) {
        String fname;
        Scanner s = new Scanner(System.in);
       //This will be use for creating a linklist for a specific subject
        LinkedList firstname = new LinkedList();
        LinkedList middlename = new LinkedList();
        LinkedList lastname = new LinkedList();
        LinkedList areaCode = new LinkedList();
        LinkedList telNum = new LinkedList();
        LinkedList gender = new LinkedList();
        LinkedList agePer = new LinkedList();
        
        System.out.print("How many members information will be entered? ");
        int Mcount = s.nextInt(); //Mcount variable is use as a container for how many members should be entered
         s.nextLine(); // since we ask integer type input from the user therefore we need to clear that out using this to avoid errors
        
        for(int i = 0; i < Mcount;i++){
            int count = i;
            count++; //count++ is use in order to assure that the counting will start at 1
            
          System.out.println();
        
          //this will ask the information from the user that will be store in a linkedlist
          System.out.println("Kindly give the information of member " + count);
          System.out.print("Enter firstname: ");
          fname = s.nextLine();
          System.out.print("Enter middle name: ");
          String Mname = s.nextLine();
          System.out.print("Enter last name: ");
          String Lname = s.nextLine();
          System.out.print("Enter area code: ");
          int Acode = s.nextInt();
          s.nextLine(); // since we ask integer type input from the user therefore we need to clear that out using this method to avoid errors
          System.out.print("Enter telephone number: ");
          String Tnum = s.nextLine();
          System.out.print("Enter gender: ");
          String gen = s.nextLine();
          System.out.print("Enter age: ");
          int age = s.nextInt();
          s.nextLine();// since we ask integer type input from the user therefore we need to clear that out using this method to avoid errors
           
          
          System.out.println();

         //this is the way of adding elements in a linkedlist
            firstname.add(fname);
            middlename.add(Mname);
            lastname.add(Lname);
            areaCode.add(Acode);
            telNum.add(Tnum);
            gender.add(gen);
            agePer.add(age);
     
           
        }
         
        
        for(int i = 0; i < Mcount;i++){

        //printing all the information gathered
        System.out.println("Welcome to the club " + firstname.get(i) +" " + middlename.get(i) + " "+ lastname.get(i)+ "!");
        System.out.println("Your area code and telephone number is "  + areaCode.get(i) + "(" + telNum.get(i)+ ") " + "." );
        System.out.println("you are " + gender.get(i) + " member and your age is " + agePer.get(i));
        System.out.println();
       
        }
      
        
        
        
        
        
    }
    
}
