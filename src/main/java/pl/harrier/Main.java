package pl.harrier;

public class Main{
    public static void main(String[] args) {
        Sudoku.load("testfile.txt");
        Sudoku.board[3][3] = 7;
        Sudoku.board[5][4] = 1;
        Sudoku.board[0][8] = 9;
        Sudoku.show();
    }
}