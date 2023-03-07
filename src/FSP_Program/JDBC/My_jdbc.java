package FSP_Program.JDBC;
import  java.sql.*;

public class My_jdbc {
    static final String Db_Url="jdbc:mysql://localhost:3306/microservices";
    static final String Db_Drv="mysql-connector-java";
    static final String Db_User="root";
    static final String Db_Pass="password";

    public static void main(String[] args) throws SQLException {
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        try{
            Class.forName(Db_Drv);
            con=DriverManager.getConnection(Db_Url,Db_User,Db_Pass);
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM HOTELS");
            while (rs.next()){
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
            }
        }catch (SQLException | ClassNotFoundException x){
            System.out.println(x.getMessage());
        }
        finally {
            try{
                rs.close();
                st.close();
                con.close();
            }catch (SQLException ex){

            }
        }


    }
}
