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
    int RobotWalk(int speed, ArrayList<String> trafficLight){       
        
        for (String trafficlight : trafficLight){ 
            System.out.println(trafficlight);
            if(trafficlight.equals("red")){
                System.out.println("s");
                speed = 0 ;
                break;
            }
            else if (trafficlight.equals("yellow"))speed = (int)(speed * 1.2);
            else if (trafficlight.equals("green"))continue;
            
    }
    return speed;
}
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        //System.out.println(speed);// just check 
        ArrayList<String> traffic_array = new ArrayList<String>();
        String trafficlight = "";
        Speed sp = new Speed();
        
        while(!trafficlight.equals("0")){
            trafficlight = sc.next();
            traffic_array.add(trafficlight);
            
        }
        
        System.out.println(sp.RobotWalk(speed,traffic_array));
    }    

    
}
