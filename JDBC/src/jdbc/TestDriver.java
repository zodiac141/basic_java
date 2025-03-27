package jdbc;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;
public class TestDriver {

    public static void main(String[] args) throws SQLException{
        com.mysql.cj.jdbc.Driver driver = new Driver();
        DriverManager.registerDriver(driver);
        String url = "jdbc:mysql://localhost:3306/nexturn";
        Connection conn = DriverManager.getConnection(url,"root","zodiac141");
        //System.out.println("connected");
        String query="insert into student values(45,'suisui','600')";
        Statement st=conn.createStatement();
        int rows=st.executeUpdate(query);
        System.out.println(rows);
        conn.close();
    }
}


