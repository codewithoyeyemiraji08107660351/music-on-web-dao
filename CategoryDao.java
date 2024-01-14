
package dao;

import model.Category;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author AmTechGuy
 */
public class CategoryDao {
    
     public static void save(Category category){
        String query = "insert into category (name) values('"+category.getName()+"')";
        DbOperations.setDataOrDelete(query, "Category Added Successfully!");
    }
    
    public static void delete(String id){
        String query = "delete from category where id = '"+id+"'";
        DbOperations.setDataOrDelete(query, "Category Deleted Successfully!");
    }
     
    public static ArrayList<Category> getAllRecords(){
        ArrayList<Category> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select * from category");
            while(rs.next()){
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                arrayList.add(category);
             }
         
         }
         catch(Exception e){
             e.printStackTrace();
         }
         return arrayList;
     }
    
    
}
