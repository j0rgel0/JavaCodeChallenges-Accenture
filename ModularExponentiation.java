import java.util.Scanner;

public class ModularExponentiation {
    public static void main(String[] args) {
        /*
        Given three numbers b, e and m. Fill in a function that takes these three positive integer values
        and outputs b^e mod m.

        Input specification:
        Input1: poisitive integer, b
        Input2: poisitive integer, e
        Input3: poisitive integer, m

        Output Specification:
        Return an integer on calculating b^e mod m.
        Example 1:
        Input 1: 2
        Input 2: 10
        Input 3: 1025
        Output: 1024
        Explanation:
        2^10 mod 1025 = 1024

        Example 2:
        Input 1: 4
        Input 2: 10
        Input 3: 1025
        Output: 1
        Explanation:
        4^10 mod 1025 = 1
         */

        Scanner sc = new Scanner(System.in);
        int b,e,m;
        System.out.println("Give b value");
        b = sc.nextInt();
        System.out.println("Give e value");
        e = sc.nextInt();
        System.out.println("Give m value");
        m = sc.nextInt();
        System.out.println((int)Math.pow(b,e)%m);
    }
}
