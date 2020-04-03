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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        //System.out.println(speed);// just check 
        String trafficRoute = sc.next();
    }    

    public double RobotWalk(int speed, String trafficLight){       
        double result = 0; 
        
        if (trafficLight == "green"){
            result = speed;
        }else if (trafficLight == "yellow"){
            result = speed * 1.2;                      
        }else if(trafficLight == "red"){
            result = speed * speed/1; 
        }
        return result;
    }
}
