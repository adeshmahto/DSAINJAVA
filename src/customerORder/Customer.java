package customerORder;

public class Customer {
    int cid;
    String cname;
    String Address;
    public Customer(int cid,String cname,String Address){
        this.cid=cid;
        this.cname=cname;
        this.Address=Address;

    }
    public  void CustomerDetail(){
        System.out.println("Id of the customer is "+cid+" and Name of the Customer "+cname+" Address of the customer "+Address);
    }

}
class Order{
    int oid;
    String itemname;
    int oprice;

    public Order(int oid,String itemname,int oprice){
        this.oid=oid;
        this.itemname=itemname;
        this.oprice=oprice;
    }
    public void OrderDetail(){
        System.out.println("order id "+oid+" name of the item "+itemname+" price of the item "+oprice+"Rs");
    }
}
