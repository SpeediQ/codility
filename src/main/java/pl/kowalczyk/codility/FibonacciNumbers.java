package pl.kowalczyk.codility;

public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(getSolution(7));
        System.out.println(fibRecursive(7));
    }

    private static long getSolution(long size) {
        long x1 = 0;
        long x2 = 1;


        for (int i = 2; i <= size; i++) {
            long temp = x1 + x2;
            x1 = x2;
            x2 = temp;
        }
        return x2;
    }

    public static long fibRecursive(int n) {
        if(n <= 1) return n;
        return fibRecursive(n-2)+fibRecursive(n-1);
    }



}
