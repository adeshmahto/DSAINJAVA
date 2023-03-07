package Matrix;

import java.util.Stack;

public class LargestAreahistogram {
    public static void main(String[] args) {
        int arr[]={4,2,1,5,6,3,2,4,2};

     LargestArea(arr);



    }
    public  static  int LargestArea(int arr[]){
        int []rb=new int[arr.length]; //nse index on the right
        Stack<Integer> st=new Stack<>();
        st.push(arr.length-1);
        rb[arr.length-1]=arr.length;// default for last element should have last index value
        for (int i = arr.length-2; i >=0 ; i--) {
            while (st.size()>0 && arr[i]<=arr[st.peek()]){ // it is only pop the larger element
                st.pop();
            }
            if(st.size()==0){
                rb[i]= arr.length;
            }else {         // store the smaller element
                rb[i]=st.peek();
            }
            st.push(i);

        }



        int []lb=new int[arr.length]; // nse index on the left

        st=new Stack<>();
        st.push(0);
        lb[0]=-1;// default for last element should have last index value
        for (int i = 1; i <arr.length ; i++) {
            while (st.size()>0 && arr[i]<=arr[st.peek()]){ // it is only pop the larger element
                st.pop();
            }
            if(st.size()==0){
                lb[i]= arr.length;
            }else {         // store the smaller element
                lb[i]=st.peek();
            }
            st.push(i);

        }
        int maxArea=0;
        for (int i = 0; i < arr.length; i++) {
            int width=rb[i]-lb[i]-1;
            int area=arr[i]*width;
            if(area>maxArea){
                maxArea=area;
            }


        }
        return maxArea;



    }


}
