class Rational{

private int numerator;
private int denominator;

 public Rational (){

}

public Rational (int numerator, int denominator){
this.numerator= numerator;
this.denominator= denominator;
}

public Rational (Rational r){
numerator= r.numerator;
denominator= r.denominator;
}

public void read()
{

System.out.println("Enter  numerator value;");
System.out.println("enter  denominator value;");

}
public void show()
{

System.out.println(numerator+ "/" +denominator);
}
}

 class Demo
{

public static void main(String[] args)
{
  Rational r = new Rational();
  r.show();
  Rational r1 = new Rational(8,12);
  r1.show();
  Rational r2 = new Rational(r1);
  r2.show();
}
}
