
/**
 * This activity demonstrates the usefulness of object-oriented-programming
 * and private variables.
 * @author albert471 (Alberto Checcone)
 * @version 1.0
 */
public class Car
{
   float MPG;
   String lpn;
   int miles;
   String owner;
   public static void main(String[] args)
   {
       Car c1 = new Car("Albert", "1ABC456");
       Car c2 = new Car("Alberto", "2BCD345", 200);
       c1.drive(400);
       c2.drive(400);
       System.out.println(c1.getOwner() + "'s car has " + c1.getMiles() + " miles.");
       System.out.println(c2.getOwner() + "'s car has " + c2.getMiles() + " miles.");
   }
   public Car(String s1, String s2)
   {
       miles = 0;
       MPG = (float) 30;
       owner = s1;
       lpn = s2;
   }
   public Car (String s1, String s2, int num)
   {
       miles = num;
       MPG = (float) 30;
       owner = s1; 
       lpn = s2; 
   }
   public float getMPG()
   {
       return MPG;
   }
   public int getMiles()
   {
       return miles;
   }
   public String getOwner()
   {
       return owner;
   }
   public void setOwner(String newowner)
   {
       owner = newowner;
   }
   public void drive(int num)
   {
       miles += num;
   }
}
    