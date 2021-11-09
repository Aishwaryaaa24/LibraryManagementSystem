package src;

//import java.util.Scanner;
import java.io.File;

public class utility {
    public static int generateID (String filename)
    {
        File file = new File(filename);
        String[] detail = LastLine.tail(file).split(",");
        try 
        {
            int lastId = Integer.parseInt(detail[0]);
            return lastId + 1;
        }
        catch (Exception e) 
        {
            return 1;
        }
    }
    public static String getdetails(File filename)
    {
        String s = "";
        return s;
    }

}
