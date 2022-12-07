public class CheckSudokuSolution {
    public static void main(String[] args) {

        int[][] sudoku = {

                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        System.out.println(checkSudoku(sudoku));
    }

    public static boolean checkSudoku(int[][] sudoku) {
        int sum;

        for (int loop = 2; loop < sudoku.length; loop += 3) {
            sum = 0;

            for (int row = (loop - 2); row < loop + 1; row++) {
                for (int col = (loop - 2); col < loop + 1; col++) {
                    sum += sudoku[row][col];
                }
            }
            if (sum != 45) {
                return false;
            }
        }
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 8; column++) {
                if (sudoku[row][column] == sudoku[row][column + 1])
                    return false;

            }
        }
        for (int column = 0; column < 9; column++) {
            for (int row = 0; row < 8; row++) {
                if (sudoku[row][column] == sudoku[row + 1][column])
                    return false;
            }
        }
        return true;
    }
}


