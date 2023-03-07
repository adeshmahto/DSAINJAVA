package DataBaseINMysqlApp;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
    static  Connection con;
    public static Connection create() {

        //load the driver
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //create the connections
            String url="jdbc:mysql://localhost:3306/student_manage";
            String user="root";
            String pass="password";
            con= DriverManager.getConnection(url,user,pass);
        }catch (Exception e){
            e.printStackTrace();
        }
    return con;

    }
}
