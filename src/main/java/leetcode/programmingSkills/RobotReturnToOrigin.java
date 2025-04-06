package leetcode.programmingSkills;

import java.util.HashMap;
import java.util.Map;

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        //boolean b = judgeCircle("UD");
        boolean b1 = judgeCircleCorrectMy("UD");


    }

    public static boolean judgeCircleCorrectMy(String moves) {
        int sumUp = 0;
        int sumLeft=0;
        for (Character el : moves.toCharArray()) {
            switch (el){
                case 'U':
                    sumUp++;
                    break;
                case 'D':
                    sumUp--;
                    break;
                case 'L':
                    sumLeft++;
                    break;
                case 'R':
                    sumLeft--;
                    break;
            }
        }
        return (sumUp==0&&sumLeft==0);
    }

        public static boolean judgeCircleMy2 (String moves){
            Map<Character, Integer> countMap = new HashMap<>();
            countMap.put('U', 0);
            countMap.put('D', 0);
            countMap.put('L', 0);
            countMap.put('R', 0);
            for (char c : moves.toCharArray()) {
                countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            }
            if (countMap.get('U').equals(countMap.get('D')) && countMap.get('L').equals(countMap.get('R')))
                return true;
            else return false;

        }

    }


