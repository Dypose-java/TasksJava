package leetcode.programmingSkills.RobotBoundedInCircle;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;


public class Robot {
   private String instructions;
    private int point1=0,point2=0;
    private HashMap<String,Integer> compass= new HashMap<>();


    public Robot(String instructions) {
        this.instructions = instructions;
        compass.put("North",1);
        compass.put("South",-1);
        compass.put("West",-1);
        compass.put("East",1);

    }
    public void Turn(){

    }
    public void  straight(){
        this.point2+=1;
    }


    @Override
    public String toString() {
        return "("+point1+","+point2+")";
    }
}

