import java.awt.Point;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RobotTest {

	@Test
    	public void testConstructor() {
		Robot robot = new Robot();
		assertEquals(true, robot.getLocation().equals(new Point(0, 0)));
		assertEquals("N", robot.getDirection());
    	} 

	@Test
    	public void testTurnLeft() {
		Robot robot = new Robot();
		robot.turnLeft();
		robot.move();
		
		assertEquals("W", robot.getDirection());
		assertEquals(true, robot.getLocation().equals(new Point(-1, 0)));
    	} 
	
	@Test
    	public void testTurnRight() {
		Robot robot = new Robot();
		robot.turnRight();
		robot.move();
		
		assertEquals("E", robot.getDirection());
		assertEquals(true, robot.getLocation().equals(new Point(1, 0)));
    	} 
	
	@Test
    	public void testMove() {
		Robot robot = new Robot();
		
		robot.move();
		assertEquals(true, robot.getLocation().equals(new Point(0, 1)));
		
		robot.move();
		assertEquals(true, robot.getLocation().equals(new Point(0, 2)));
    	} 
	
	@Test
    	public void testGetLocation() {
		Robot robot = new Robot();
		
		robot.turnLeft();
		robot.move();
		assertEquals(true, robot.getLocation().equals(new Point(-1, 0)));
		
		robot.turnRight();
		robot.move();
		assertEquals(true, robot.getLocation().equals(new Point(-1, 1)));		
	} 
	
	@Test
    	public void testGetDirection() {
		Robot robot = new Robot();
		
		robot.turnLeft();
		assertEquals("W", robot.getDirection());
		
		robot.turnLeft();
		assertEquals("S", robot.getDirection());
    	} 
}
