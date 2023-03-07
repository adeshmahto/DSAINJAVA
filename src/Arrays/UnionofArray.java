package Arrays;

import java.util.HashSet;

public class UnionofArray {
    public static void main(String[] args) {

        int a[]={85, 25 ,1 ,32, 54, 6};
        int b[]={85 ,2 };

        int count=0;
        for(int i=0;i<b.length;i++){
            for(int j=0;j<a.length;j++){

                if(b[i]==a[j]){
                    count++;
                    break;
                }
            }
        }
         int x=b.length-count;
        System.out.println(a.length+x);

    }
}
