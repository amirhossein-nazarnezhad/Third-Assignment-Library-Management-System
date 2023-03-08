import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class Library {


    /*
    * The library should have a list of books.
    * The library should have a map of books ISBNs which is linked to the amount of book
    -> (for example: harry potter -> 4 means there are currently 4 harry potter books)
    * The library should have a list of users and a list of librarians.
     */

    //book related functions



    //file text
//===================================================================

    String address = "C:\\Users\\ASUS\\Desktop\\java code\\Third-assignment.txt";
    File userFile = new File("address");
    File librarianFile = new File("address");
    File bookFile = new File("address");


//============================================================================

    public Library()
    {
//        Librarian first = new Librarian("driver" , "12345");
//        librarians.add(first);
    }


    //==========================================================================
    public void addBook(Book book){
        try
        {
            FileWriter books = new FileWriter("bookFile" , true);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        //TODO


    }

    //==================================================================

    public void removeBook(){
        //TODO
    }

    //==================================================================

    public void searchBook(){
        //TODO
    }
    //========================================================================

    public void updateBook(){
        //TODO
    }
    //======================================================================

    public void doesBookExist(){
        //TODO
    }

    //===============================================================

    public void increaseBook(){
        //TODO
    }

    //=================================================================

    public void decreaseBook(){
        //TODO
    }

    //=======================================================================

    //user related functions

    public void addUser(User user){

        try
        {
            FileWriter users = new FileWriter("userFile" , true);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }

    //======================================================================
    public void removeUser(){
        //TODO
    }

    //==========================================================

    public void searchUser(){
        //TODO
    }

    //================================================================

    public void updateUser(){
        //TODO
    }

    //==============================================================

    public void doesUserExist(){
        //TODO
    }

    //======================================================

    //librarian related functions

    public void addLibrarian(Librarian librarian){

        try
        {
            FileWriter librarians = new FileWriter("librarianFile" , true);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }

    //=========================================================================

    public void removeLibrarian(){
        //TODO
    }

    //==================================================================

    public void searchLibrarian(){
        //TODO
    }

    //================================================================

    public void updateLibrarian(){
        //TODO
    }

    //===================================================================

    public void doesLibrarianExist(){
        //TODO
    }

    //===================================================================


}
