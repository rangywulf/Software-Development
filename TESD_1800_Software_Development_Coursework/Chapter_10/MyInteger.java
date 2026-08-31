/*
Author: Jess Stubbs
Date: 08/31/2026

Create Integer Class
*/
public class MyInteger {
    private int value;

    /** Construct a MyInteger object for the specified int value */
    public MyInteger(int value) {
        this.value = value;
    }

    /** Get the integer value stored in this object */
    public int getValue() {
        return value;
    }
    
    /** Non-static: is this object's own value even? */
    public boolean isEven() {
        return value % 2 == 0;  
    }

    /** Non-static: is this object's own value odd? */
    public boolean isOdd() {
        return value % 2 == 1;
    }

    /** Non-static: is this object's own value prime? */
    public boolean isPrime() {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    /** Static: is the specified int value even? */
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /** Static: is the specified int value odd? */
    public static boolean isOdd(int value) {
        return value % 2 == 1;
    }

    /** Static: is the specified int value prime? */
    public static boolean isPrime(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    /** Static: is the specified MyInteger object's value even? */
    public static boolean isEven(MyInteger value) {
        return value.isEven();
    }

    /** Static: is the specified MyInteger object's value odd? */
    public static boolean isOdd(MyInteger value) {
        return value.isOdd();
    }

    /** Static: is the specified MyInteger object's value prime? */
    public static boolean isPrime(MyInteger value) {
        return value.isPrime();
    }

    /** Non-static: does this object's value equal the specified int? */
    public boolean equals(int value) {
        return this.value == value;
    }

    /** Non-static: does this object's value equal the specified MyInteger's value? */
    public boolean equals(MyInteger value) {
        return this.value == value.getValue();
    }

    /** Static: parse a String of digits into an int */
    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }

    /** Static: parse a char array of digits into an int */
    public static int parseInt(char[] chars) {
        String s = new String(chars);
        return Integer.parseInt(s);
    }
}