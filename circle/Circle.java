
/**
 * Circle creates the circle class and tests some of its
 * constructor/getter/setter methods. (formatting screwed up for some reason)
 * @author albert471 (Alberto Checcone)
 * @version 1.0
 */
public class Circle{
    private double radius;
    private double x;
    private double y;
    private double circum;
    private double area;
    private final double pi = 3.14159265;
    private boolean check = false;
public static void main(String[] args){
Circle c1 = new Circle(2.0,3.0, -4.0);
// declares a circle called c1, with radius 2 and center at (3,-4)
Circle c2 = new Circle();
// declares a circle called c2, with radius 1 and center at the origin
Circle c3 = new Circle(2.0);
// declares a circle called c3, with radius 2 and center at the origin
 System.out.println("c1 is the circle with " + c1.toString());
System.out.println("c2 is the circle with " + c2.toString());
System.out.println("c3 is the circle with " + c3.toString());
//these print statements just describe the circles in words
System.out.println("c1 equals c3: " + c1.equals(c3));
//tells us whether c1 and c3 are the 'same' circle
c1.move(-3.0,4.0);
System.out.println(c1.toString());
//moves circle c1 -3 in x-direction and 4 in y-direction
System.out.println("circle c1 was moved up 4 and over -3");
System.out.println("c1 equals c3: " + c1.equals(c3));
//tells us whether c1 and c3 are the 'same' circle
System.out.println("c2 has x coordinate: " + c2.getX());
//tells us the x coordinate of c2
System.out.println("c2 has circumference: " + c2.circumference());
//tells us the circumference of c2
System.out.println("c1 has y coordinate: " + c2.getY());
//tells us the y coordinate of c1
System.out.println("c1 has area: " + c1.area());
//tells us the area of c1
}
public Circle(){
    radius = 1;
    x = 0.;
    y = 0.;
}
public Circle(double a, double b, double c){
    radius = a;
    x = b;
    y = c;
}
public Circle(double a){
    radius = a;
    x = 0.;
    y = 0.;
}
public String toString(){
return "radius " + radius + " and centered at " + x + "," + y;
}
public void move(double a, double b){
    x = x + a;
    y = y + b;
} 
public double getX(){
    return x;
}
public double getY(){
    return y;
}
public double circumference(){
    circum = 2*pi*radius;
    return circum;
}
public double area(){
    area = radius*radius*pi;
    return area;
}
public double getRadius(){
    return radius;
}
public boolean equals(Circle a){
    if(radius == a.radius && x == a.x && y == a.y)
        check = true;
    return check;
}
}