package Bank;

import java.sql.*;


public class Conne {
   Connection c;
    Statement s;
    public Conne(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","Suman12345@");
            s =c.createStatement();
            
            
            
        }catch(Exception e){
            System.out.println(e);
            
            
        }
    }
}
