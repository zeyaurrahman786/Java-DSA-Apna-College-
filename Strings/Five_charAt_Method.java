// package Strings;

// public class Five_charAt_Method {
//     public static void main(String[] args) {
//         String firstName = "Zeyaur";
//         String lastName = "Rahman";
//         String fullName = firstName + " " + lastName;
//         char ch = fullName.charAt(3); // Index starts from 0
//         System.out.println("Character at index 3 : " + ch);  // Output :- Character at index 3 : a
//     }
// }








package Strings;

public class Five_charAt_Method {
    public static void printLetters(String str) {
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstName = "Zeyaur";
        String lastName = "Rahman";
        String fullName = firstName + " " + lastName;
        printLetters(fullName);  // Output :- Z e y a u r   R a h m a n
    }
}