package FSP_Program.JDBC;
import java.sql.*;

import java.io.*;
public class CP {
    public static Connection con;
    public static Connection creat(){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //create the connection
            String username = "root";
            String password = "password";
            String url = "jdbc:mysql://localhost:3306/microservices";
            con =DriverManager.getConnection(url,username,password);
        }catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;

    }

    public static void main(String[] args) throws SQLException {


//        System.out.println(CP.creat());




    }


}
