package searchingandsorting;

public class Findrepeatno {
    public static void main(String[] args) {
            int arr[]=new int[]{13, 33, 43 ,16, 25, 1,9 ,23 ,31 ,29 ,35 ,10, 2, 32, 11, 47, 15, 34, 46, 30, 26, 41 ,18 ,5 ,17, 37, 39, 6, 4, 20, 27, 9, 3, 8, 40, 24, 44 ,14 ,36, 7 ,38, 12, 1, 42, 12, 28, 22, 45};

        int r=0;
//
//        for (int i = 0; i <arr.length ; i++) {            // bigOofn
//                    int j=i+1;
//                        if(j<arr.length && arr[i]==arr[j] ){
//                            r=arr[i];
//                        }
//
//
//
//        }
//        System.out.println(r);

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                     if(arr[i]==arr[j]){
                         r=arr[i];
                     }
            }
            
        }
        System.out.println(r);
    }
}
