package AccentureCompany;

import java.util.ArrayList;

public class Q8xx {
    public static void main(String[] args) {

        fun(21,5678);
    }
    public static void fun(int n,int num){
        String res = "";
        int quotient = num / n;
        ArrayList < Integer > rem = new ArrayList < Integer > ();
        rem.add (num % n);
        while (quotient != 0)
        {
            rem.add (quotient % n);
            quotient = quotient / n;
        }
        for (int i = 0; i < rem.size (); i++)
        {
            if (rem.get (i) > 9)
            {
                res = (char) (rem.get (i) - 9 + 64) + res;
            }
            else
                res = rem.get (i) + res;
        }
        System.out.println(res);
    }
}
