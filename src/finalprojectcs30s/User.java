
/** Required package class namespace */
package finalprojectcs30s;

 
/**
 * User.java - the user of this program
 *
 * @author Mr. Wachs
 * @since 25-Jan-2022, 11:11:49 AM
 */
public class User extends Person
{

    // We "hide" or "encapsulate" this property (global variable)
    private String password;
    
    /**
     * Class constructor sets class properties
     * 
     * @param name the name of this user
     * @param password the passwrod for this user
     */
    public User(String name, String password) {
        this.password = password;
        super.name = name;
    }
    
    /**
     * The information to display about this user
     * 
     * @return the information to display
     */
    public String info() {
        return super.name;
    }

    /**
     * Checks the passed user with "this" user
     * 
     * @param user the user to check
     * @return they are the same (true) or not (false)
     */
    public boolean isEqualTo(User user) {
        // Check the names first by pulling each name from each instance and
        // storing the values in temporary variables
        String name1 = this.name;
        String name2 = user.name;
        // Use the built-in string method to see if 2 strings are equal and if
        // they are not equal then the 2 users are not equal
        if (name1.equals(name2) == false) return false;
        
        // Now check the passwords the same way
        String password1 = this.password;
        String password2 = user.password;
        if (password1.equals(password2) == false) return false; 
        
        // Passes the checks of names and passwords so the 2 users are equal
        return true;
    }
    
}