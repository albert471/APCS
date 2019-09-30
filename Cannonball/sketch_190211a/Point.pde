import java.util.Scanner;
import java.lang.Math;
public class Point{
    private float x;
    private float y;
    public Point(float a, float b){
            x = a;
            y = b;
    }       
    public void move(float a,float b){
        x = x+a;
        y = y+b;
    }
    public void setLocation(float a, float b){
        x = a;
        y = b;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
}
