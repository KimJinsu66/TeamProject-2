import java.util.Scanner;
/**
 * RobotWalk 를 포함한 Robot class
 * 
 * @author (2014671038 Kim Jinsu, 2018315053 Teraoka Yuika) 
 * @version (2020.04.09)
 */
public class Robot
{    
    static int RobotWalk(int speed,String trafficLight){               
        if (trafficLight.equals("green"))
              speed = speed;
        else if (trafficLight.equals("yellow"))
              speed = (int)(speed * 1.2);
        else if (trafficLight.equals("red"))
              speed = 0;
        return speed;
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        Robot sp = new Robot();
        String trafficLight = " " ;
        while(!trafficLight.equals("stop")){
            trafficLight = sc.next();
            speed = sp.RobotWalk(speed,trafficLight);
            System.out.println(speed);
        }
    }    
}
