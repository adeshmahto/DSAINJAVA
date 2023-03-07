package Greedy;

//import java.util.HashSet;
//
//public class choseandswap {
//    public static void main(String[] args) {
//        String name="adesh";
//        HashSet<Character> set=new HashSet<>();
//        for (int i = 0; i < name.length(); i++) {
//         set.add(name.charAt(i));
//        }
//
//
//
//
//    }
//    String choseANdswap(String a){
//        HashSet<Character> set=new HashSet<>();
//        for (int i = 0; i < a.length(); i++) {
//            set.add(a.charAt(i));
//        }
//        for (int i = 0; i < a.length(); i++) {
//            set.remove(a.charAt(i));
//            if(set.isEmpty())break;
//            char ch= set.stream().findFirst().get();
//            if(ch<a.charAt(i)){
//                char ch2 =a.charAt(i);
//                for (int j = 0; j < a.length(); j++) {
//                    if(a.charAt(j)==ch) {
//                        a.charAt(j)=ch;
//                    }else if(a.charAt(j)==ch2) {
//                        a.charAt(j)=ch;
//                    }
//                    break;
//
//                }
//            }
//
//
//        }
//        return a;
//    }
//}
