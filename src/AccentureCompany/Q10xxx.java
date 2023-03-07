package AccentureCompany;

public class Q10xxx {
    public static void main(String[] args) {

        Carry(999,999);

    }
    public  static void Carry(int num1,int num2){
        int n1=num1;
        int n2=num2;
        int count=0;
        int carry=0;
        int sum=0;
        while (n1>0 && n2>0){
            int l1=n1%10;
            int l2=n2%10;
            if(carry!=0){
                l1+=carry;
            }
            if(l1+l2>9){
                carry=1;
                count++;
            }else {
                carry=0;
            }
            n1=n1/10;
            n2=n2/10;
        }
        while (n1>0){
            int l1=n1%10;
            sum=l1+carry;
            if(sum>9){
                carry=1;
                count++;
            }else carry=0;
            n1=n1/10;

        }
        while (n2>0){
            int l1=n2%10;
            sum=l1+carry;
            if(sum>9){
                carry=1;
                count++;
            }else carry=0;
            n2=n2/10;

        }
        System.out.println(count);
    }
}
