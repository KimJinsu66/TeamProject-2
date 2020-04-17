

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
    /**
     * Default constructor for test class RobotTest
     */
    public RobotTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void RobotWalk_Test()
    {
        Robot robot1 = new Robot();
        assertEquals(10.0, robot1.getSpeed(), 0.1);
        robot1.RobotWalk(10.0, "yellow");
        robot1.RobotWalk(10.0, "red");
    }

    @Test
    public void RobotWalk_Test2()
    {
        Robot robot1 = new Robot();
        assertEquals(0.0, robot1.getSpeed(), 0.1);
        robot1.RobotWalk(10.0, "yellow");
        robot1.RobotWalk(10.0, "red");
    }
}


