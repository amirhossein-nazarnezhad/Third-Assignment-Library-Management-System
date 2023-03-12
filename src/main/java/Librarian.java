public class Librarian {

    private String userName;
    private String password;
//======================================================
    public Librarian(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


//============================================================
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//===============================================================

    /*
    * The librarian should have a username and a password
    * The librarian should be able to search users, librarians and books
    * The librarian should be able to add\remove\\update user add\remove\\update_
    _ librarian and add\remove\\update book
     */


}
