
package act5_mylinkedlist._albais_nw2b.java;

import java.util.Scanner;
import java.util.LinkedList;

public class Act5_MyLinkedList_Albais_NW2BJava {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        LinkedList  fName= new LinkedList();
        LinkedList mName = new LinkedList();
        LinkedList lName = new LinkedList();
        LinkedList areaCode = new LinkedList();
        LinkedList telNum = new LinkedList();
        LinkedList gender = new LinkedList();
        LinkedList age = new LinkedList();
        
        System.out.print("How many member's information will be entered?");
        int memCount = scan.nextInt();
        
         for (int i = 0; i < memCount; i++) 
         {
            System.out.println("");
            System.out.println("Kindly give the information of member #" + (i+1));
            
            System.out.print("Enter first name: ");
            String infoFName = scan.next();
            
            System.out.print("Enter middle name: ");
            String infoMName = scan.next();
            
            System.out.print("Enter last name: ");
            String infoLName = scan.next();
            
            System.out.print("Enter area code: ");
            int infoACode = scan.nextInt();
            
            System.out.print("Enter telephone number: ");
            int infoTelNum = scan.nextInt();
            
            System.out.print("Enter gender: ");
            String infoGender = scan.next();
            
            System.out.print("Enter age: ");
            int infoAge = scan.nextInt();
            
            fName.add(infoFName);
            mName.add(infoMName);
            lName.add(infoLName);
            areaCode.add(infoACode);
            telNum.add(infoTelNum);
            gender.add(infoGender);
            age.add(infoAge);
         }
         
         for (int i = 0; i < memCount; i++) {
            System.out.println("");
            System.out.println("Welcome to the club " + fName.get(i) + " " + mName.get(i) + " " + lName.get(i) + "!");
            System.out.println("Your are code and telephone number is (" + areaCode + ") " + telNum.get(i) + ".");
            System.out.println("You are a female member and your age is " + age.get(i) + ".");
        }
         
    }
    
}
