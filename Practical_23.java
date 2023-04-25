public class Practical_23 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");

        StringBuffer sb1 = new StringBuffer("God is great: ");
        System.out.println("buffer value: " + sb1);
        // appending boolean argument
        sb1.append(true);
        // print the StringBuffer after appending
        System.out.println("after append: " + sb1);

        StringBuffer sb2 = new StringBuffer("Human are strong: ");
        System.out.println("new buffer value: " + sb2);

        // appending boolean argument
        sb2.append(false);

        // print the string buffer after appending
        System.out.println("after append: " + sb2);

        // printing stringbuffer reverse
        System.out.println("string before reverse:" +sb1);
        System.out.println("string reverse is:" +sb1.reverse());
    }
}