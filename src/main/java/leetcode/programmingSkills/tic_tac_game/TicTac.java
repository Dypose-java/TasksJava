package leetcode.programmingSkills.tic_tac_game;

public interface TicTac {
    public void printBoard(char[][]arr);
    public boolean isWin(char[][]arr,User user);
    public void getStartGame(User user,int rows,int colors,char[][]arr);
    public boolean isCorrectAdd(User user,char[][]arr,int rows,int colors);
}

