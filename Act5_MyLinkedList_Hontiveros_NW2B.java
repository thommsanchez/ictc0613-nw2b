import java.util.*;

public class Act5_MyLinkedList_Hontiveros_NW2B {

    //DEVNOTES:
    //1. prefix variable "mem" means member
    //2. sequence in order: FName, MName, LName, Age, Gender, AreaC, Tel

    //invoke a Scanner
    static Scanner in = new Scanner(System.in);

    //invoke a LinkedList
    static LinkedList<String> memInfo = new LinkedList<>();

    public static void main(String[] args) {

        int memCount, index;
        String memFName, memMName, memLName, memAreaC, memTel, memGender, memAge;

        System.out.print("Specify number of members: ");
        memCount = in.nextInt();
        
        System.out.println("\n\nSpecify information for your member(s) below.");

        for (int q = 0; q < memCount; q++) {

            System.out.print("\nSpecify First Name: ");
            memFName = in.next();
            memInfo.add(memFName);

            System.out.print("Specify Middle Name: ");
            memMName = in.next();
            memInfo.add(memMName);

            System.out.print("Specify Last Name: ");
            memLName = in.next();
            memInfo.add(memLName);

            System.out.print("Specify Age: ");
            memAge = in.next();
            memInfo.add(memAge);

            System.out.print("Specify Gender: ");
            memGender = in.next();
            memInfo.add(memGender);

            System.out.print("Specify Area Code: ");
            memAreaC = in.next();
            memInfo.add(memAreaC);

            System.out.print("Specify Telephone Number: ");
            memTel = in.next();
            memInfo.add(memTel);

        }

        //setting an index for the LinkedList "memInfo" referencing with integer "index"
        index = 0;

        System.out.println("\n\nMember(s) information:\n");

        //displaying the information of the members
        for (int m = 0; m < memCount; m++) {

            //affects FName, MName and LName
            for (int w = 0; w < 3; w++) {

                System.out.print(memInfo.get(index) + " ");
                index++;

            }
            System.out.println();

            //affects Age and Gender
            System.out.println(memInfo.get(index) + " years old, " + memInfo.get(index + 1));

            //affects AreaC and Tel
            System.out.println("Area Code: " + memInfo.get(index + 2) + ", Telephone Number: " + memInfo.get(index + 3));

            System.out.println();

        }
        
    }
    
}

//Powered by Visual Studio Code with Java Extension Pack