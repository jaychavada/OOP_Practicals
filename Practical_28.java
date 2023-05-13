class sphere {
    double radious;
    double x;
    double y;
    double z;

    public sphere() {
        radious = 1.0;
    }
    public sphere(double radious) {
        this.radious = radious;
    }
    public sphere(double radious, double x, double y, double z) {
        this.radious = radious;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void display() {
        System.out.println("Radious is: "+radious);
        System.out.println("Co-x: "+x);
        System.out.println("Co-y: "+y);
        System.out.println("Co-z: "+z);
    }
    
}

public class Practical_28 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");

        sphere s1 = new sphere();
        sphere s2 = new sphere(10);
        sphere s3 = new sphere(12, 10, 8, 5);

        System.out.println("Result of 1st constructor");
        s1.display();
        System.out.println("Result of 2nd constructor");
        s2.display();
        System.out.println("Result of 3rd constructor");
        s3.display();
    }
}
