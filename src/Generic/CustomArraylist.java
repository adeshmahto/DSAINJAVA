package Generic;

import java.util.Arrays;

public class CustomArraylist<T> {
    private int []data ;
    private  static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArraylist() {
      this.data=new int [DEFAULT_SIZE];
    }

    private  void resize(){
        int []temp=new int[data.length+2];

        // copy the current items in the new array
        for(int i=0;i<data.length; i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    private boolean isFull() {
        return size==data.length;
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    public int remove(){
        int removed =data[--size];
        return removed;
    }
    public  int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index]=value;
    }




    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArraylist c=new CustomArraylist();
        c.add(1);
        c.add(3);
        c.add(5);
        System.out.println(c);
    }
}
