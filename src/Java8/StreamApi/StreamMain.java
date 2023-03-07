package Java8.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
       List<Integer>list= List.of(2,3,4,5,5);//unmutable list

//        list.add(2); cannot use

        List<Integer>list2=new ArrayList<>();
        // mutable list
//        List<Integer>listEven=new ArrayList<>();
//        for(Integer i:list){
//            if(i%2==0){
//                listEven.add(i);
//            }
//        }
//
//        Stream<Integer>stream=list.stream();
//        List<Integer>collect=stream.filter(i->i%2==0).collect(Collectors.toList());

       List<Integer>collect=list.stream().filter(i->i%2==0).collect(Collectors.toList());
       System.out.println(collect);


       //i>3
        List<Integer>collect1=list.stream().filter(i->(i>=3)).collect(Collectors.toList());
        System.out.println(collect1);


        // ho








    }
}
