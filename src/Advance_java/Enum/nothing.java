package Advance_java.Enum;

import java.io.*;

public class nothing {
    public enum Color {

        RED,GREEN,BLUE;

    }

    public static class main {
        public static void main(String[] args) {
            // enum
    //        Color c1=Color.BLUE;
    //
    //        for(Color color:Color.values()){
    //            System.out.println("enum value "+ color.name());
            Student student=new Student("adesh","23 East, California",25);
            String filename="E:\\Advance\\Advance java";
            FileOutputStream fileOUt=null;
            ObjectOutputStream objOut=null;

            try{
                fileOUt=new FileOutputStream(filename);
                objOut=new ObjectOutputStream(fileOUt);


                objOut.writeObject(student);

                objOut.close();
                fileOUt.close();
                System.out.println(student);


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static class Student  implements Serializable {



        private  static final  long serialVersionUID=1L;

        private  String name;
        private  String Address;
        private  int age;

        public Student(String name, String address, int age) {
            this.name = name;
            Address = address;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public  String toString(){
            return ("Student name is"+this.getName()+ ",age is :"+this.getAge()+" and address is: "+ this.getAddress());
        }
    }
}
