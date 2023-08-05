import java.util.Scanner;
public class GCD
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        scanner.close();

        int gcd = calculateGCD(a, b);
        System.out.println(gcd);
    }

    public static int calculateGCD(int a, int b)
    {
        if (b == 0)
        {
            return a;
        } else {
            return calculateGCD(b, a % b);
        }
    }
}
