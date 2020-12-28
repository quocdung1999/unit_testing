package main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestPoint {
	private Point A = new Point(3.5,6);
	private Point B = new Point(10,15);
	private double THRESHOLD = Math.pow(10,-9);
	@Test
	public void testConstructor1() {	
		double x = A.getX();
		assertEquals(3.5,x,THRESHOLD);
	}
	@Test
	public void testConstructor2() {
		double y = A.getY();
		assertEquals(6,y,THRESHOLD);
	}
	
	@Test
	public void testConstructor3() {
		A = new Point('3','4');
		double x = A.getX();
		assertEquals(3, x,THRESHOLD);
	}
	
	@Test
	public void testSetter1() {
		B.setX(5);
		double x = B.getX();
		assertEquals(5, x,THRESHOLD);
	}
	
	@Test
	public void testSetter2() {
		B.setY(10.4);
		double y = B.getY();
		assertEquals(10.4, y,THRESHOLD);
	}
	
	@Test
	public void testDistance1() {
		double distance = A.distance(B);
		System.out.println(distance);
		// sqrt(493) / 2
		assertEquals(Math.sqrt(493)/2, distance,THRESHOLD);
	}
	
	@Test
	public void testDistance2()
	{
		A.setX(10);
		A.setY(15);
		double distance = A.distance(B);
		assertEquals(0, distance,THRESHOLD);
	}
}


