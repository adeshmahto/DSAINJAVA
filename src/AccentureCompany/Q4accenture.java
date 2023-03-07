package AccentureCompany;

public class Q4accenture {
    public static void main(String[] args) {

        System.out.println(fun(new int[]{12 ,3 ,14, 56, 77, 13},13,2));
    }
    public  static  int  fun(int arr[],int num,int diff){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(Math.abs(arr[i]-num)<=diff){
                count++;
            }
        }

        return count>0?count:-1;
    }
}
