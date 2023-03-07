package Java8.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //stream api work for collections or group of object

        Stream<Object> empty=Stream.empty();
        empty.forEach(e->{ });

         //2 -array,object ,collections
        String names[]={"adesh","Mahto","raj"};

        //stream object
        Stream<String>stream1=Stream.of(names);
        stream1.forEach(e->{
//            System.out.println(e);
        });
        //3 object
        Stream<Object>streambuilder= Stream.builder().build();


        //4
        IntStream stream=Arrays.stream(new int []{2,3,4,5}); //anonymous array
//        stream.forEach(e->{System.out.println(e);});


        //stream in list
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(23);
        list.stream().forEach(e->{
            System.out.println(e);}
        );
        list.stream().filter(i->i>23).forEach(e->{
            System.out.println(e);
        });





    }
}
