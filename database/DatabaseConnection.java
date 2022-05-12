import java.sql.*;

public class DatabaseConnection {

    private Connection conn;

    public DatabaseConnection(){

        String url = "jdbc:postgresql://localhost:5432/test";
        //Properties props = new Properties();
        //props.setProperty("user","postgres");
        //props.setProperty("password","Dedsec@7");
        //props.setProperty("ssl","true");
        try
        {
        conn = DriverManager.getConnection(url,"postgres","Dedsec@7");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        DatabaseConnection db = new DatabaseConnection();

        while(true)
        {

            //Thread.sleep(1000);
        }
        
    }
    
}
