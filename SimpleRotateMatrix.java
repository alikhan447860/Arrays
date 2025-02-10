public class SimpleRotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int n = matrix.length;
        int[][] rotated = new int[n][n]; // Naya matrix
        // Har element ko naye position pe daalo
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                rotated[j][n-1-i] = matrix[i][j]; // Formula apply
            }
        }
        // Print rotated matrix
        for(int[] row : rotated){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}