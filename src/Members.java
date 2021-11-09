package src;

import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class Members {
    Integer memberID;
    Date dateOfMembership;
    int nBooks;
    String MemberName;
    String PhoneNumber;
    boolean status = false;//existing member(1)

       
    public Members(Scanner sc, String MemberName,String Address, String PhoneNumber,int nBooks)
    {
            
        Scanner fSc;
        try {
            File file = new File("./data/members.csv");///*** */
            fSc = new Scanner(file);
            //process the file, one line at a time
            while (fSc.hasNextLine()) {

                String[] details = fSc.nextLine().split(",");

                // check is required row is found
                if (details[4].equals(PhoneNumber)) {
                    // to prevent duplicate records
                    this.status = true;
                    
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.memberID = utility.generateID("./data/members.csv");
        this.PhoneNumber = PhoneNumber;
        //this.address = getOrAddAddress(phone, scanner);
        this.dateOfMembership = new Date();
        this.nBooks = nBooks;
        this.MemberName = MemberName;//*** */

        AddUser(this);
    }

    public void AddUser(Members member) {
        String data = member.setdetails();

        // if member was already found in db
        if (status)
            return;
        try {
            FileWriter writer = new FileWriter("./data/members.csv", true);
            writer.write(data);
            writer.write(System.getProperty("line.separator"));
            writer.close();

            this.status = true;
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public String setdetails() {
        return this.memberID.toString() + "," + this.dateOfMembership + "," + 
        this.nBooks + "," + this.MemberName + "," + this.PhoneNumber + "," + this.status;
    }
}
