public class CheckPoint11_3 {
    /* 11.3.1
    What is the ouput of running the class C in (a)?
    - A's no-arg constructor is invoked
    What problem arises in compiling the program in (b)? 
    - The default construct of B attempts to invoke the default of constructor of A, but class A's
    default constructor is not defined.
    */

    /* 11.3.2
    How does a subclass invoke its superclass's constructor?
    By using the super keyword */

    /* 11.3.3
    True or false? When invoking a constructor from a subclss, its superclass's no-arg constructor
    is always invoked.
    False. If a subclass's constructor explicitly invoke a superclass's constructor, the superclass's
    no-arg constructor is not invoked. */
}
