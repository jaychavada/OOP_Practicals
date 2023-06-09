package OOP_PRACTICALS;

import java.util.Scanner;

public class Practical_32 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the FirstInteger:");
            int fi = sc.nextInt();

            System.out.println("Enter the SecondInteger:");
            int si = sc.nextInt();

            try {
                int result = fi/si;
                System.out.println("The result od the division is: "+result);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero is not allowed");
            }
        }
    }
}