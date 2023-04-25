public class Practical_12 {
    public static void main(String[] args) {

        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");

        byte arr[] = { 1, 45, 43, 89, 20, 40, 35, 30, 33, 8 };

        int sum = 0;

        for (byte h : arr) {
            sum = sum + h;
        }

        System.out.println("Average of the values is:\n" +sum / arr.length );

    }
}
