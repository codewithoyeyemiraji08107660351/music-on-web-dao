
package dao;

import model.SalesHistory;
/**
 *
 * @author AmTechGuy
 */
public class SalesHistoryDao {
    
    public static void save(SalesHistory sales){
        String query = "insert into sales (name, quantity, price, total, grandTotal) "
                + "values('"+sales.getName()+"', '"+sales.getQuantity()+"', '"+sales.getPrice()+"', "
                + "'"+sales.getTotal()+"', '"+sales.getGrandTotal()+"')";
        DbOperations.setDataOrDelete(query, "Loading payment gateway!!");
        
    }
    
}
