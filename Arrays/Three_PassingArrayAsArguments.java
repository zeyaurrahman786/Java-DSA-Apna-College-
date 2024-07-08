package Arrays;

public class Three_PassingArrayAsArguments {

    public static void update(int marks[], int nonChangable) {
        nonChangable = 10;
        for (int i = 0; i < marks.length; i++) {
            // System.out.print(marks[i] + 1 + " ");
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {95,98,85};
        int nonChangable = 5;
        update(marks, nonChangable);
        System.out.println("Non-Changable Value : " + nonChangable);  // Output: Non-Changable Value : 5

        // Print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
