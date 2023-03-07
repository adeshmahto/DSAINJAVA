package searchingandsorting;

public class Searchin_differ_k {
    public static void main(String[] args) {
        int [] arr={20, 40, 50, 70, 70, 60,100};
        int k=20;
        int x=60;
        for (int i = 0; i <arr.length-1; i++) {
            int j=i+1;
            if(k<=(arr[j]-arr[i])){
                System.out.println(arr[j]-arr[i]);
            }

        }
    }
}
