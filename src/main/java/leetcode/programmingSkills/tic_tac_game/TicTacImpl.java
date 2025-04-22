package leetcode.programmingSkills.tic_tac_game;

import java.util.Scanner;

public class TicTacImpl implements TicTac {


    @Override
    public void printBoard(char[][] arr) {
        System.out.println("  0 1 2");
        for (int i = 0; i< arr.length; i++){
            System.out.print(i);
            System.out.print(" ");
            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[i][j]);
                if (j<2) System.out.print("|");
            }
            System.out.println();
            System.out.println("-------");
        }
    }

    @Override
    public boolean isWin(char[][] arr,User user) {
        for (int i = 0; i <arr.length ; i++) {

            if (arr[0][i]== user.getValUser() && arr[1][i]== user.getValUser() && arr[2][i]== user.getValUser()){
                System.out.println("User:"+user+" win!");
                return true;
            }
             if (arr[i][0]== user.getValUser() && arr[i][1]== user.getValUser() && arr[i][2]== user.getValUser()){
                System.out.println("User:"+user+" win!");
                return true;
            }
             if (arr[0][0]==user.getValUser()&&arr[1][1]==user.getValUser()&&arr[2][2]==user.getValUser()){
                System.out.println("User:"+user+" win!");
                return true;
            }
            if (arr[0][2]==user.getValUser()&&arr[1][1]==user.getValUser()&&arr[2][0]==user.getValUser()){
                System.out.println("User:"+user+" win!");
                return true;
            }

        }
        return false;

    }


    @Override
    public void getStartGame(User user, int rows, int colors, char[][] arr) {
        arr[rows][colors]=user.getValUser();
    }

    @Override
    public boolean isCorrectAdd(User user, char[][] arr, int rows, int colors) {
        char el =arr[rows][colors];
        if (user.getValUser()!=el)
            return true;
        else{
            System.out.println("Ячейка занята пользователем:"+user);
            return false;
        }

    }


}
