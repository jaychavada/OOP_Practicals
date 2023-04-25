import java.util.Scanner;

public class Practical_07 {
    public static void main(String[] args) {

        double meter;
        double feet;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");

            System.out.println("Enter the Parameter in Meter");
            meter = sc.nextInt();

            System.out.println("");

            System.out.println("Parameter in Feet is : " + meter * 3.23);
            System.out.println("");

            System.out.println("Enter the Parameter in feet");
            feet = sc.nextInt();

            System.out.println("");

            System.out.println("Parameter in meter is : " + feet * 0.3048);
            System.out.println("");
        }
    }
}