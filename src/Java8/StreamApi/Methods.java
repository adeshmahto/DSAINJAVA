package Java8.StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {

        //filter(predicate)
        //predicate->boolean value function


        //map
        List<String>names= List.of("Aman","Ankit","Adesh","raj");
        names.stream().filter(e->e.startsWith("A")).forEach(e->System.out.println(e));
        names.stream().forEach(System.out::println);

        List<Integer>numbers=List.of(23,4,3,5,7,4);
        List<Integer> l=numbers.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(l);

        //sorted
        numbers.stream().sorted().forEach(System.out::println);

       int i= numbers.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(i);

        int j= numbers.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(j);



    }
}
