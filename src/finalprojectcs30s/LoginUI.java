
/** Required package class namespace */
package finalprojectcs30s;

/**
 * LoginUI.java - the login in user interface (UI) - a frame (form) user 
 * interface (UI) container created using the NetBeans Designer.
 *
 * @author Mr. Wachs
 * @since 25-Jan-2022, 11:11:49 AM
 */
public class LoginUI extends javax.swing.JFrame {

    /**
     * Constructor method (written by designer) creates new form 
     */
    public LoginUI() {
        initComponents();
        
        // Code after the designer written call to the method that builds 
        // the design
        this.setResizable(false);           // The frame (form) cannot be sized
        this.setLocationRelativeTo(null);   // Center the frame on the screen
        this.setVisible(true);              // display the frame to the user
    }

    //##########################################################################
    // NOTE: the NetBeans visual designer adds the code below which can NOT be
    // edited, it also adds other code like the constructor above which you can 
    // edit, add to, delete etc. The "Generated code" below can be seen by 
    // clicking the "plus sign +" to expand the code
    //##########################################################################
      
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        list1 = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Password:");

        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Log In");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Registed Users:");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(jTextField1)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(5, 5, 5))
                    .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //##########################################################################
    // NOTE: the NetBeans visual designer when a JFrame form is added to a 
    // project also adds a main method below for each JFrame form, but this 
    // main method can be edited and removed. I have removed the main method  
    // for this class
    //##########################################################################
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Double clicking a button in the design mode, immediately jumps to 
        // code written for you connected to that button...................
                
        // Create a new user, but first we need the name and password from the 
        // text field objects (using one of the methods built into that object)
        String name = jTextField1.getText();      
        
        // Error check to make sure they have filled out a name
        if (name == null || name.equals("")) {
            
            // Message the user    
            Dialogs.output("Please enter a name");      
            
            // Exit the method right here
            return;
        }
        
        // Do this all over again with the password
        String password = jTextField2.getText();        
        if (password == null || password.equals("")) {
            Dialogs.output("Please enter a password");      // Message user
            return;                                         // Leave method
        }
        
        // Make sure the password is only numbers by incorperationg a method
        // from the "Numbers" class we brought in from the class "Help" page
        // on Mr. Wachs' website
        if (Numbers.isInteger(password) == false) {
            Dialogs.output("Password must be numbers only!");   // Message user
            return;                                             // Leave method
        }
        
        // The code will get to here if I pass the above error checks....
        
        // Build a user (object)
        User user = new User(name, password);
        
        // Add this to the array
        Globals.users[Globals.index] = user;
        
        // Move to the next index for next time
        Globals.index++;
        
        // Add to the listbox
        list1.add(user.info());
        
        // Clear out the text boxes for the next time
        jTextField1.setText("");
        jTextField2.setText("");
        
        // Set the "focus" (the flashing cursor) to the textbox
        jTextField1.requestFocus();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        // Get the index number from the listbox using a built-in listbox method
        int index = list1.getSelectedIndex();        
        
        // Check to make sure they actually selected something in the listbox
        if (index == -1) {
            Dialogs.output("Please select a user!");    // Message user
            return;                                     // Leave method
        }
        
        // Use another built-in listbox method to remove it fromthe listbox
        list1.remove(index);        
        
        // You cannot "remove" a spot an array without rebuilding the entire 
        // array - so instead we will use a technique called "lazy deletion"        
        // and set the array location to a "null" value
        Globals.users[index] = null;        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Get the name and password from dialog inputs (again using the 
        // Dialogs class we brought into this project from our Help page
        String name     = Dialogs.input("Please enter user name");
        String password = Dialogs.input("Please enter user password");
        
        // Now build a temporay user to check for
        User user = new User(name, password);
        
        // Check if this user is in the database (the array) by calling a 
        // custom method that we will write lower in this code
        if (isInDatabase(user) == true) {
            Dialogs.output("Log in successful!");
            // Potentially, the code could move on to other parts of a final
            // project right here!!!!
        }
        else {
            Dialogs.output("User not in database!");
        }        
    }//GEN-LAST:event_jButton3ActionPerformed


    //##########################################################################
    // NOTE: the NetBeans visual designer adds the code below for each 
    // component (control, widget, property, global variable) which also 
    // cannot be edited
    //##########################################################################
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables

    /**
     * Checks if the passed user is in the array of all user who have 
     * registered or not
     * 
     * @param user the user to check
     * @return they are in the database (true) or they aren't (false)
     */
    private boolean isInDatabase(User user) {
        // Loop through the array
        for (int i = 0; i < Globals.users.length; i++) {
            // Pull out a user from the array
            User userInArray = Globals.users[i];            
            // Make sure the user isn't a "null" spot in the array (so we can
            // skip over empty array spots
            if (userInArray != null) {
                // Now call a method in the User class to compare 2 users
                if (user.isEqualTo(userInArray) == true) {
                    return true;                            // They are the same
                }
            }            
        }
        // After the loop, no user was found to be the same, so the user is 
        // not in the database (the array)
        return false;
    }
    
}
