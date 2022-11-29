package com.mycompany.act5_mylinkedlist_ambrocio_nw2b;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Lance Ruzel C. Ambrocio
 * NW2B
 */
public class Act5_MyLinkedList_Ambrocio_NW2B {
    
    public static void main(String[] args) {
        //Initializations of scanner and linkedlis
        Scanner scan = new Scanner(System.in);
        LinkedList fName = new LinkedList();
        LinkedList mName = new LinkedList();
        LinkedList lName = new LinkedList(); 
        LinkedList aCode = new LinkedList(); 
        LinkedList telNum = new LinkedList(); 
        LinkedList gender = new LinkedList();
        LinkedList age = new LinkedList();
    
        //Asks the user how many members info will be entered
        System.out.print("How many member\'s information will be entered? ");
        int memInfoCount = scan.nextInt();
                
        //Inputing of members info
        for (int i = 0; i < memInfoCount; i++) {
            System.out.println("");
            System.out.println("Kindly give the information of member #" + (i+1)); //member number count i+1 since our for loop 
                                                                                   //starts with 0 so we will add 1 to show the user
            System.out.print("Enter first name: ");                                //what member infor number he is entering
            String inFName = scan.next();

            System.out.print("Enter middle name: ");
            String inMName = scan.next();

            System.out.print("Enter last name: ");
            String inLName = scan.next();

            System.out.print("Enter area code: ");
            int inACode = scan.nextInt();

            System.out.print("Enter telephone number: ");
            int inTelNum = scan.nextInt();

            System.out.print("Enter gender: ");
            String inGender = scan.next();

            System.out.print("Enter age: ");
            int inAge = scan.nextInt();

            //Inserting of datas to our linked list
            fName.add(inFName);
            mName.add(inMName);
            lName.add(inLName);
            aCode.add(inACode);
            telNum.add(inTelNum);
            gender.add(inGender);
            age.add(inAge);
        }
        
        //Displaying all the gathered input from the user
        for (int i = 0; i < memInfoCount; i++) {
            System.out.println("");
            System.out.println("Welcome to the club " + fName.get(i) + " " + mName.get(i) + " " + lName.get(i) + "!");
            System.out.println("Your are code and telephone number is (" + aCode + ") " + telNum.get(i) + ".");
            System.out.println("You are a female member and your age is " + age.get(i) + ".");
        }
    }
}
