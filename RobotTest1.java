
/**
 * Robot Test class.
 * 
 * @author (2014671038 Kim Jinsu, 2018315053 Teraoka Yuika) 
 * @version (2020.04.10)
 */
public class RobotTest1
{   
    
    public static void main(String[] args){
        double speed = 10.0;
        String trafficLight = "yellow";
        Robot robot = new Robot();

        System.out.println(robot.RobotWalk(speed,trafficLight));

    }   
}
