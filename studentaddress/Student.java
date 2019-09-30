public class Student{
    private Address Home;
    private Address School;
    private String first;
    private String last;
    private String identifier;
    public static void main (String[] args){
Address poly = new Address ("1030 E. California Blvd.", "Pasadena", "CA",
"91106");
Address jHome = new Address("21 Jump Street", "Pasadena", "CA", "91106");
Student james = new Student("James", "Johnston", jHome, poly);
Address vHome = new Address("123 Main St.", "Venice", "CA", "90291");
Student vicky = new Student("Vicky", "Jones", vHome, poly);
System.out.println(james.toString());
System.out.println(vicky.toString());
//these lines should print a profile of James and Vicky
james.move("1600 Pennsylvania Ave. NW", "Washington" ,"DC","20500");
//updates James's address to the White House
vicky.setSchool("666 Devil Ln.","Bad Land","CA","99666");
//switches Vicky to a terrible school :(
System.out.println(james.toString());
System.out.println(vicky.toString());
}
public Student(String a, String b, Address c, Address d){
    first = a;
    last = b;
    Home = c;
    School = d;
}
public String getFirst(){
    return first;
}
public String getLast(){
    return last;
}
public String toString(){
    identifier = first + " " + last + " lives at " + Home.getAddress() + " and goes to school at " + School.getAddress();
    return identifier;
}
 public void move(String a, String b, String c, String d){
    Home.Addresss = a;
    Home.City = b;
    Home.State = c;
    Home.Zip = d;
}
    public void setSchool(String a, String b, String c, String d){
    School.Addresss = a;
    School.City = b;
    School.State = c;
    School.Zip = d;
}

}