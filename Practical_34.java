package OOP_PRACTICALS;

import java.util.Scanner;

public class Practical_34 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            String input = sc.nextLine();

            try {
                int number = Integer.parseInt(input);
                System.out.println("The number entered is: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format!");
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}