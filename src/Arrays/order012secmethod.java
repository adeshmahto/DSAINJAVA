package Arrays;

public class order012secmethod {
    public static void main(String[] args) {
        int a[]={0,1,0,1,2};
        int c0=0,c1=0,c2=0;

        for(int i=0;i<a.length;i++){

            if(a[i]==0) c0++;
            if(a[i]==1) c1++;
            if(a[i]==2) c2++;
        }
        int k=0;
        for (int i=0;i<c0;i++){
            a[k++]=0;
        }
        int r=k;
        for (int i=0;i<c1;i++){
            a[r++]=1;
        }
        int u=r;
        for (int i=0;i<c2;i++){
            a[u++]=2;
        }
        for (int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
        }



    }
}
