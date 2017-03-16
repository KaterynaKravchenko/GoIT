package All;

public class Matrix {
    public static void main(String[] args) {
        int[] row1 = {1, 2, 3};
        int[] row2 = {1, 2, 3};
        int[] row3 = {1, 2, 3};

        int[] [] matrix = {row1, row2, row3};

        int[][] mat3 = new int[4][3];

        int[] r1 = mat3[0];

        int el = mat3[1][0];

        int[][] table = {{1,2,3},
                {4,5,6},
                {7,8,9}};

        table[2][1] = 99;

        String res = MatrixUtils.toString(table);
        System.out.println(res);

        int[][] matrixNew = MatrixUtils.matrixOddEven(4,5);
        System.out.println(MatrixUtils.toString(matrixNew));
    }
}
