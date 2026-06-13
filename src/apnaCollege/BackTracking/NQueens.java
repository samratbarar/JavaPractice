package apnaCollege.BackTracking;

import java.util.*;

/*
N X N chess board
N Queens
Print all solution where Queens are safe
 */

public class NQueens {
    static boolean isSafe(int row, int col, char[][] board) {
        // horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // vertical
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Upper left
        int r = row;
        for (int c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Upper right
        r = row;
        for (int c = col; r >=0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Lower left
        r = row;
        for (int c = col; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Lower right
        r = row;
        for (int c = col; r < board.length && c < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static void saveBoard(char[][] board, List<List<String>> allBoard) {
        String row;
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }

            newBoard.add(row);
        }

        allBoard.add(newBoard);
    }
    static void helper (char[][] board, List<List<String>> allBoard, int col) {
        if (col == board.length) {
            saveBoard(board, allBoard);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoard, col+1);
                board[row][col] = '.';
            }
        }
    }
    static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoards, 0);
        return allBoards;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N ");
        System.out.println(solveNQueens(sc.nextInt()));
    }
}
