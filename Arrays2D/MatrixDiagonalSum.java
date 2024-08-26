// Brute force

class MatrixDiagonalSum {

    public static int diagonalSum(int matrix[][]) { // O(n^2)
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
                else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum; 
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(diagonalSum(matrix));
    }
}











// Optimal Code

// class MatrixDiagonalSum { // O(n)

//     public static int diagonalSum(int matrix[][]) { // O(n)
//         int sum = 0;

//         for (int i = 0; i < matrix.length; i++) {
//             // Primary diagonal sum
//             sum += matrix[i][i];
//             // Secondary diagonal sum
//             if (i != matrix.length - 1 - i) {
//                 sum += matrix[i][matrix.length - i - 1];
//             }
//         }
//         return sum; 
//     }

//     public static void main(String[] args) {
//         int matrix[][] = { { 1, 2, 3, 4 },
//                 { 5, 6, 7, 8 },
//                 { 9, 10, 11, 12 },
//                 { 13, 14, 15, 16 } };
//         System.out.println(diagonalSum(matrix));
//     }
// }