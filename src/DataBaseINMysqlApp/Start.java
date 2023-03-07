package DataBaseINMysqlApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to student Management App");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("press 1 add student");
            System.out.println("press 2 delete student");
            System.out.println("press 3 display student");
            System.out.println("press 4 exit student");
            int c=Integer.parseInt(br.readLine());
            if(c==1){
                //add
                System.out.println("Enter user name: ");
                String name=br.readLine();
                System.out.println("Enter user phone: ");
                String phone=br.readLine();
                System.out.println("Enter user city:    ");
                String city=br.readLine();

                //create student object to store student
                Student st=new Student(name,phone,city);
               boolean ans=StudentDao.insertStudenttoDb(st);
               if(ans){
                   System.out.println("student is added succesfully..");
               }else {
                   System.out.println("something went wrong");
               }
                System.out.println(st);


            }else if(c==2){
                //delete

                System.out.println("enter the student id to delete");
                int userId=Integer.parseInt(br.readLine());
                //call the method from class studentDao
              boolean ans=  StudentDao.deleteStudent(userId);
              if(ans){
                  System.out.println("delete successfully");
              }else {
                  System.out.println("something went wrong");
              }


            }else if(c==3){
                //display student

                System.out.println("show all student");
                StudentDao.ShowALL();

            }else if(c==4){

                //exit
                break;
            }else {

            }


        }
        System.out.println("Thankyou for using this app");
    }
}
