
class A {
    
    void callme() {
        System.out.println("This is inside class A");
    }
}


class B extends A {
    
    @Override
    void callme() {
        System.out.println("This is inside class B");
    }
}

class C extends A {
    
    @Override
    void callme() {
        System.out.println("This is inside class C");
    }

    
    void callme1() {
        System.out.println("Additional method in class C");
    }
}


public class Dispatch {
    
    public static void main(String[] args) {
        
        A a = new A();

        
        B b = new B();

        
        C c = new C();

        
        A r;

        
        r = a;
        
        r.callme();

        
        r = b;
        
        r.callme();

        
        r = c;
        
        r.callme();

    
        c.callme1();
    }
}

   
