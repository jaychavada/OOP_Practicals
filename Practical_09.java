import java.util.Random;
public class Practical_09 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");
        
        Random rnd_num = new Random();
        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            int a = rnd_num.nextInt(10);
            System.out.print(a + " ");
            sum = sum + a;

            if (sum >= 20) {
                break;
            }

        }
        System.out.println(" ");
        System.out.println(sum);

    }
}
