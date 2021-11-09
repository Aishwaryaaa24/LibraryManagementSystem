package src;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileWriter;

public class Runner {
    static Members member; // src pckg

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // sc.useDelimiter("\n");

        boolean flag = true;
        while (flag) {
            System.out.println("Enter a choice: ");
            System.out.println("1 : View Library");
            System.out.println("2 : Issue a Book");
            System.out.println("3 : Return a Book");
            System.out.println("4 : Pay bill");
            System.out.println("5 : Check quota left");
            System.out.println("6 : Exit");

            int choice = sc.nextInt();

            switch (choice) {
            case 1: {
                // display books.csv
                File filename = new File("./data/books.csv");
                // File file = new File("./data/products.csv");
                Scanner fileScanner;
                try {
                    fileScanner = new Scanner(filename);
                    // process the file, one line at a time
                    while (fileScanner.hasNextLine()) {
                        String[] line = fileScanner.nextLine().split(",");
                        System.out.println(line[1]);
                    }
                    fileScanner.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                // String bookdeets = utility.getdetails(filename);
                break;
            }
            case 2: {
                // ask for book id and check if issuedby == null, if yess update books.csv else
                // display message
                break;
            }
            case 3: {
                // ask for book id,update member record(nbooks) and books.csv
                break;
            }
            case 4: {
                //
                break;
            }
            case 5: {
                // if (max-nbooks) >0 display; else display message
                break;
            }
            case 6: {
                flag = false;
                break;
            }
            default: {
                System.out.println("Enter a valid option!");
                flag = false;
                break;
            }

            }

        }
        sc.close();
    }
}