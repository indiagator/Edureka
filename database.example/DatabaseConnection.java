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

    public static void main(String[] args) throws SQLException {

        DatabaseConnection db = new DatabaseConnection();

        System.out.println("connection established");

        String query = "SELECT * FROM customer";
        Statement statement = null;
        ResultSet resultSet = null;
        try
        {
            statement = db.conn.createStatement();
            resultSet = statement.executeQuery(query);

            while(resultSet.next())
            {
                //System.out.println(resultSet.getString(1));
                //System.out.println(resultSet.getString(2));

                System.out.println("Welcome to Swiggy "+resultSet.getString(2)+"! Your current registered phonenumber is "+resultSet.getString(1));

            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }


        db.conn.close();

    }

}
