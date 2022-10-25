package com.mycompany.activity4b;

import java.util.Scanner;

/**
 * Lance Ruzel C. Ambrocio
 * NW-2B
 */
public class activity4B_NW2B_Ambrocio {
    private static String names[] = new String[5];
    private static String new_names[] = new String[names.length-1];
    private static Scanner scan;
    
    private static String option = "Select an option:"
                + "\n1.Insert a value"
                + "\n2.Delete a value"
                + "\n3.Transverse array"
                + "\n4.Exit\n";
    
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        
        System.out.println(option);
        System.out.print("Option: ");
        
        if(scan.hasNextInt()){
           chooseOption(); 
        } else {
            System.out.println("Please enter numbers from 1-4 only\n");          
            chooseOption();
        }
    }
    
    public static void chooseOption(){
        switch(scan.nextInt()){
            case 1: //insert
                System.out.println("\nEnter " + names.length + " names");
                
                for (int i = 0; i < names.length; i++) {
                    System.out.print("Name " + (i+1) + ": ");
                    names[i] = scan.next();   
                }
                
                repeatOption();
                break;

            case 2: //delete
                if(names[0] != null){
                    System.out.print("Delete value: ");    
                    String value = scan.next();
                
                    for (int i = 0, n = 0; i < names.length; i++) {
                        if(i != findLocationDelete(value))
                        new_names[n++] = names[i];
                    }
                } else {
                    System.out.println("Array is empty");
                }
 
                repeatOption();
                break;   
                
            case 3: //transverse
                System.out.println("Name List: ");
                
                if(new_names != null){
                    for (int i = 0; i < new_names.length; i++) {
                        System.out.println(new_names[i]);
                    } 
                } else {
                   for (int i = 0; i < names.length; i++) {
                        System.out.println(names[i]);
                    } 
                }

                repeatOption();
                break;
                
            case 4: //exit
                break;
                
            default:
                System.out.println("Please enter numbers from 1-4 only");
                break;
        }
    }
    
    public static void repeatOption(){ //repeats the option display selection
        System.out.print("Do you want to choose another option? Y/N: ");
                if(scan.next().toLowerCase().equals("y")){
                    System.out.println("\n" + option);
                    System.out.print("Option: ");
                    chooseOption();
                }
    }
    
    public static int findLocationDelete(String value){ //returns the index of the value
        int position = 0;
        for (int i = 0; i < names.length; i++) {
            if(names[i].toString().equals(value))
            position = i;
        }
        return position;
    }
    
}
