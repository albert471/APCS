public class Cannonball
{
    private Point point;
    private double yveloc;
    private double xveloc;
    private final double g = 9.8;
    public Cannonball()
    {
        point = new Point(0,0);
        xveloc = 0;
        yveloc = 0;
    }
    public Cannonball(double x, double y)
    {
        point = new Point(x,y);
        xveloc = 0;
        yveloc = 0;
    }
    public void move(double deltaSec)
    {
        double y = point.getY() + deltaSec*yveloc;
        double x = point.getX() + deltaSec *xveloc;
        point.setLocation(x,y);
        xveloc -= g*deltaSec;
    }
    public void shoot(double v, double theta)
    {
        xveloc = v*Math.cos(theta);
        yveloc = v*Math.sin(theta);
    }
    public Point getLocation()
        {
            return point;
        }
        public double getXV(){
            return xveloc;
        }
        public double getYV(){
            return yveloc;
        }
    }
