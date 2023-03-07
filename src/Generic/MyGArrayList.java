package Generic;

import java.util.Arrays;

public class MyGArrayList<T> {
    private Object[]data ;
    private  static int DEFAULT_SIZE=10;
    private int size=0;

    public MyGArrayList() {
        this.data=new Object [DEFAULT_SIZE];
    }

    private  void resize(){
        Object []temp=new Object[data.length+2];

        // copy the current items in the new array
        for(int i=0;i<data.length; i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    private boolean isFull() {
        return size==data.length;
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    public T remove(){
        T removed =(T) data[--size];
        return removed;
    }
    public  T get(int index){
        return (T) data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,T value){
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
        MyGArrayList<String> m=new MyGArrayList<>();
        m.add("adesh");
        m.add("adity");
        m.add("ankit");
        System.out.println(m.get(1));
    }

}
