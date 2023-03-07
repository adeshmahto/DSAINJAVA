package Java8.OptionalCLass;

import java.util.Optional;

public class OptionalClass {
    public  static Optional<String> getName(){
        String str="adesh";
        return Optional.ofNullable(str);
    }
    public static void main(String[] args) {
        String str="adesh";
//        if(str==null){
//            System.out.println("null");
//        }else{
//            System.out.println(str.length());
//        }

        Optional<String> op=Optional.ofNullable(str);     //so we dont need to check additionally for nullpoint exception
        System.out.println(op.orElse("no value is not there"));


        System.out.println(getName().orElse("no value"));
    }
}
