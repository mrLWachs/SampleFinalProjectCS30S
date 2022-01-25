/** Required package class namespace */
package finalprojectcs30s;

 
/**
 * User.java - description
 *
 * @author Mr. Wachs
 * @since 25-Jan-2022, 11:11:49 AM
 */
public class User extends Person
{

    // "hide" or "encapsulate" this property (global variable)
    private String password;
    
    public User(String name, String password) {
        this.password = password;
        super.name = name;
    }
    
    public String info() {
        return super.name;
    }
    
}