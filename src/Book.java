package src;

import java.io.FileReader; 
//import java.io.FileNotFoundException; 

public class Book {
    int SrNo;
    String nameOfBook;
    int BookID;
    String author;
    String edition;
    int IssuedBy;

    public void Bookdeets(Book book)
    {
        String bookdeet = book.setbookdetails();
        try
        {
            FileReader fr=new FileReader("./data/books.csv");    
            int i;    
            while((i=fr.read())!=-1)    
            System.out.print((char)i);    
            fr.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
                
    }
    public String setbookdetails() {

        return this.SrNo + "," + this.nameOfBook.toString() + "," + this.BookID + "," + 
        this.author + "," + this.edition + "," + this.IssuedBy;
    }
}