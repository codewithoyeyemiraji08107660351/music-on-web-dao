
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.User;
/**
 *
 * @author AmTechGuy
 */
public class UserDao {
    
    public static void save(User user){
        String query = "insert into user(email, name, password, mobileNumber, address) "
                + "values('"+user.getEmail()+"', '"+user.getName()+"', '"+user.getPassword()+"',"
                + "'"+user.getMobileNumber()+"', '"+user.getAddress()+"')";
        DbOperations.setDataOrDelete(query, "Registration Success!!");
    }
    
    public static User login(String email, String password){
        User user = null;
        try{
            ResultSet rs = DbOperations.getData("SELECT * FROM user where email = '"+email+"' AND password = '"+password+"'");
            while(rs.next()){
                user = new User();
                user.setEmail(rs.getString("email"));
                //user.setPassword(rs.getString("pasword"));
                JOptionPane.showMessageDialog(null, "Login successful!");
            }            
        
        } 
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        
        } 
        return  user;
    } 
    
}
