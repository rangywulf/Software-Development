public class CheckPoint13_5 {
    /* 13.5.1
    Suppose A is an interface. Can you create an instance use new A()?
    - No 
    */

    /* 13.5.2
    Suppose A is an interface. Can you delcare a reference variable x with type A like this?
    A x; 
    - Yes
    */

    /* 13.5.3
    Which is the correct interface (see book for examples)
    d,e and f */

    /* 13.5.4
    Show the error in the following code:
    interface A {
        void m1();
    }

    class B implements A {
        void m1() {
            System.out.println("m1");
        }
    }
    - all methods defined in an interface are public. 

    class B implements A {
        public void m1() {
            System.out.println("m1");
        }
    }
     */
}
