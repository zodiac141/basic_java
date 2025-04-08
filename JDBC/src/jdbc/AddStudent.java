package jdbc;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;


public class AddStudent {

    public static void main(String[] args) throws SQLException, ParseException {
        com.mysql.cj.jdbc.Driver driver = new Driver();
        DriverManager.registerDriver(driver);
        String url = "jdbc:mysql://localhost:3306/nexturn";
        Connection conn = DriverManager.getConnection(url, "root", "zodiac141");
        //System.out.println("connected");
        //String query="insert into student values(?,?,?)";
        //String query="select *from student";  //extracting data from db
        //String query="insert into testdates (dob) values(?)";  // use for adding dates in sql

        /*Statement st = conn.createStatement();    //add column dob in student table
        Multilayerconfigur
        String query1 = "ALTER table student ADD COLUMN dob date";
        st.executeUpdate(query1);*/

        while (true) {
            System.out.println("Enter the registration number:");
            Scanner sc = new Scanner(System.in);
            int regno = sc.nextInt();

            System.out.println("Enter the dob for the reg id");
            String dateOfBirth = sc.next();

            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date utilDate = sdf.parse(dateOfBirth);
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

            String query2 = "UPDATE student SET dob = ? WHERE regno = ?";
            PreparedStatement pst = conn.prepareStatement(query2);
            pst.setDate(1, sqlDate);
            pst.setInt(2, regno);

            int rowsUpdated = pst.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");







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

        /*using keyboard input scanner class
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
        }*/


            //for retrieving data from the db along with display of column name
        /*ResultSet rs=pst.executeQuery();
        ResultSetMetaData meta=rs.getMetaData();
        for (int i=1;i<meta.getColumnCount();i++)
            System.out.println(meta.getColumnName(i) + "  ");
        System.out.println("\n-----------------------------");
        while(rs.next()){
            System.out.println(rs.getInt(1) +" " + rs.getString("stdname") + " "+rs.getInt(1)); */



       /* String date="26-03-2025";
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date utilDate=sdf.parse(date);
        java.sql.Date sqlDate=new java.sql.Date(utilDate.getTime()); */

        }
    }
}



