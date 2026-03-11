// Box.java
class Box {
    double width;
    double height;
    double depth;

    // Constructor with three parameters
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Default constructor
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // Constructor with one parameter (cube)
    Box(double len) {
        width = height = depth = len;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }
}

// OverloadCons.java
public class OverloadCons {
    public static void main(String[] args) {
        // Create objects using different constructors
        Box mybox1 = new Box(10, 20, 15);   // three-argument constructor
        Box mybox2 = new Box();             // default constructor
        Box mycube = new Box(7);            // single-argument constructor

        // Calculate volumes
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
    }
}