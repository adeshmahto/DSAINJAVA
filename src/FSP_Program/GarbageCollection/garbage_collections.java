package FSP_Program.GarbageCollection;

import javax.swing.plaf.synth.SynthLookAndFeel;

class Employee{
    private int Id;
    private  String name;
    private int  age;
    private static int nextId=1;

    Employee(String name,int age){
        this.name=name;
        this.age=age;
        this.Id=nextId++;
    }
    public void show(){
        System.out.println("Id"+Id+"\nName="+name +"\nAge="+age);
    }
    public void showNextId(){
System.out.println("next employee id will be="+nextId);

    }
    protected void finalize(){
        --nextId;
        //in this case;
        //gc will call finalize()
        //for 2 times for 2 objects.
    }
}



public class garbage_collections {
    public static void main(String[] args) {

        Employee E=new Employee("adesh",21);
        Employee F=new Employee("cap2",45);
        Employee G=new Employee("Cap3",25);
        E.show();
        F.show();
        G.show();
        E.showNextId();
        F.showNextId();
        G.showNextId();{
            Employee x=new Employee("cap4",23);
            Employee y=new Employee("cap5",21);
            x.show();
            y.show();
//
            System.gc();
            System.runFinalization();
        }






    }
}
