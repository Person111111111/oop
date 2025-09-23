import java.util.Scanner;

public class Transpose {
    /**
     * Define a method to swap elements easily
     */
    public static void Swap(int[][] matrix, int x1, int y1, int x2, int y2) {
        //Create an intermediate variable to pass the value
        int temp = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = temp;
    }

    /**
     * Define the method to transpose the array
     */
    public static void transpose(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Swap(matrix, i, j, j, i);
            }
        }
    }

    /**
     * Main function
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        //Read the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        transpose(matrix, n);

        //Print the transposed array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}