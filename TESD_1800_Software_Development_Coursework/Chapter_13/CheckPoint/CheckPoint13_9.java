public class CheckPoint13_9 {
    /* 13.9.1
    Show the output of the following code?
    Rational r1 = new Rational(-2, 6);
    System.out.println(r1.getNumerator());
    System.out.println(r1.getDenominator());
    System.out.println(r1.intValue());
    System.out.println(r1.doubleValue());
    - -1
    - 3
    - 0
    - 0.3333333333
    */

    /* 13.9.2
    Why is the following code wrong?
    Rational r1 = new Rational(-2, 6);
    Object r2 = new Rational(1, 45);
    System.out.println(r2.compareTo(r1));

    - the Object method doesn't have a compareTo method
    */

    /* 13.9.3
    Why is the following code wrong?
    Object r1 = new Rational(-2, 6);
    Rational r2 = new Rational(1, 45);
    System.out.println(r2.compareTo(r1));

    - The compareTo(Rational) method requires a Rational type object 
    in the parameter in the Rational class. Object is not a declared Rational Type.
    */

    /* 13.9.5
    Trace the program carefully and show the output of the following code.
    Rational r1 = new Rational(1, 2);
    Rational r2 = new Rational(1, -2);
    System.out.println(r1.add(r2));
    - 0/4
    */

    /* 13.9.6 
    The preceding question shows a bug in the toString method. Revise the toString() method to
    fix the error.
public String toString() {
  if (numerator == 0 || denominator == 1)
    return numerator + "";
  else 
    return numerator + "/" + denominator;
}    
    */

    /* 13.9.7
    What happens if you create a Rational using new Rational(1, 0)? Discuss the appropriate ways
    for handling this case. 
    
    - division by zero is undefined. There is no valid rational number represented by 1/0.
    - You can throw an exception like IllegalArgumentException or you can change the denominator
    to something like 1/1
    
    */
}
