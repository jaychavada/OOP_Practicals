public class Practical_19 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006\n");
        String str = args[0];
        
        char st [] = new char[20];

        str.getChars(0,6,st,0);
        System.out.println(st);
    }
}