import java.util.Scanner;

public class Main
{
    /*
    * make a functional library app using oop
    * run the main program in Main.java and code the oop part in other classes
    * don't forget to add at least 1 librarian to the library to make it functionable.
    * *  *** don't limit yourself to our template ***
     */

    public static void main(String[] args)
    {

        Library library = new Library();

        //-----------------------------

        String name = "ketab";
        String author = "author";
        String year = "2002";
        String ISBN = "5456";
        Book book = new Book(name,  author,  year, ISBN);

        //---------------------------------------------------

        String userNameUser = "userName";
        String passwordUser = "password";
        User user = new User(userNameUser , passwordUser);

        //---------------------------------------------------

        String userNameLibrarian = "username";
        String passwordLibrarian = "password";
        Librarian librarian = new Librarian(userNameLibrarian , passwordLibrarian);

        //-------------------------------------------------------------------

        runMenu(user ,librarian , library , book);
    }


    //=========================================================
    public static void runMenu(User user , Librarian librarian , Library library , Book book)
    {
        System.out.println("hello, welcome to this program");
        System.out.println("sign up or log in ?");
        Scanner input =  new Scanner(System.in);
        String answer  = input.nextLine();

        if(answer.equalsIgnoreCase("sign up"))
        {
             signUp(user);
        }

        else if(answer.equalsIgnoreCase("log in"))
        {
            logIn(user , librarian , library , book);
        }

        else
        {
            System.out.println("please enter valid input");
            runMenu(user , librarian , library , book);
        }



    }

    //==============================================================================

    public static void signUp(User user)
    {
        Scanner input =  new Scanner(System.in);

        System.out.println("please enter userName : ");
        String userName = input.nextLine();

        // doesUserExist():
        //sout("This userName already exists please enter another userName")

        //if not exist:
        System.out.println("please enter password");
        String password = input.nextLine();
        System.out.println("please Confirm your password ");
        String confirmPassword = input.nextLine();
        if(password.equals(confirmPassword))
        {
            System.out.println("welcome to this library " + userName);
            //adduser();

            runMenuUser(userName , password , user);
        }

        else
        {
            System.out.println("please try again and Confirm your password correctly");
            signUp(user);
        }

    }

    //=======================================================================================
    public static void logIn(User user , Librarian librarian , Library library , Book book)
    {
        Scanner input =  new Scanner(System.in);

        System.out.println("User or Librarian?");
        String answer1  = input.nextLine();

        if(answer1.equalsIgnoreCase("User"))
        {

                System.out.println("please enter your userName");
                String userName = input.nextLine();
                System.out.println("please enter your password");
                String password = input.nextLine();
               // doesUserExist()
               // if exist :
            runMenuUser(userName , password , user);

              //  if not exist :

                System.out.println("This user does not exist, please try again" + "sign up or log in?");
                String answer  = input.nextLine();

            if(answer.equalsIgnoreCase("sign up"))
            {
                signUp(user);
            }

            else if(answer.equalsIgnoreCase("log in"))
            {
                logIn(user  ,librarian , library , book);
            }

            else
            {
                System.out.println("You entered an expression that is not according to our request, so we will automatically do it again log in");
                logIn(user , librarian , library , book);
            }

        }

        else if(answer1.equalsIgnoreCase("Librarian"))
        {

            System.out.println("please enter your userName");
            String userName = input.nextLine();
            System.out.println("please enter your password");
            String password = input.nextLine();
//            doeslibrarianExist()

//            if exist :
            runMenuLibrarian(book , library , user);

//            if not exist :
            System.out.println("This user does not exist, please try again" + "sign up or log in?");
            String answer  = input.nextLine();

            if(answer.equalsIgnoreCase("sign up"))
            {
                signUp(user);
            }

            else if(answer.equalsIgnoreCase("log in"))
            {
                logIn(user , librarian , library , book);
            }

            else
            {
                System.out.println("You entered an expression that is not according to our request, so we will automatically do it again log in");
                logIn(user , librarian , library , book);
            }

        }

        else
        {
            System.out.println("please enter valid input");
            logIn(user , librarian , library , book);
        }



    }

    //===============================================================
    public static void runMenuUser(String username , String password , User user)
    {
        System.out.println("Do you want rent or return book? rent/return");
        Scanner input =  new Scanner(System.in);
        String answer = input.next();

        if(answer.equalsIgnoreCase("rent"))
        {

           user.rentBook();
        }

        else if(answer.equalsIgnoreCase("return"))
        {

            user.returnBook();
        }

        else
        {
            System.out.println("please enter valid input");
            runMenuUser(username , password , user);
        }



    }

    //===============================================================
    public static void runMenuLibrarian(Book book ,Library library , User user)
    {

        System.out.println("do you want search or changing user or changing book or changing librarian?  search/changing user/changing book/changing librarian");

        Scanner input = new Scanner(System.in);
        String answer = input.next();

        if(answer.equalsIgnoreCase("search"))
        {
            System.out.println("Do you want search to users or books or librarian?  users/books/librarian");
            String answer2 = input.next();
            if(answer2.equalsIgnoreCase("users"))
            {
                library.searchUser();
            }

            else if(answer2.equalsIgnoreCase("books"))
            {
                library.searchBook();
            }

            else if(answer2.equalsIgnoreCase("librarian"))
            {
               library.searchLibrarian();
            }

            else
            {
                System.out.println("please enter valid input and try again");
                runMenuLibrarian(book , library , user);

            }
        }

        else if(answer.equalsIgnoreCase("changing user"))
        {
            System.out.println("Do you want add or remove or update users? add/remove/update");
            String answer3 = input.next();

            if(answer3.equalsIgnoreCase("add"))
            {
                library.addUser(user);
            }

            else if(answer3.equalsIgnoreCase("remove"))
            {
                library.removeUser();
            }

            else if(answer3.equalsIgnoreCase("update"))
            {
                library.updateUser();
            }

            else
            {
                System.out.println("please enter valid input and try again");
                runMenuLibrarian(book , library ,user );

            }

        }

        else if(answer.equalsIgnoreCase("changing book"))
        {
            System.out.println("Do you want add or remove or update books? add/remove/update");
            String answer3 = input.next();

            if(answer3.equalsIgnoreCase("add"))
            {

                library.addBook(book);
            }

            else if(answer3.equalsIgnoreCase("remove"))
            {
                library.removeBook();
            }

            else if(answer3.equalsIgnoreCase("update"))
            {
                library.updateBook();
            }

            else
            {
                System.out.println("please enter valid input and try again");
                runMenuLibrarian(book , library , user);

            }

        }

        else if(answer.equalsIgnoreCase("changing librarian"))
        {
            System.out.println("Do you want add or remove or update librarian? add/remove/update");
            String answer3 = input.next();

            if(answer3.equalsIgnoreCase("add"))
            {
                //addLibrarian();
            }

            else if(answer3.equalsIgnoreCase("remove"))
            {
                //removelibrarian();
            }

            else if(answer3.equalsIgnoreCase("update"))
            {
                //updatelibrarian();
            }

            else
            {
                System.out.println("please enter valid input and try again");
                runMenuLibrarian(book , library , user);

            }

        }
    }

    //===================================================================






}
