package Striversheet.Day1;



import java.util.Arrays;


public class Q3Mergetwoarray {
    public static void main(String[] args) {
      int [] arr1 = {10};
        int []arr2 = {2,3};

        int i=arr1.length-1;
        int j=0;
        while (i>=0 && j<arr2.length){
            if(arr1[i]>arr2[j]){


                arr1[i]=arr1[i]^arr2[j];
                arr1[j]=arr1[i]^arr2[j];
                arr1[i]=arr1[i]^arr2[j];

            }
            i--;
            j++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int e:arr2){
            System.out.println(e);
        }





















//
//        int temp[]=new int[ar1.length+ar2.length];
//
//        int k=0;
//        int j=0;
//        int i=0;
//       while (i<ar1.length && j<ar2.length){
//
//           if(ar1[i]<ar2[j]){
//               temp[k++]=ar1[i++];
//           }else {
//               temp[k++]=ar2[j++];
//           }
//       }
//
//       while (i!=ar1.length){
//
//           temp[k++]=ar1[i++];
//
//       }
//       while (j!=ar2.length){
//           temp[k++]=ar2[j];
//       }
//
//       int r=0;
//        for (int l = 0; l < ar1.length; l++) {
//            ar1[l]=temp[r++];
//        }
//
//        for (int l = 0; l <ar2.length ; l++) {
//            ar2[l]=temp[r++];
//
//        }





    }
}
