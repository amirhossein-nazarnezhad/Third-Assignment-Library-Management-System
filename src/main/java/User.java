public class User {
    //User should have a list of books
    //User should have a username and a password

    private String userName;
    private String password;

//==================================================

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //========================================================

    public void rentBook(){
        //TODO


    }

    public void returnBook(){
        //TODO
    }

    //===============================================
}
