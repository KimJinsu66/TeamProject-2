import java.util.Scanner;
import java.util.*;
/**
 * included RobotWalk method in 
 * 
 * @author (2014671038 Kim Jinsu, 2018315053 Teraoka Yuika) 
 * @version (2020.04.05)
 */
public class Speed
{    
    int RobotWalk(int speed, String trafficLight){       
        int result = 0; //question
        
        if (trafficLight.equals("green")){
            result = speed;
        }else if (trafficLight.equals("yellow")){
            result = (int)(speed * 1.2);
            System.out.println("sucess");
        }else if(trafficLight.equals("red")){
            result = speed * speed/1; 
        }
        return result;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        //System.out.println(speed);// just check 
        String trafficLight = sc.next();
        Speed sp = new Speed();
        System.out.println(sp.RobotWalk(speed,trafficLight));
    }    

    
}
