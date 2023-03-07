package Stringexamples;

public class valid_two_string {
    public static void main(String[] args) {
        CheckValid("xy","12","xy12");

    }
    public static void CheckValid(String s1,String s2,String result){

        int l1=s1.length();
        int l2=s2.length();
        int lr=result.length();
        if((l1+l2)!=lr) System.out.println("not valid ");
        else {
            int i=0,k=0,j=0;

            while(k<lr){
                if(i<l1 && s1.charAt(i)==result.charAt(k))i++;      // i pointer for the first string
                else if(j<l2 && s2.charAt(j)==result.charAt(k))j++;    // j pointer for the second string
                else {

                    break;
                }
                k++;
            }
            if(i<l1 || j<l2) System.out.println("not valid");
            else System.out.println("valid");

        }
    }
}
