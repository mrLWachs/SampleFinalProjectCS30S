
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
    
}