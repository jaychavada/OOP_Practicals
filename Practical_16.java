import java.util.Scanner;

public class Practical_16 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006\n");
        try (Scanner sc = new Scanner(System.in)) {

            String fString = "java123is234fun";
            System.out.println("Real String : " + fString + " ");
            System.out.println("Replacing all numbers with space");
            System.out.println("String After Replace : " + fString.replaceAll("[0-9]", " "));
            System.out.println("");
            String a[] = new String[20];
            a = fString.split("[0-9]");

            System.out.println("String After Split");
            for (String i : a) {
                System.out.println(i);

            }
        }
    }
}