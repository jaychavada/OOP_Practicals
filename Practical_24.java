class circle{
    float redius;
    float pie = 3.14f;

    public float area(){
        return (pie * redius *redius);
    }
}
public class Practical_24 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");
        
        circle cr1 = new circle();
        cr1.redius = 5;
        System.out.println(cr1.area());
    }
}