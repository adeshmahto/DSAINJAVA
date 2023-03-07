package Assignmentfinal.ass3;

public class nullclass {
    String name;

    void  setName(String name){
        this.name=name;
    }
    void getlength() {
        try {
            System.out.println(this.name.length());
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
