import java.util.Scanner;
/**
 * Robot Test class.
 * 
 * @author (2014671038 Kim Jinsu, 2018315053 Teraoka Yuika) 
 * @version (2020.04.10)
 */
public class RobotTest
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int speed = 10;
        
        String trafficLight = sc.next();
        Robot robot = new Robot();
        System.out.println(robot.RobotWalk(speed,trafficLight));
    }   
}
