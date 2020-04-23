import java.util.Scanner;
/**
 * RobotWalk 메소드를 포함한 Robot class
 * 
 * @author (2014671038 Kim Jinsu, 2018315053 Teraoka Yuika) 
 * @version (2020.04.23)
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
            speed = speed * 1.2;
        else speed = 0.0;
        this.speed = speed;
    } 
}
