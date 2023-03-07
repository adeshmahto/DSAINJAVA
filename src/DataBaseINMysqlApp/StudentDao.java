package DataBaseINMysqlApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
    public static boolean insertStudenttoDb(Student st){
        boolean f=false; // to check the execution

        //jdbc code
        try{
            Connection con= CP.create();
            String q="insert into students(sname,sphone,scity) values(?,?,?)";
            //PrepareStatemet
            PreparedStatement pstmt=con.prepareStatement(q);
            //set the values of parameters
            pstmt.setString(1,st.getStudenPhone());
            pstmt.setString(2,st.getStudenPhone());
            pstmt.setString(3,st.getStudentCity());

            //execute ..
            pstmt.executeUpdate();      // all the data will go to the  database
            f=true;

        }catch (Exception e){
            e.printStackTrace();
        }
      return f;

    }


    public static boolean deleteStudent(int userId) {
        boolean f=false; // to check the execution

        //jdbc code
        try{
            Connection con= CP.create();
            String q="delete from students where sid=?";
            //PrepareStatemet
            PreparedStatement pstmt=con.prepareStatement(q);
            //set the values of parameters
            pstmt.setInt(1,userId);       // if you set integer then use set int
            //execute ..
            pstmt.executeUpdate();      // all the data will go to the  database
            f=true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return f;


    }

    public static void ShowALL() {



        //jdbc code
        try{
            Connection con= CP.create();
            String q="select *from students";
           //statement
            Statement stmt=con.createStatement();
            ResultSet set=stmt.executeQuery(q);       //when data will comming so we use executequery and resultset storing the value;
            //execute ..


          //print the result
            while (set.next()){
                int id=set.getInt(1); //first row first columb
                String name=set.getString(2);
                String phone=set.getString("scity");   //3 or scity
                System.out.println("Id"+id);
                System.out.println("Name"+name);
                System.out.println("Phone"+phone);
                System.out.println("***************************");


            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
