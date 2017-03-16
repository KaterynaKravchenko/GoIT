package All;

/**
 * Created by Sweet_berry on 05.03.2016.
 */
public class MatrixUtils {
    public static String toString(int[][] mat) {
        if (mat == null) {
            return "Wrong argument, mat is null";
        }
        if (mat.length == 0) {
            return "Empty matrix"; // длина length возвращает количество массивов в мтарице
        }

        String matRes = "";

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int col = mat[i][j];
                matRes += col + " ";
            }
            matRes += "\n";
        }
        return matRes;
    }

    public static int[][] matrixOddEven(int row, int column) {
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                int element = matrix[i][j];
                if (i % 2 == 0) {                // int element = (int) (Math.random() * 100);
                    if (element % 2 != 0) {      // if ( i % 2 == 0) {
                        matrix[i][j]++;          // matrix[i][j] = element % 2 == 0 ? element : element++;
                    }                            // } else {
                } else {                         // matrix[i][j] = element % 2 == 0 ? element ++ : element; }
                    if (element % 2 == 0) {
                        matrix[i][j]++;
                    }
                }
            }
        }

        return matrix;
    }


}
