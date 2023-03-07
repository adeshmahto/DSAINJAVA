package Striversheet.Day3;

public class ReversePair {
    public static void main(String[] args) {
        int nums[]={2,4,3,5,1};

        int pair=0;
        for (int i = 0; i <nums.length; i++) {
            for (int j = 0; j <nums.length; j++) {
                if( i<j && nums[i]>2*nums[j]) pair++;

            }

        }
        System.out.println(pair);
    }
}
