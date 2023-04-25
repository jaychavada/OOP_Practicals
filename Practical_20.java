public class Practical_20 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006\n");

        String str = args[0];

        char h = str.charAt(0);
        
        if(h >= 'a' && h <= 'z')
        {
            System.out.println("Small-character so : ERROR");
        }
        else
        {
            System.out.println("Capital-character so : NO ERROR");
        }
    }
}
