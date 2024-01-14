
package dao;

/**
 *
 * @author AmTechGuy
 */

public class Table {
    
    public static void main(String [] ags){
//        String query = "create table user(id INT AUTO_INCREMENT primary key, email varchar(200), name varchar(200),"
//                + "password varchar(200), mobileNumber varchar(200), address varchar(200))";
//        DbOperations.setDataOrDelete(query, "User table created!!");
        
//        String category = "create table category(id INT AUTO_INCREMENT primary key, name varchar(200))";
//        DbOperations.setDataOrDelete(category, "Table created!");
//          String product = "create table product(id INT AUTO_INCREMENT primary key, name varchar(200), "
//                  + "category varchar(200), price varchar(200)) ";
//          DbOperations.setDataOrDelete(product, "Table created");
String query = "create table sales(id int AUTO_INCREMENT primary key, name varchar(200), "
                    + "quantity varchar(200), price varchar(200), total varchar(200), grandTotal varchar(200))";
            DbOperations.setDataOrDelete(query, "table created!");
    }
    
}
