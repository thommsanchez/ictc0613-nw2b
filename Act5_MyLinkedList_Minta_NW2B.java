
package act5_mylinkedlist_minta_nw2b;
import java.util.Scanner;
import java.util.LinkedList;
public class Act5_MyLinkedList_Minta_NW2B {

    public static void main(String[] args) {
       String fname;
        Scanner sc = new Scanner(System.in);
       //This will be use for creating a linklist for a specific subject
        LinkedList FName = new LinkedList();
        LinkedList MName = new LinkedList();
        LinkedList LName = new LinkedList();
        LinkedList ACode = new LinkedList();
        LinkedList telephone = new LinkedList();
        LinkedList gender = new LinkedList();
        LinkedList UserAge = new LinkedList();
        
        System.out.print("How many members information will be entered? ");//Asks the user how many members
        int Members = sc.nextInt(); 
        
        for(int i = 0; i < Members;i++){
            int count = i;

          System.out.println();
        
          //thisask the information from the user
          System.out.println("Kindly give the information of member " + count);
          
          System.out.print("Enter firstname: ");
          fname = sc.nextLine();
          
          System.out.print("Enter middle name: ");
          String Mname = sc.nextLine();
          
          System.out.print("Enter last name: ");
          String Lname = sc.nextLine();
          
          System.out.print("Enter area code: ");
          int Acode = sc.nextInt();
          sc.nextLine();
          
          System.out.print("Enter telephone number: ");
          String Tnum = sc.nextLine();
         
          System.out.print("Enter gender: ");
          String gen = sc.nextLine();
          
          System.out.print("Enter age: ");
          int age = sc.nextInt();
          sc.nextLine();
          
          System.out.println();

         //adding elements
            FName.add(FName);
            MName.add(Mname);
            LName.add(Lname);
            ACode.add(Acode);
            telephone.add(Tnum);
            gender.add(gen);
            UserAge.add(age);
     
           
        }
         
        
        for(int i = 0; i < Members;i++){

        //print informations
        System.out.println("Welcome to the club " + FName.get(i) +" " + MName.get(i) + " "+ LName.get(i)+ "!");
        System.out.println("Your area code and telephone number is "  + ACode.get(i) + "(" + telephone.get(i)+ ") " + "." );
        System.out.println("you are " + gender.get(i) + " member and your age is " + UserAge.get(i));
        System.out.println();
       
        }
    }
    
}
