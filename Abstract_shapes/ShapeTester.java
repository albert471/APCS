
/**
 * tester method for the abstract classes written in other files
 *
 * @author teacher (I can't remember if we wrote this or if it was given to us)
 * @version 1.0
 */
public class ShapeTester
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(0,0,2,2);
		Rectangle r2 = new Rectangle(5,10,4,2);
		Circle c = new Circle(0,0,1);
		Circle c2 = new Circle(5,10,4);
		System.out.println(r.toString());
		System.out.println(r2.toString());
		System.out.println(c.toString());
		System.out.println(c2.toString());
		System.out.println("Area of rectangle 1: " + r.getArea() + "\n with perimeter: " +r.getPerimeter());
		System.out.println("Area of circle 1: " + c.getArea() + "\n with perimeter: " + c.getPerimeter());
		System.out.println("Rectangle 2 has " + r2.getSides() + " sides.");
		System.out.println("Circle 2 has " + c2.getSides() + " sides.");
	}
}