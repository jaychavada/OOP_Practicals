public class Practical_11 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006\n");
        float a[] = { 0, 12, 45, 76, 86, 96 };
        int lengthOfarray = 0;

        for (float h : a) {
            lengthOfarray++;
            System.out.println(h +"");
        }

        System.out.println("Length of the Array is : " + lengthOfarray);
    }
}