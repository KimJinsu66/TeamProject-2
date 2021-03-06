

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RobotTest.
 *
 * @author  (2014671038 Kim Jinsu, 2018315053 Teraoka Yuika)
 * @version (2020.04.23)
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
    public void RobotWalk_StatementCoverageTest()
    {
        Robot robot1 = new Robot();
        robot1.RobotWalk(10.0, "yellow");
        assertEquals(12.0, robot1.getSpeed(), 0.0);
        robot1.RobotWalk(10.0, "red");
        assertEquals(0.0, robot1.getSpeed(), 0.0);
    }

    @Test
    public void RobotWalk_DecisionCoverageTest()
    {
        Robot robot1 = new Robot();
        robot1.RobotWalk(10.0, "green");
        assertEquals(10.0, robot1.getSpeed(), 0.0);
        robot1.RobotWalk(10.0, "yellow");
        assertEquals(12.0, robot1.getSpeed(), 0.0);
        robot1.RobotWalk(10.0, "red");
        assertEquals(0.0, robot1.getSpeed(), 0.0);
    }
}


