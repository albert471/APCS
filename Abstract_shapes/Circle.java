
/**
 * intro to abstract classes using shapes
 *
 * @author albert471 (Alberto Checcone)
 * @version 1.0
 */
public class Circle extends Shape
{
	private final int CSIDES = 0;
	private int radius;
	
	public Circle(int x, int y, int r)
	{
		super(0,x,y);
		radius = r;
	}
	
	public String toString()
	{
		String result = super.getLocation();
		result += "\n is a Circle with " + CSIDES + " sides.";
		return result;
	}
	
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter()
	{
		return 2*Math.PI*radius;
	}
}