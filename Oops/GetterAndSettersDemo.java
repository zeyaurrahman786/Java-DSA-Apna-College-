// File: GetterAndSettersDemo.java

public class GetterAndSettersDemo {

    // Public variable - accessible from anywhere
    public int publicVar = 10;

    // Private variable - accessible only within this class
    private int privateVar = 20;

    // Protected variable - accessible within the same package and subclasses
    protected int protectedVar = 30;

    // Default (no modifier) variable - accessible only within the same package
    int defaultVar = 40;

    // Public getter for privateVar
    public int getPrivateVar() {
        return privateVar;
    }

    // Public setter for privateVar
    public void setPrivateVar(int privateVar) {
        this.privateVar = privateVar;
    }

    // Public getter for protectedVar
    public int getProtectedVar() {
        return protectedVar;
    }

    // Public setter for protectedVar
    public void setProtectedVar(int protectedVar) {
        this.protectedVar = protectedVar;
    }

    // Public getter for defaultVar
    public int getDefaultVar() {
        return defaultVar;
    }

    // Public setter for defaultVar
    public void setDefaultVar(int defaultVar) {
        this.defaultVar = defaultVar;
    }

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
        System.out.println("Testing access within the same class:");
        publicMethod();
        privateMethod();
        protectedMethod();
        defaultMethod();
    }

    public static void main(String[] args) {
        GetterAndSettersDemo demo = new GetterAndSettersDemo();
        
        System.out.println("Accessing from main method:");

        // Public access
        System.out.println("Public Variable: " + demo.publicVar);
        demo.publicMethod();
        
        // Private access via getter and setter
        System.out.println("Private Variable (getter): " + demo.getPrivateVar());
        demo.setPrivateVar(25);
        System.out.println("Private Variable (after setter): " + demo.getPrivateVar());

        // Protected access via getter and setter
        System.out.println("Protected Variable (getter): " + demo.getProtectedVar());
        demo.setProtectedVar(35);
        System.out.println("Protected Variable (after setter): " + demo.getProtectedVar());

        // Default access via getter and setter
        System.out.println("Default Variable (getter): " + demo.getDefaultVar());
        demo.setDefaultVar(45);
        System.out.println("Default Variable (after setter): " + demo.getDefaultVar());

        // Testing all access levels within the class
        demo.testAccess();
    }
}
