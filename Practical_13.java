import java.util.Scanner;

public class Practical_13 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");

        int a[] = { 11, 12, 33, 74, 85, 96 };
        
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the element you want to search");
        int element = sc.nextInt();

        // for(int h=0;h<a.length;h++){
        //     if (a[h] == element) {
        //         System.out.println("Element is Found");
        //     }
        // }

        // for each
        for (int h : a) {
            if (h == element) {
                System.out.println("Element is Found");
            }
        }
    }
}
}