import java.util.Scanner;

public class Decimal_to_Binary {
    public static int decToBin(int decimal) {
        int binary = 0;
        int pow = 0;
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = binary + remainder * (int) Math.pow(10, pow);
            decimal /= 2;
            pow++;
        }

        return binary;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number: ");
        int decimal = sc.nextInt();

        System.out.println("Decimal number: "+ decimal + " -> Binary Number: "+ decToBin(decimal));

    }
}
