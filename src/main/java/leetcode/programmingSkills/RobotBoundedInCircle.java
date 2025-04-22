package leetcode.programmingSkills;

import java.util.HashMap;

public class RobotBoundedInCircle {
    public static void main(String[] args) {
        String str1 = "GGLLGG";
        String str2 = "GG";
        String str3 = "GL";
        boolean robotBounded = new RobotBoundedInCircle().isRobotBounded(str1);
    }

    public boolean isRobotBounded(String instructions) {

       HashMap<String,Integer>compass = new HashMap<>();
       compass.put("Север",1);
       compass.put("Юг",-1);
       compass.put("Запад",-1);
       compass.put("Восток",1);
       String[] left ={"Запад","Юг","Восток","Север"};
       String[] right ={"Восток","Юг","Запад","Север"};

        int g = 0;
        int lcount=0;
        int rcount=0;
       HashMap<Integer,Integer>res=new HashMap<>();
        String[] split = instructions.split("");
        int count=0;
        while (count<=5){
            count++;
            for (int i = 0; i <split.length; i++) {
                if (split[i].equals("G")){
                    g++;
                    res.put(0,g);
                } else if (split[i].equals("L")) {
                    res.put(0,compass.get(left[0]));
                    lcount++;

                    if (lcount==3)
                        lcount=0;

                } else if (split[i].equals("R")) {
                    res.put(0,compass.get(right[0]));
                    rcount++;

                    if (rcount==3)
                        rcount=0;
                }

                System.out.println(res);
            }
        }

      return true;
    }
}
class sdasdasdas{
    public static void main(String[] args) {
        int counter=0;
        while (counter<5){
            counter++;
            System.out.println(counter);
        }
    }
}
