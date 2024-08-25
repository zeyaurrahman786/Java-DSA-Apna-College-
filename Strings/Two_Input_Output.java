package Strings;

import java.util.Scanner;

public class Two_Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        // name = sc.next(); // next() sirf word leta hai
        name = sc.nextLine(); // nextLine() pura sentence leta hai
        System.out.println(name); 
        
        sc.close();
    }
}
