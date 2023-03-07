package customerORder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Customer c1=new Customer(12,"adesh","dhanbad");
        Customer c2=new Customer(42,"adnan","dhanbad");
        Customer c3=new Customer(78,"ayush","Nirsha");
        Customer c4=new Customer(82,"arup","bengal");

        Order o1=new Order(980 ,"colgate",100);
        Order o2=new Order(981 ,"Dove",30);
        Order o3=new Order(942 ,"lifeboy",20);
        Order o4=new Order(961 ,"DairyMilk",50);
        ArrayList<Customer>customers=new ArrayList<>();
        ArrayList<Order>orders=new ArrayList<>();


        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);

        orders.add(o1);
        orders.add(o2);
        orders.add(o3);
        orders.add(o4);
        HashMap<Customer,Order> map=new HashMap<>();


        // Create a relationship btw customer and order
        for (int i = 0; i <customers.size() ; i++) {
            map.put(customers.get(i),orders.get(i));
        }
        Scanner sc =new Scanner(System.in);
        String name=sc.next();
        System.out.println(Itemof(name,customers,map));
    }
    public  static  String Itemof(String name,ArrayList<Customer> customers,HashMap<Customer,Order> map){
    String temp=" ";
        for (int i = 0; i < 4; i++) {
            if(customers.get(i).cname.equals(name)){
                temp= map.get(customers.get(i)).itemname;
                break;
            }
        }
        return temp;
    }

}
