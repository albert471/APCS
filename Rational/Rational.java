
/**
 * Rational demonstrates the use of code abstraction by storing
 * rational numbers as the division of two integers
 * @author albert471 (Alberto Checcone)
 * @version 1.0
 */
public class Rational
{

    private int numerator, denominator;


    public static void main(String[] args){

    Rational r1 = new Rational(1,2);
    Rational r2 = new Rational(1,2);

    System.out.println(r1.toString() + " + " + r2.toString() + " = " + r1.plus(r2).toString());
    System.out.println(r1.toString() + " - " + r2.toString() + " = " + r1.minus(r2).toString());
    System.out.println(r1.toString() + " x " + r2.toString() + " = " + r1.times(r2).toString());
    System.out.println(r1.toString() + " % " + r2.toString() + " = " + r1.dividedBy(r2).toString());

    }


    public Rational(int num, int den){

    if(den == 0)
        den = 1;
    

    if(den < 0){
        num *= -1;    
        den *= -1;
    }

    

    numerator = num;
    denominator = den;
    

    reduce();



    

    }


    public double toDouble(){
    double n = numerator;
    double d = denominator;

    return n/d;
    }

    public String toString(){
    String result;
    if(numerator == 0)
        result = "0"; 
    else if(denominator == 1)
        result = numerator + "";
    else
        result = numerator + "/" + denominator;
    return result;

    }


    public Rational plus(Rational s){
         int a = s.getNumerator(); 
         int b = s.getDenominator();
         
         return 
    }
   


    public Rational minus(Rational s){


    }

    public Rational times(Rational s){



    }



    public Rational reciprocal (){

    }


    public Rational dividedBy(Rational s){

    return times(s.reciprocal());
    }
  



    public int getNumerator(){
    return numerator;
    }

    public int getDenominator(){
    return denominator;
    }


    public boolean equals(Rational s)
    {
    


    }

    

    public void reduce(){

    if(numerator != 0)
        {
        int common = gcd (Math.abs(numerator), denominator);
        numerator /= common;
        denominator /= common;
        }

    }

    private int gcd(int num1, int num2)
    {
    while(num1 != num2)
        if(num1 > num2)
        num1 -= num2;
        else
        num2 -= num1;
    return num1;
    }

    



    



}