import java.util.Scanner;

public class Practical_15 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006\n");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the First String");
            String s1 = sc.nextLine();
            System.out.println("Enter the Second String");
            String s2 = sc.nextLine();

            System.out.println("Comparision of Two Strings is: " + s1.equals(s2));
            System.out.println("Concatation of Two String is : " + s1.concat(s2));

        }
    }
}