import java.util.Scanner;

public class primenum {
    public static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        } else {
            for (int i=2; i<= (int) Math.sqrt(num); i++){
                if (num % i == 0) {
                    return false;
                }
            } 
        }
        return true;
    }

    public static void rangeOfNum(int n) {
        if (n <= 1) {
            System.out.println("Please give range greater than 1.");
        } else {
            for (int i=2; i<=n; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range of Number upto whrere you want prime numbers(n > 1): ");
        int n = sc.nextInt();
        rangeOfNum(n);


    }
}
