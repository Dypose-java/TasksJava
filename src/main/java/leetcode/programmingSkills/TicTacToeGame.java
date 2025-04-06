package leetcode.programmingSkills;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    static int board[][]=new int[3][3];
   static final int idUser1=0;
    static final int idUser2=1;
    public static void main(String[] args) {
        //printBoard();
        Scanner scanner = new Scanner(System.in);
        boolean isGame=true;
        /*while (true){
            System.out.println("Пользователь:" + idUser1 + ",введите строку 0-2,столбец 0-2");
            int rowUser1=scanner.nextInt();
            int colUser1=scanner.nextInt();
            addNum(idUser1,rowUser1,colUser1);
            printBoard();
            System.out.println("Пользователь:" + idUser2 + ",введите строку 0-2,столбец 0-2");
            int rowUser2=scanner.nextInt();
            int colUser2=scanner.nextInt();
            addNum(idUser2,rowUser1,colUser1);
            printBoard();
        }*/
        addNum(idUser1,0,0);
        addNum(idUser1,0,1);
        addNum(idUser1,0,2);
        printBoard();





    }
    public static void printBoard(){
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }

    }
    static void addNum(int idUser,int rows,int colors){
        int val=0;
        if (idUser==0)
            val=1;
        else val=2;
        board[rows][colors]=val;
    }
}
