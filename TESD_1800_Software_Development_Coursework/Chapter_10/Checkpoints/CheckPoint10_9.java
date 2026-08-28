package Chapter_10.Checkpoints;

public class CheckPoint10_9 {
    /* What is the output of the following code? */
    public static void main(String[] args) {
        java.math.BigInteger x = new java.math.BigInteger("3");
        java.math.BigInteger y = new java.math.BigInteger("7");
        java.math.BigInteger z = x.add(y);
        System.out.println("x is " + x);
        System.out.println("y is " + y);
        System.out.println("z is " + z);
    }
    /*
    x is 3
    y is 7
    z is 10
     */   
}
