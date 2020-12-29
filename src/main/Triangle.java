package main;
public class Triangle {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	public Triangle(Point A, Point B, Point C) {
		// TODO Auto-generated constructor stub
		this.pointA = A;
		this.pointB = B;
		this.pointC = C;
	}

	public double perimeter()
	{
		//Chu vi
		String result = classify();
		if (result == "Đây không phải là tam giác")
		{
			return 0;
		}
		return pointA.distance(pointB) + pointA.distance(pointC) + pointB.distance(pointC);
	}
	public String classify() 
	{
		String result = new String();
		
		double AB = pointA.distance(pointB);
		double AC = pointA.distance(pointC);
		double BC = pointB.distance(pointC);
//		System.out.println("AB = "+AB);
//		System.out.println("AC = "+AC);
//		System.out.println("BC = "+BC);
//		System.out.println();
		if (AB >= AC + BC || AC >= AB +BC || BC >= AB + AC)
		{
			result = "Đây không phải là tam giác";
		}
		else if ((AB*AB == AC*AC + BC*BC)  || 
				(AC*AC == AB*AB + BC*BC) || 
				(BC*BC == AB*AB + AC*AC) )
		{
			if ((AB == AC)  || (AB == BC)  || (AC == BC) )
			{
				result = "Đây là tam giác vuông cân";
			}
			else 
				result = "Đây là tam giác vuông";
		}
		else {
			if ((AB == AC)  && (AB == BC) )
				result = "Đây là tam giác đều";
			else if ((AB == AC)  || (AB == BC)  || (AC == BC) )
				result = "Đây là tam giác cân";
			else result = "Đây là tam giác thường";				
		}
	return result;
	}
}
