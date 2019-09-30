public class Address{
    public String Addresss;
    public String City;
    public String State;
    public String Zip;
    private String fulladdy;
public Address(String a, String b, String c, String d){
    Addresss = a;
    City = b;
    State = c;
    Zip = d;
}
public String getAddress(){
    fulladdy = Addresss + ", " + City + ", " + State + ", " + Zip;
    return fulladdy;
}
   }