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
        runMenu();

    }


    //=========================================================
    public static void runMenu()
    {
        System.out.println("hello, welcome to this program");
        System.out.println("sign up or log in ?");
        Scanner input =  new Scanner(System.in);
        String answer  = input.nextLine();

        if(answer.equalsIgnoreCase("sign up"))
        {
             signUp();
        }

        else if(answer.equalsIgnoreCase("log in"))
        {
            logIn();
        }

        else
        {
            System.out.println("please enter valid input");
            runMenu();
        }



    }


    public static void signUp()
    {
        Scanner input =  new Scanner(System.in);

        System.out.println("please enter ID : ");
        String ID = input.nextLine();

        // doesUserExist():
        //sout("This ID already existsو please enter another ID")

        //if not exist:
        System.out.println("please enter password");
        String password = input.nextLine();
        System.out.println("please Confirm your password ");
        String confirmPassword = input.nextLine();
        if(password.equals(confirmPassword))
        {
            System.out.println("welcome to this library" + ID);
            //adduser();
        }

        else
        {
            System.out.println("please try again and Confirm your password correctly");
            signUp();
        }

    }

    public static void logIn()
    {
        Scanner input =  new Scanner(System.in);

        System.out.println("please enter your ID");
        String ID = input.nextLine();
        System.out.println("please enter your password");
        String password = input.nextLine();
        //doesUserExist()
        //if not exist :
        //sout("This user does not exist, please try again" + "sign up or log in?")
//        String answer  = input.nextLine();
//
//        if(answer.equalsIgnoreCase("sign up"))
//        {
//            signUp();
//        }
//
//        else if(answer.equalsIgnoreCase("log in"))
//        {
//            logIn();
//        }
//
//        else
//        {
//            System.out.println("You entered an expression that is not according to our request, so we will automatically do it again log in");
//            logIN();
//        }
    }






}
