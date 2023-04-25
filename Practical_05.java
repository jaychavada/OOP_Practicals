public class Practical_05 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");
        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("A ");
            }
            System.out.println();
        }
    }
}