package jdbc;
import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;
public class AddStudent {

    public static void main(String[] args) throws SQLException{
        com.mysql.cj.jdbc.Driver driver = new Driver();
        DriverManager.registerDriver(driver);
        String url = "jdbc:mysql://localhost:3306/nexturn";
        Connection conn = DriverManager.getConnection(url,"root","zodiac141");
        //System.out.println("connected");
        String query="insert into student values(?,?,?)";
        PreparedStatement pst=conn.prepareStatement(query);

       /*pst.setInt(1, 300);
       pst.setString(2,"rolando");
       pst.setInt(3, 600);
        int rows=pst.executeUpdate();
        if (rows>0) {
            System.out.println("student added");
        }else {
            System.out.println("student not added");
        }
        conn.close();*/

        //using keyboard input scanner class
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter student id");
            int id = sc.nextInt();
            System.out.println("enter student name");
            String name = sc.next();
            System.out.println("enter student marks");
            int marks = sc.nextInt();
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setInt(3, marks);
            int rows = pst.executeUpdate();
            if (rows > 0) {
                System.out.println("student added");
            } else {
                System.out.println("student not added");
            }
            conn.close();
        }

    }
}


