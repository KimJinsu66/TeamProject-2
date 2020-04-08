import java.util.Scanner;
import java.util.*;
/**
 * RobotWalk 를 포함한 Speed class
 * 
 * @author (2014671038 Kim Jinsu, 2018315053 Teraoka Yuika) 
 * @version (2020.04.05)
 */
public class Speed2
{    
    static int RobotWalk(int speed,String trafficLight){       
        
              if (trafficLight.equals("green"))
              System.out.println(speed);
        else if (trafficLight.equals("yellow"))
              speed = (int)(speed * 1.2);
        else if (trafficLight.equals("red"))
              speed = 0;
              
        

        return speed;
    } 

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        Speed2 sp = new Speed2();
        
        while(!sc.next().equals("stop")){
            String trafficLight = sc.next();
            System.out.println(sp.RobotWalk(speed,trafficLight));
        }
        
    }    
}
