package Arrays;

public class order012 {
    public static void main(String[] args) {
        int arr[]={0 ,2, 1 ,2 ,0};
        int temp[]=new int[arr.length];

        int r=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                temp[r++]=arr[i];
            }
        }
        int j=r;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                temp[j++]=arr[i];
            }
        }
        int u=j;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                temp[u++]=arr[i];
            }
        }
        for(int e:temp){
            System.out.print(e+" ");
        }

    }
}
