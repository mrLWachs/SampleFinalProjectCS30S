
/** Required package class namespace */
package finalprojectcs30s;

 
/**
 * Globals.java - description
 *
 * @author Mr. Wachs
 * @since 25-Jan-2022, 11:15:55 AM
 */
public class Globals 
{

    // makes a global varaible across all classes
    // in this project and the word "static" 
    // essentially means "shared"
    public static User[] users = new User[100];
    
    // track which spot in the array to add to
    public static int index = 0;
    
}