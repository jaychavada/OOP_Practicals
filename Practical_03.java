public class Practical_03 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");
        // int base = 2, exponent = 12;

        // double result = Math.pow(base, exponent);

        // System.out.println("Answer of 2 Power 12 is: " + result);
        int a = 2;
        int b = 12;
        double c = 1;
        while (b > 0) {
            c = c * a;
            b--;
        }

        System.out.println(" Answer : " + c);
    }
}
