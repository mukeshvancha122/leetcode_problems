
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database{
    public static void main(String[] args) {
        String url="jdbc:postgresql://localhost:5432/testing";
        String username="postgres";
        String password="postgres";

        try{
            Connection c= DriverManger.getConnection(url,username,password);
            if(c!=null){
                System.out.println("Connection successful!");
            }
            else{
                System.out.println("No connection found!");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}