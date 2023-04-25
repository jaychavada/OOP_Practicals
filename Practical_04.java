import java.util.Scanner;

public class Practical_04 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Number:");
            int n = sc.nextInt();

            if (isPrime(n)) {
                System.out.println("The Number is Prime");
            } else

            {
                System.out.println("The number is not prime");
            }

        }
    }
}