package FSP_Program.statics;
//static in varibale
 class emp
{
    String nm;
    int salary;
     static String com_nm="blue_dart";

    emp(String nm,int salary){
        this.nm=nm;
        this.salary=salary;

    }
    void display(){
        System.out.print(nm+" ");
        System.out.print(salary+" ");
        System.out.print(com_nm+" ");
    }
}
public class MY_Static{
    public static void main(String[] args) {

        emp e1=new emp("kamal",1000);
        emp e2=new emp("jamal",2000);
        System.out.println(emp.com_nm);// static


    }
}
