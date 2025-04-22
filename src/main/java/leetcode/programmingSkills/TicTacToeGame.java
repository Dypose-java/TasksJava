package leetcode.programmingSkills;

import java.util.Arrays;

public class TicTacToeGame {
    public static void main(String[] args) {
        int[][] moves = {{0, 0}, {1, 1}, {0, 1}, {1, 0}, {0, 2}};
        String tictactoe = new TicTacToeGame().tictactoe(moves);

    }
    public String tictactoe(int[][] moves) {

        char[][] board = new char[3][3];
        char[] users = {'X', 'O'};
        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];
            board[row][col] = users[i % 2]; // A: X, B: O
        }
        char winner = checkWinner(board);
        if (winner == 'X') return "A";
        if (winner == 'O') return "B";
        return moves.length == 9 ? "Draw" : "Pending";
    }

    private char checkWinner(char[][] board) {
        for (int i = 0; i < 3; i++) {
            // строки
            if (board[i][0] != 0 && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0];
            }
            // столбцы
            if (board[0][i] != 0 && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i];
            }
        }

        // диагонали
        if (board[0][0] != 0 && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }
        if (board[0][2] != 0 && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2];
        }

        return ' '; // никто не победил
    }


    }


