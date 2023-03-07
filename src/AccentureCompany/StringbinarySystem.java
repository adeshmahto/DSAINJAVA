package AccentureCompany;

public class StringbinarySystem {
    public static void main(String[] args) {

        String str="1C0";
        int res = str.charAt (0) - '0';
        for (int i = 1; i < str.length ();)
        {
            char prev = str.charAt (i);
            i++;
            if (prev == 'A')
                res = res & (str.charAt (i) - '0');
            else if (prev == 'B')
                res = res | (str.charAt (i) - '0');
            else
                res = res ^ (str.charAt (i) - '0');
            i++;
        }
        System.out.println(res);

    }
}
