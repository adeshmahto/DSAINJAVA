package AlgorithmsDAA;

import java.util.Scanner;

public class GreedyAlgo {
    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float p[]=new float[n]; // profit
        float w[]=new float[n];  // weight
        int capacity=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.println("Enter the profit and weight for "+(i+1));
            p[i]=sc.nextInt();
            w[i]=sc.nextInt();
        }
        float ratio[]=new float[n];
        for (int i = 0; i <n ; i++) {
            ratio[i]=p[i]/w[i];
        }
//        Arrays.stream(ratio).forEach(e->{System.out.println(e);});
        //sort the the profit and weight as per the ratio in descending order
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                 if(ratio[i]<ratio[j]){


                     //swapping the ratio;
                    float temp1=ratio[i];
                    ratio[i]=ratio[j];
                    ratio[j]=temp1;

                     //swapping the profit
                    float temp2=p[i];
                    p[i]=p[j];
                    p[j]=temp2;

                     //swapping the weight
                  float temp3=w[i];
                  w[i]=w[j];
                  w[j]=temp3;
                 }

            }

        }
      float m=capacity;
      float tp=0;
        int i;
        for ( i=0; i <n ; i++) {
            if(m>0 && w[i]<=m){
                m=m-w[i];
                tp=tp+p[i];
            }else {
                break;
            }

        }
        if(m>0){
            tp=tp+(p[i]*m)/w[i];
        }
        System.out.println(tp);


    }

    }

