package BridgeLabz.Bootcamp;
import java.util.Scanner;
public class SumofNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int Sum = 0;

        for (int i = 1; i <= n; i++) {
            Sum += i;

            if (i < n) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i);
            }
        }

        System.out.println(" = " + Sum);
    }

}
