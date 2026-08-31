/*
Author: Jess Stubbs
Date: 08/31/2026

Test program for the MyInteger class
*/

public class MyIntegerTest {
    public static void main(String[] args) {
        // Create an object to test the non-static methods
        MyInteger num1 = new MyInteger(7);

        // Test the non-static methods(called ON the object)
        System.out.println("num1 value: " + num1.getValue());
        System.out.println("num1 isEven: " + num1.isEven());
        System.out.println("num1 isOdd: " + num1.isOdd());
        System.out.println("num1 isPrime: " + num1.isPrime());

        // Test the static int versions(called ON THE CLASS, no object needed)
        System.out.println("isEven(8): " + MyInteger.isEven(8));
        System.out.println("isOdd(8): " + MyInteger.isOdd(8));
        System.out.println("isPrime(8): " + MyInteger.isPrime(8));

        // Test the static MyInteger versions
        MyInteger num2 = new MyInteger(10);
        System.out.println("isEven(num2): " + MyInteger.isEven(num2));
        System.out.println("isOdd(num2): " + MyInteger.isOdd(num2));
        System.out.println("isPrime(num2): " + MyInteger.isPrime(num2));

        // Test equals(both versions)
        System.out.println("num1.equals(7): " + num1.equals(7));
        System.out.println("num1.equals(num2): " + num1.equals(num2));

        // Test parseInt (both versions)
        System.out.println("parseInt(\"123\": " + MyInteger.parseInt("123"));
        char[] chars = {'4', '5', '6'};
        System.out.println("parseInt(char[]): " + MyInteger.parseInt(chars));
    }
}
