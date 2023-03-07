package Oops;

public class BoxPrice extends BoxWeight {
    double cost;

     BoxPrice(){
         super();
         cost=0;
     }
     BoxPrice(BoxPrice pre){
         super(pre);
         this.cost=pre.cost;
     }
     BoxPrice(int side,double weight,double cost){
         super(side,weight);
         this.cost=cost;
     }

}
