import java.util.Scanner;

public class Binary_to_Decimal {
    public static int binToDec(int binary) {
        int decimal = 0;
        int pow = 0;
        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal = decimal + (lastDigit * (int) Math.pow(2, pow));
            binary /= 10;
            pow++;
        }
        
        return decimal;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary number: ");
        int binary = sc.nextInt();
        System.out.println("Binary num: "+ binary + " -> Decimal num: "+ binToDec(binary));
    }
}
