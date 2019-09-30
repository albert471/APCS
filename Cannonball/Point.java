import java.util.Scanner;
import java.lang.Math;
public class Point{
    private double x;
    private double y;
    private double z;
        public static void main(String args[])
    {
    }
        public Point(double x, double y){
            x = x;
            y = y;
    }       
    public void move(double a,double b){
        x = x+a;
        y = y+b;
    }
    public void setLocation(double a, double b){
        x = x;
        y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
     public double distance(Point r){
         z = Math.sqrt(x*x+y*y);
         return z;
}
}