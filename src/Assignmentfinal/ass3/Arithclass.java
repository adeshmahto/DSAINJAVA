package Assignmentfinal.ass3;

public class Arithclass {
    int x;
    int y;
    Arithclass(int x,int y){
        this.x=x;
        this.y=y;
    }
    void divide(){
        try {
            int z=x/y;
            System.out.println("x is divided by y "+z);

        }catch (Exception e){
            System.out.println(e);
        }
    }


}
