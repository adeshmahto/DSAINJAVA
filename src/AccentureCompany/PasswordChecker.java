package AccentureCompany;

public class PasswordChecker {
    public static void main(String[] args) {
 System.out.println(passcheck("ades"));


    }
    public  static int passcheck(String str) {

        if (str.length() < 4) {
            return 0;
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return 0;
        }
        int cap = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                cap++;
            } else if (str.charAt(i) == ' ' || str.charAt(i) == '/') {
                return 0;
            } else if (str.charAt(i) >= '0' || str.charAt(i) <= '9') {
                num++;

            }
        }
            if (num > 0 && cap > 0) {
                return 1;
            } else {
                return 0;
            }

        }
    }
