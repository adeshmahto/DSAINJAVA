package Objectclass;

public class hascodee {
    int num;

    hascodee(int h){
        num=h;
    }

    public boolean equals(hascodee obj) {
        return this.num==obj.num;     // typecasting

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        hascodee h=new hascodee(34);
        hascodee h2=new hascodee(34);
        System.out.println(h instanceof hascodee);


    }
}
