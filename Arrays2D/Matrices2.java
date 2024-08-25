import java.util.Scanner;

public class Matrices2 {

    public static boolean search(int matrix[][], int key){
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key){
                    System.out.println("Found at position (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found in the matrix");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        // Input 
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Searching for a key
        // System.out.print("Enter the key to search : ");
        // int key = sc.nextInt();
        // boolean found = search(matrix, key);
        // if(!found) {
        //     System.out.println("Key not found in the matrix");
        // }

        search(matrix, 5); // Found at position (1,1)
        // search(matrix, 15); // Key not found in the matrix

        sc.close();
    }
}
