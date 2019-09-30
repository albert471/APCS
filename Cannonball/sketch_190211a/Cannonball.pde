
public class Cannonball
{
    private Point point;
    private double yveloc;
    private double xveloc;
    private final float g = 9.8;
    public Cannonball()
    {
        point = new Point(0,0);
        xveloc = 0;
        yveloc = 0;
    }
    public Cannonball(float x, float y)
    {
        point = new Point(x,y);
        xveloc = 0;
        yveloc = 0;
    }
    public void move(float deltaSec)
    {
        float y = point.getY() + deltaSec*(float)yveloc;
        float x = point.getX() + deltaSec *(float)xveloc;
        point.setLocation(x,y);
        yveloc -= g*deltaSec;
    }
    public void shoot(float v, double theta)
    {
        xveloc = v*Math.cos(theta);
        yveloc = v*Math.sin(theta);
    }
    public Point getLocation()
        {
            return point;
        }
        public float getXV(){
            return (float)xveloc;
        }
        public float getYV(){
            return (float)yveloc;
        }
        public float getX(){
          return point.getX();
        }
        public float getY(){
          return point.getY();
        }
    }
    
