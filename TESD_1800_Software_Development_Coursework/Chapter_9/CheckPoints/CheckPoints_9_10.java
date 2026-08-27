public class CheckPoints_9_10 {
    /* 9.10.1
    Describe the difference between passing a parameter of a primitive type and passing a 
    parameter of a reference type. Show the output of the following programs: 


  public static void main(String[] args) {
    Count myCount = new  Count();
    int times = 0;
    for (int i = 0; i < 100; i++)
      increment(myCount, times);
    System.out.println("count is " + myCount.count);
    System.out.println("times is " + times);
  }
  public static void increment(Count c, int times) {
    c.count++;
    times++;
  }
}

public class Count {
  public int count;
  public Count (int c) {
    count = c;
  }
  public Count () {
    count = 1;
  } */

    
/* The output
count is 101
times is 0

times (int, a primitive): Passing it into increment gives that method its own private copy. Whatever 
increment does to its copy of times has zero effect on the times back in main. So after 100 loops, 
main's times is still 0.

myCount (a Count object, a reference type): Passing it gives increment a copy of the address of the object, 
not a new object. Both myCount in main and c in increment point at the same one object sitting in memory. 
So c.count++ really does change that object's count field, permanently. Starting at 1 (default constructor) 
and incrementing 100 times in the loop lands it at 101.

The core idea in one line: primitive parameters get copied and isolated, reference parameters get you a copy 
of the address, so you can still reach in and modify the real object through it.

*/

/* 9.10.2
Show the output of the following program:
 public class Test {
  public static void main(String[] args) {
    Circle circle1 = new Circle(1);
    Circle circle2 = new Circle(2);
    
    swap1(circle1, circle2);
    System.out.println("After swap1: circle1 = " +
      circle1.radius + " circle2 = " + circle2.radius);

    swap2(circle1, circle2);
    System.out.println("After swap2: circle1 = " +
      circle1.radius + " circle2 = " + circle2.radius);
  }
  
  public static void swap1(Circle x, Circle y) {
    Circle temp = x;
    x = y;
    y = temp;
  }
  public static void swap2(Circle x, Circle y) {
    double temp = x.radius;
    x.radius = y.radius;
    y.radius = temp;
  }
}

class Circle {
  double radius;
  Circle(double newRadius) {
    radius = newRadius;
  }
}
  
After swap1: circle1 = 1.0 circle2 = 2.0
After swap2: circle1 = 2.0 circle2 = 1.0

*/

/* 9.10.3 
Show the output of the following code:
a) a[0] = 1 a[1] = 2
b) a[0] = 2 a[1] = 1
c) e1 = 2 e2 = 1
d) t1's i = 2 and j = 1
   t2's i = 2 and j = 1
*/
}
    

