import java.util.Scanner;
/**
 * RobotWalk 메소드 를 포함한 Robot class
 * 
 * @author (2014671038 Kim Jinsu, 2018315053 Teraoka Yuika) 
 * @version (2020.04.09)
 */
public class Robot
{    
    private double speed;
    
    public double getSpeed(){
        return this.speed;
    }
    
    
    public void RobotWalk(double speed,String trafficLight){               
        if (trafficLight.equals("green"));
        else if (trafficLight.equals("yellow"))
            this.speed = speed * 1.2;
        else this.speed = 0.0;
        
    } 
}
