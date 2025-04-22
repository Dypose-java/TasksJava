package leetcode.programmingSkills.tic_tac_game;

public enum User {
    USER1('X'),USER2('O');
    private char valUser;

    User(char valUser) {
        this.valUser = valUser;
    }

    public char getValUser() {
        return valUser;
    }
}
