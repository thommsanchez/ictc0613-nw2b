
package act5b.linklist;
import java.util.Scanner;
import java.util.LinkedList;





public class Act5bLinklist {

  
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        LinkedList membersInfo = new LinkedList(); //linked list for science club members
        
        System.out.println("How many members’ information will be entered? ");
         int numMember = sc.nextInt(); //numMember is a variable for the number of members the user will enter.
         
         
         for(int y = 0; y< numMember;y++)
         {
             // ask the user for information that will be keep in a linkedlist
             System.out.println("\nKindly give the information of member #"+(y+1));
             System.out.print("Enter first name: ");
             String fname = sc.next();
            
             System.out.print("Enter middle name: ");
             String mname = sc.next();

             System.out.print("Enter last name: ");
             String lname = sc.next();
             
             System.out.print("Enter area code: ");
             int areaCode;
             areaCode = sc.nextInt();
             
             System.out.print("Enter cellphone number: ");
             String cellphoneNum = sc.next();
             
             System.out.print("Enter gender: ");
             String gender = sc.next();
             
             System.out.print("Enter age: ");
             int age;
             age = sc.nextInt();
             
             
             //adds elements to a linkedlist
             membersInfo.add(fname);
             membersInfo.add(mname);
             membersInfo.add(lname);
             membersInfo.add(areaCode);
             membersInfo.add(cellphoneNum);
             membersInfo.add(gender);
             membersInfo.add(age);
         }

        
        int index = 0;
        
        //displaying information
        for(int y = 0; y< numMember; y++)
            
        {
            System.out.println("\nWelcome to the club "+ membersInfo.get(index)+ " " + membersInfo.get(index+1)+ " " + membersInfo.get(index+2));
           
            index = index + 3;
            System.out.println("Your area code and cellphone number is (" + membersInfo.get(index)+ ") " + membersInfo.get(index+1));
            
            index = index + 2;
            System.out.println("You are a "+ membersInfo.get(index)+ " member, and your age is " + membersInfo.get(index+1));
            
            index = index + 2;
        }
       }
}
