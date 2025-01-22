package maths;

public class method { // Outermost class
    public class A { // Outer class A
        public class B { // Inner class B
            public class C { // Inner class C
                public void display() {
                    System.out.println("Inside class C: display method");
                }
            }
        }
    }

    public static void main(String[] args) {
        // To access the nested classes, you need to create instances step-by-step
        method outer = new method(); // Create an instance of the outermost class
        A a = outer.new A(); // Create an instance of class A
        A.B b = a.new B(); // Create an instance of class B
        A.B.C c = b.new C(); // Create an instance of class C

        // Call the display method of class C
        c.display();
    }
}
