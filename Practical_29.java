class circle {
    float r;
    float h;

    public double area(){
        return (Math.PI * r * r);
    }
}
class cylinder extends circle{
    @Override
    public double area(){
        return (2 * Math.PI * r * h);
    }
}
public class Practical_29 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");

        circle c = new circle();
        c.r = 1;
        System.out.println("Area of circle "+c.area());

        cylinder cy = new cylinder();
        cy.r = 1;
        cy.h = 2;
        System.out.println("Area of cylinder "+cy.area());
    }
}