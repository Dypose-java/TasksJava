package leetcode.programmingSkills.tic_tac_game;

import java.util.Scanner;

public class Application {
    private TicTac ticTac;

    private char[][]ticTacArr = new char[3][3];
   private final User user1 = User.USER1;
    private final User user2 = User.USER2;

    public Application(TicTac ticTac) {
        this.ticTac=ticTac;
    }

    public Application run(){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < ticTacArr.length; i++) {
            for (int j = 0; j <ticTacArr.length ; j++) {
                ticTacArr[i][j]='*';
            }
        }
        System.out.println("Main Board");
        ticTac.printBoard(ticTacArr);

        while (true){
            System.out.println("User:"+user1+",введи строку и столбец");
            int row=scanner.nextInt(), col = scanner.nextInt();
            if (ticTac.isCorrectAdd(user1,ticTacArr,row,col)){
                ticTac.getStartGame(user1,row,col,ticTacArr);
                ticTac.printBoard(ticTacArr);

            }
            System.out.println("User:"+user2+",введи строку и столбец");
            int row1=scanner.nextInt(), col1 = scanner.nextInt();
            if (ticTac.isCorrectAdd(user2,ticTacArr,row1,col1)){
                ticTac.getStartGame(user2,row1,col1,ticTacArr);
                ticTac.printBoard(ticTacArr);
            }
        }
    }
    public void run1(){
        User currentUser = user1;
        int totalMoves = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ticTacArr.length; i++) {
            for (int j = 0; j < ticTacArr.length; j++) {
                ticTacArr[i][j] = '*';
            }
        }
        System.out.println("Main Board");
        ticTac.printBoard(ticTacArr);
        while (true) {
            System.out.println("User: " + currentUser + ", введи строку и столбец:");
            int row = scanner.nextInt(), col = scanner.nextInt();

            if (!ticTac.isCorrectAdd(currentUser, ticTacArr, row, col)) {
                System.out.println("Попробуй снова!");
                continue; // Повторить ввод того же игрока
            }
            ticTac.getStartGame(currentUser, row, col, ticTacArr);
            ticTac.printBoard(ticTacArr);
            totalMoves++;

            if (ticTac.isWin(ticTacArr, currentUser)) {
                System.out.println("Победитель: " + currentUser);
                break;
            }
            if (totalMoves == 9) {
                System.out.println("Ничья!");
                break;
            }
            currentUser = (currentUser == user1) ? user2 : user1;
    }

    }
}
