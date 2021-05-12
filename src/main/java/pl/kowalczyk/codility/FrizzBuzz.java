package pl.kowalczyk.codility;

public class FrizzBuzz {
    public static void main(String[] args) {
        frizz(100);
    }

    private static void frizz(int number) {
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i+": FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i+": Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i+": Buzz");
            }
        }
    }
}
