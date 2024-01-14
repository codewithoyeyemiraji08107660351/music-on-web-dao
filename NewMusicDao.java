
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import model.NewMusic;
/**
 *
 * @author AmTechGuy
 */
public class NewMusicDao {
    
    public static void save(NewMusic music){
        String query = "insert into product (name, category, price)"
                + "values('"+music.getName()+"', '"+music.getCategory()+"', '"+music.getPrice()+"')";
        DbOperations.setDataOrDelete(query, "Music successfully Added!!");
    }
    
    public static ArrayList<NewMusic>getALLRecordsByCategory(String category){
        ArrayList<NewMusic>arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("Select * from product where category = '"+category+"'");
            while (rs.next()){
                NewMusic newMusic = new NewMusic();
               newMusic.setName(rs.getString ("name"));
                arrayList.add(newMusic);     
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Records not found");
        }
        return arrayList;
    }
    
     public static NewMusic getProductByName(String name){
          NewMusic newMusic = new NewMusic();
          try{
              ResultSet rs = DbOperations.getData("select * from product where name = '"+name+"'");
              while(rs.next()){
              newMusic.setName(rs.getString(2));
              newMusic.setCategory(rs.getString(3));
              newMusic.setPrice(rs.getString(4));
              }
          }
          catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
          }
          return newMusic;
      
      }   
}
