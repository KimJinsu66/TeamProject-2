

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RobotTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RobotTest
{   
    @Test
    public void RobotWalk_StatementCoverageTest()
    {
        Robot robot1 = new Robot();
        robot1.RobotWalk(10.0, "yellow");
        assertEquals(12.0, robot1.getSpeed(), 0.1);
        robot1.RobotWalk(10.0, "red");
        assertEquals(0.0, robot1.getSpeed(), 0.1);
    }
    @Test
    public void RobotWalk_DecisionCoverageTest()
    {
        Robot robot2 = new Robot();
        robot2.RobotWalk(10.0, "green");
        assertEquals(0.0, robot2.getSpeed(), 0.1);
        robot2.RobotWalk(10.0, "yellow");
        assertEquals(12.0, robot2.getSpeed(), 0.1);
        robot2.RobotWalk(10.0, "red");
        assertEquals(0.0, robot2.getSpeed(), 0.1);
    }
}


