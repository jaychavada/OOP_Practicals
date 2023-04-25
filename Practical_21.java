public class Practical_21 {
    public static double average(String arr[]){
        double avg = 0;
        double sum = 0;
        double d[] = new double[arr.length];

        for(int i=0; i<arr.length;i++){
            d[i] = Double.parseDouble(arr[i]);
            sum = sum + d[i];
        }
        avg = (sum / d.length);
        return avg;
    }
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");
        String avg[] = {"10.2", "10.2", "10.5","15.5"};
        System.out.println("Average is :" +average(avg));
    }
}
