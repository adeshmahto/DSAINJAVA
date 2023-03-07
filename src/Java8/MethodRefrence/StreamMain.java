package Java8.MethodRefrence;

import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer>l=List.of(14,3,4,5,6,7,7);
        l.stream().forEach(System.out::println); // method refrencess
    }
}
