import java.util.Scanner;

public class Practical_22 {
    public static void StringReverse(String str, int ind) {
        if (ind == 0) {
            System.out.print(str.charAt(ind));
            return;
        }
        System.out.print(str.charAt(ind));
        StringReverse(str, ind - 1);

    }

    public static void main(String args[]) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006\n");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The String");
            String str = sc.nextLine();

            StringReverse(str, str.length() - 1);
        }
    }
}