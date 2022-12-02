/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act5_mylinkedlist_marcelo_nw2b;

import java.util.Scanner;
import java.util.LinkedList;
/**
 *
 * @author User's
 */
public class Act5_myLinkedList_Marcelo_NW2B {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        LinkedList<String> MemInfo = new LinkedList<>();
        
        System.out.println();
        System.out.print("How many members’ information will be entered? : ");
         int NumOfMem = sc.nextInt();
         
         for(int i = 0; i< NumOfMem; i++)
         {
             System.out.println();
             System.out.println("Kindly give the information of member #"+(i+1));
             System.out.print("Enter first name: ");
             String firstname = sc.next();
             MemInfo.add(firstname);
             System.out.print("Enter middle name: ");
             String middlename = sc.next();
             MemInfo.add(middlename);
             System.out.print("Enter last name: ");
             String lastname = sc.next();
             MemInfo.add(lastname);
             System.out.print("Enter area code: ");
             String area_code = sc.next();
             MemInfo.add(area_code);
             System.out.print("Enter telephone number: ");
             String telephone_number = sc.next();
             MemInfo.add(telephone_number);
             System.out.print("Enter gender: ");
             String gender = sc.next();
             MemInfo.add(gender);
             System.out.print("Enter age: ");
             String age = sc.next();
             MemInfo.add(age);
         }

        int SetIndex = 0;
        for(int i = 0; i< NumOfMem; i++)
        {
            System.out.println();
            System.out.println("Welcome to the club "+MemInfo.get(SetIndex)+" "
                    
                    +MemInfo.get(SetIndex+1)+" "+MemInfo.get(SetIndex+2));
            SetIndex = SetIndex + 3;
            System.out.println("Your area code and telephone number is ("+MemInfo.get(SetIndex)+") "
                    +MemInfo.get(SetIndex+1));
            SetIndex = SetIndex + 2;
            System.out.println("You are a "+MemInfo.get(SetIndex)+" member, and your age is "
                    +MemInfo.get(SetIndex+1));
            SetIndex = SetIndex + 2;
        }
    }
 }
    

