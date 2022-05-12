import java.sql.*;

public class App {

    private Connection conn;

    public App()
    {

        String url = "jdbc:postgresql://localhost:5432/test";
        //Properties props = new Properties();
        //props.setProperty("user","postgres");
        //props.setProperty("password","Dedsec@7");
        //props.setProperty("ssl","true");
        try
        {
        conn = DriverManager.getConnection(url,"postgres","Dedsec@7");

        System.out.println("connection established");
        System.out.println(conn.getSchema());

        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
     {

        App db = new App();
        while(true)
        {
            //Thread.sleep(1000);
        }
        
    }
    
}
