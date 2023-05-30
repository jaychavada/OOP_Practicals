class Bond {
    public void display() {
        System.out.println("Bond");
    }
}

class ConvertibleBond extends Bond {
    @Override
    public void display() {
        System.out.println("ConvertibleBond");
    }
}
public class Practical_30 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");
        Bond[] bonds = new Bond[6];

        // Initialize the array with a mix of Bond and ConvertibleBond objects
        bonds[0] = new Bond();
        bonds[1] = new ConvertibleBond();
        bonds[2] = new Bond();
        bonds[3] = new ConvertibleBond();
        bonds[4] = new ConvertibleBond();
        bonds[5] = new Bond();

        // Invoke the display() method of each object
        for (Bond bond : bonds) {
            bond.display();
        }
    }
}
