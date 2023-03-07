package FSP_Program.Collections;

import Access.A;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class collectiosn {
    public static void main(String[] args) {
        ArrayList<String> lis=new ArrayList<>();
        lis.add("adesh");
        lis.add("sonu");
        lis.add("anish");
//        lis.stream().forEach(e->{System.out.println(e);});
        //
//        Iterator itr= lis.iterator();
//        while (itr.hasNext()){
//       System.out.println(itr.next());
//        }


        ListIterator<String>st=lis.listIterator(lis.size());
        while (st.hasPrevious()){
            String str=st.previous();
            System.out.println(st);
        }
        for(int i=0;i<lis.size();i++){
            System.out.println(lis.get(i));
        }
    }
}
