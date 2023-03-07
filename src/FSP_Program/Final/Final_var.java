package FSP_Program.Final;

public class Final_var {
    final int sp=90;
    void execute(){
        System.out.println(sp);
//        sp=400;
        System.out.println(sp);
    }

    public static void main(String[] args) {
        Final_var obj=new Final_var();
        obj.execute();
    }
}
