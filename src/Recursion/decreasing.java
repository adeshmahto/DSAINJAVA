package Recursion;

public class decreasing {
    public static void main(String[] args) {
        int n=10;
        printreverse(n);
    }

    private static void printreverse(int n) {
        if(n>=1){
            System.out.println(n);
            printreverse(n-1);

        }

    }
}
