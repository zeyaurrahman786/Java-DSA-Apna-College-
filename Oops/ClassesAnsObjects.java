public class ClassesAnsObjects{
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Created a pen object called p1
        p1.setColor("Blue");
        System.out.println("Color :- " + p1.color);
        p1.setTip(5);
        System.out.println("Tip :- " + p1.tip);
        // p1.setColor("Black");
        p1.color = "Red";
        System.out.println("Color :- " + p1.color);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}