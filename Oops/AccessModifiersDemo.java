// File: AccessModifiersDemo.java

// Public class accessible from any package
public class AccessModifiersDemo {

    // Public variable - accessible from anywhere
    public int publicVar = 10;

    // Private variable - accessible only within this class
    private int privateVar = 20;

    // Protected variable - accessible within the same package and subclasses
    protected int protectedVar = 30;

    // Default (no modifier) variable - accessible only within the same package
    int defaultVar = 40;

    // Public method - accessible from anywhere
    public void publicMethod() {
        System.out.println("Public Method: publicVar = " + publicVar);
    }

    // Private method - accessible only within this class
    private void privateMethod() {
        System.out.println("Private Method: privateVar = " + privateVar);
    }

    // Protected method - accessible within the same package and subclasses
    protected void protectedMethod() {
        System.out.println("Protected Method: protectedVar = " + protectedVar);
    }

    // Default (no modifier) method - accessible only within the same package
    void defaultMethod() {
        System.out.println("Default Method: defaultVar = " + defaultVar);
    }

    // Method to test all access levels within the same class
    public void testAccess() {
        // Accessing all members within the same class is allowed
        System.out.println("Testing access within the same class:");
        publicMethod();
        privateMethod();
        protectedMethod();
        defaultMethod();
    }

    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();

        // Accessing all variables and methods
        System.out.println("Accessing from main method:");

        // Public access - accessible
        System.out.println("Public Variable: " + demo.publicVar);
        demo.publicMethod();

        // Private access - accessible only within the class
        // Uncommenting the line below will cause an error
        // System.out.println("Private Variable: " + demo.privateVar);
        // demo.privateMethod();

        // Protected access - accessible within the same package
        System.out.println("Protected Variable: " + demo.protectedVar);
        demo.protectedMethod();

        // Default access - accessible within the same package
        System.out.println("Default Variable: " + demo.defaultVar);
        demo.defaultMethod();

        // Testing all access levels within the class
        demo.testAccess();
    }
}
