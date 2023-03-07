package AccentureCompany;

public class Q9xx {
    public static void main(String[] args) {

        String name="move-hyphen-to-front";
        int count=0;
        String str="";
        for (int i = 0; i <name.length(); i++) {
            if(name.charAt(i)=='-'){
                count++;


            }else {
                str+=name.charAt(i);
            }

        }
      String hypen=" ";
        for (int i = 0; i <count ; i++) {
            hypen+="-";
        }
        System.out.println(hypen+str);


    }
}
