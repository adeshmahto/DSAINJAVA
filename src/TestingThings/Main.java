package TestingThings;

import javax.script.SimpleBindings;

public class Main {
    public static void main(String[] args) {
        String S="dhanbad";
        String T="ddabnahd";
        StringBuilder mystring=new StringBuilder(T);
        mystring=mystring.deleteCharAt(0);        // deleting the 1st char using stringbuilder
        String s1= String.valueOf(mystring);


        char [] s3=s1.toCharArray();
        char t;
         // reverse the T string
        int count=0;
        for (int i = 0,j=mystring.length()-1; i <j; i++,j--) {
           t=s3[i];
           s3[i]=s3[j];
           s3[j]=t;
           count++;

        }
        String s=" ";

        for (int i = 0; i < s3.length; i++) {
           s+=s3[i];
        }
       int nofoperation=1+count;   // one for deletion
      if (S.compareTo(s)>0){
          System.out.println(count);
      }else if(S.isEmpty() && T.isEmpty()){
          System.out.println(nofoperation);

      }else {
          System.out.println(-1);
      }


    }
}
