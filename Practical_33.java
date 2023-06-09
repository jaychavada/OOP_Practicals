package OOP_PRACTICALS;

import java.util.Scanner;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Practical_33 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your age: ");
            int age = sc.nextInt();

            try {
                validateAge(age);
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Error:Age must be greater than or equal to 18");
        }
    }
}