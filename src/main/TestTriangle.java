package main;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestTriangle {
	private Triangle t;
	private double THRESHOLD = Math.pow(10,-9);
	
	@Test
	public void testClassify1()
	{
		t = new Triangle(new Point(1,1),new Point(1,1),new Point(1,1));
		String result = t.classify();
		assertEquals("Đây không phải là tam giác",result);
	}
	
	@Test
	public void testClassify2()
	{
		t = new Triangle(new Point(-1,-2),new Point(3,5),new Point(11,19));
		String result = t.classify();
		assertEquals("Đây không phải là tam giác", result);
	}
	
	@Test
	public void testClassify3()
	{
		t = new Triangle(new Point(0,0),new Point(0,4),new Point(6,0));
		String result = t.classify();
		assertEquals("Đây là tam giác vuông", result);
	}
	
	@Test
	public void testClassify4() 
	{
		t = new Triangle(new Point(1,2),new Point(4,3),new Point(0,5));
		String result = t.classify();
		assertEquals("Đây là tam giác vuông cân", result);
	}
	
	@Test
	public void testClassify5()
	{
		t = new Triangle(new Point(4,4),new Point(1,2),new Point(7,2));
		String result = t.classify();
		assertEquals("Đây là tam giác cân", result);
	}
	
	@Test
	public void testClassify6()
	{
		t = new Triangle(new Point(0,0),new Point(4,0),new Point(2,Math.sqrt(3)*2));
		String result = t.classify();
		assertEquals("Đây là tam giác đều", result);
	}
	
	@Test
	public void testClassify7()
	{
		t = new Triangle(new Point(1,2),new Point(2,3),new Point(5,7));
		String result = t.classify();
		assertEquals("Đây là tam giác thường", result);
	}
	
	@Test
	public void testPerimeter1() 
	{
		t = new Triangle(new Point(1,2),new Point(2,4),new Point(3,6));
		double result = t.perimeter();
		assertEquals(0, result,THRESHOLD);
	}
	
	@Test
	public void testPerimeter2()
	{
		t = new Triangle(new Point(0,0),new Point(3,0),new Point(0,4));
		double result = t.perimeter();
		System.out.println(result);
		assertEquals(12, result,THRESHOLD);
	}
}
