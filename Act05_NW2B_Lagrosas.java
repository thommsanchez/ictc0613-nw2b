/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lagrosasjmo_linkedlist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 *
 * @author rein
 */
public class Act05_NW2B_Lagrosas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    Queue<String> fname = new LinkedList<>();
    Queue<String> mname = new LinkedList<>();
    Queue<String> lname = new LinkedList<>();
    Queue<String> acode = new LinkedList<>();
    Queue<String> tnum = new LinkedList<>();
    Queue<String> gender = new LinkedList<>();
    Queue<String> age = new LinkedList<>();
    
        System.out.print("How many members’ information will be entered? :  ");
        int memberscount, rise =0; 
        memberscount = sc.nextInt();
    do{
    memberscount--;
    rise++;
     System.out.println("\nKindly give the information of member # "+ rise);
    System.out.print("Enter first name:"); 
    fname.add(sc.next()); 
       System.out.print("Enter middle name:");
    mname.add(sc.next());  
           System.out.print("Enter last name:");
    lname.add(sc.next()); 
     System.out.print("Enter area code:");
    acode.add(sc.next()); 
     System.out.print("Enter telepone number:");
    tnum.add(sc.next()); 
     System.out.print("Enter gender:");
    gender.add(sc.next()); 
     System.out.print("Enter age:");
    age.add(sc.next()); 
    
   
    }while (memberscount>0); 
    
      
    do{rise --; System.out.println( "\n\n"); 
   System.out.println("Welcome to the club " + fname.poll() + " " +mname.poll() + " "+ lname.poll() + "! " );
   System.out.println( "Your area code and telephone number is (" +acode.poll()+ ") "+ tnum.poll() + "."); 
      System.out.println( "You are a "+ gender.poll() + " member and your age is "+ age.poll() +"."); 
    } while( rise>0);
       
  }
}