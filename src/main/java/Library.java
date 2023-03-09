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
//
//    String address = "C:\\Users\\ASUS\\Desktop\\java code\\Third-assignment.txt";
//    File userFile = new File("address");
//    File librarianFile = new File("address");
//    File bookFile = new File("address");



        //array list
//============================================================================
         ArrayList<Book> books = new ArrayList<Book>();
         ArrayList<Librarian> librarians = new ArrayList<Librarian>();
         ArrayList<User> users = new ArrayList<User>();


//===============================================================================



    public Library()
    {
       Librarian first = new Librarian("driver" , "12345");
       librarians.add(first);
    }


    //==========================================================================
    public void addBook(Book book){
//        try
//        {
//            FileWriter books = new FileWriter("bookFile" , true);
//
//        }
//        catch (IOException e)
//        {
//            throw new RuntimeException(e);
//        }


        books.add(book);

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
//
//        try
//        {
//            FileWriter users = new FileWriter("userFile" , true);
//        }
//        catch (IOException e)
//        {
//            throw new RuntimeException(e);
//        }

        users.add(user);

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

    public boolean doesUserExist(User user){
        //TODO
        for (int i=0 ; i< users.size() ; i++)
        {
            if(user.equals(users))
            {
                return true;

            }
            else
            {
                return false;
            }
        }
       return false;

    }

    //======================================================

    //librarian related functions

    public void addLibrarian(Librarian librarian){

//        try
//        {
//            FileWriter librarians = new FileWriter("librarianFile" , true);
//        }
//        catch (IOException e)
//        {
//            throw new RuntimeException(e);
//        }
        librarians.add(librarian);

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

    public boolean doesLibrarianExist(Librarian librarian){
        //TODO
        return true;
    }

    //===================================================================


}
