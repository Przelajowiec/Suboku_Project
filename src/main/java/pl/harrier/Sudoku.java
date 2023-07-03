package pl.harrier;
import java.util.*;
import java.io.*;

public class Sudoku {
    public static int rows = 9;
    public static int cols = 9;
    public static int[][] board = new int[rows][cols];
    public static void show() {
        System.out.println("   1 2 3   4 5 6   7 8 9");
        for (int i = 0; i < rows; i++){
            System.out.print((i+1));
            System.out.print("  ");
            for (int j = 0; j < cols; j++){
                System.out.print(board[i][j]);
                System.out.print(' ');
                if (j == 2){
                    System.out.print("| ");
                } else if (j == 5) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if (i == 2){
                System.out.println("   ---------------------");
            } else if (i == 5) {
                System.out.println("   ---------------------");
            }
        }
    }

    public static void load(String filename) {

    }

    public static void setValue(int row, int col, int var) {

    }

}
