import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

class Activity04B {

    static Scanner in = new Scanner(System.in);

    public static String[] text;

    public static int findLocationInsert(String text[], String txt, int idx, int sz) throws InterruptedException {

        int id = idx;

        for (int z = id - 1; z > sz; id--) {

            text[z] = text[z - 1];

        }

        TimeUnit.SECONDS.sleep(5);
        text[id] = txt;

        return sz;

    }

    public static int findLocationDelete(String text[], String txt, int idx) throws InterruptedException {

        String tx = txt;
        int id = idx;

        if (text[id].equals(tx)) {

            TimeUnit.SECONDS.sleep(5);
            text[id] = "";

        } else {

            TimeUnit.SECONDS.sleep(5);
            System.out.println("\nThat item does not exist. Press [2] again to try deleting another value or press [3] to review the recent changes.");

        }

        return idx;

    }

    public static void main(String[] args) throws InterruptedException {

        String txt;
        int idx, cntr = 0, sz = 0;

        try {
            
            System.out.print("Enter array size: ");
            sz = in.nextInt();
            text = new String[sz];

            System.out.println();
            in.nextLine();

            for (int c = 0; c < text.length; c++) {

                cntr++;

                System.out.print("Enter a String value " + cntr + ": ");
                text[c] = in.nextLine();

            }

        } catch (Exception e) {
            
            System.out.println("\nThis prompt only accepts numbers. Exiting...\n");
            System.exit(0);

        }

        System.out.println("\nYour desired array size is " + sz + " with the following: " + Arrays.toString(text) + "\n");

        try {
            
            do {

                System.out.print("What do you want to do?" +
                    "\n[1] Insert" +
                    "\n[2] Delete" +
                    "\n[3] Transverse" +
                    "\n[4] Exit" +
                    "\n\nEnter your choice: ");
                int chc = in.nextInt();
    
                in.nextLine();
    
                switch (chc) {
    
                    case 1:
    
                        System.out.print("\nEnter a String value that you want to insert to: ");
                        txt = in.nextLine();
                        System.out.print("Specify the position reference [1 - " + sz + "]: ");
                        idx = in.nextInt();
    
                        findLocationInsert(text, txt, idx, sz);
                        TimeUnit.SECONDS.sleep(5);

                        System.out.println("\nOperation completed successfully. Run [3] to see the changes or other numbers for further changes.\n");
    
                        break;
    
                    case 2:
    
                        System.out.print("\nEnter a String value that you want to delete from: ");
                        txt = in.nextLine();
                        System.out.print("Specify the position reference [1 - " + sz + "]: ");
                        idx = in.nextInt();
                        idx -= 1;

                        findLocationDelete(text, txt, idx);
                        TimeUnit.SECONDS.sleep(5);

                        System.out.println("\nOperation completed successfully. Run [3] to see the changes or other numbers for further changes.\n");
    
                        break;
                    
                    case 3:
    
                        System.out.println("\nAs of previous changes, your desired array size is " + sz + " with the following String values: " + Arrays.toString(text) + "\n");
                        break;
    
                    case 4:

                        System.out.println("Status 0: Exiting...\n");
                        System.exit(0);
    
                    default:
    
                        System.out.println("\nInstructions unclear, have gone to the wrong selection. Let's try that again.\n");
    
                }
    
            } while (true);

        } catch (Exception e) {
            
            System.out.println("\nThis prompt only accepts numbers. Exiting...\n");
            System.exit(0);

        }

    }

}

//Powered by Visual Studio Code with Java Extension Pack