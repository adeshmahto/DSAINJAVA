package Abstract;

public class daughter extends  parent{

    public daughter(int age){

    }
    @Override
    void career(String name) {
        System.out.println("i will be a doctore in this hospital "+name);
    }

    @Override
    void Dev(String name) {
        System.out.println("i will be  "+name+"devlopment");
    }
}
