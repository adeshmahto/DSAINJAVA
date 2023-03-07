package AccentureCompany;

import java.util.Scanner;

public class RatHouseCount {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int unit=sc.nextInt();
        int arr[]={2, 8, 3, 5 ,7 ,4 ,1, 2};
        int n=arr.length;
        System.out.println(count(r,unit,arr,n));

    }

    public  static int count(int r,int unit,int arr[],int n){

        if(n==0){
            return -1;
        }

        int totalFood=r*unit;
        int totalfoodtillnow=0;
        int house=0;
        for(house=0;house<n;house++){
            totalfoodtillnow+=arr[house];
            if(totalfoodtillnow>=totalFood){
                break;
            }
        }
        if(totalFood>totalfoodtillnow){
            return  0;
        }
        return house+1;  // because the house index start with zero
    }
}
