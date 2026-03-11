// Test.java
class Test {
    int a, b;

    // Parameterized constructor
    Test(int i, int j) {
        a = i;
        b = j;
    }

    // Method to compare two Test objects
    boolean equals(Test obj) {
        return (obj.a == a && obj.b == b);
    }
}

// PassOb.java
public class PassOb {
    public static void main(String[] args) {
        // Create objects
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);

        // Compare objects
        System.out.println("ob1 equals ob2: " + ob1.equals(ob2));
        System.out.println("ob1 equals ob3: " + ob1.equals(ob3));
    }
}