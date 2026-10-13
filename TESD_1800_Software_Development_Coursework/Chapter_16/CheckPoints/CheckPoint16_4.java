package Software-Development.TESD_1800_Software_Development_Coursework.Chapter_16.CheckPoints;

public class CheckPoint16_4 {
    /* 16.4.1
    What is the output of the following code? 

    public class Test {
        public static void main(String[] args) {
            Test test = new Test();
            test.new B().start();
        }
        class A {
            public void start() {
                System.out.println(getP());
            }
            public int getP() {
                return 1;
            }
        }
        class B extends A {
            public int getP() {
                return 2 + super.getP();
            }
        }
    }
    - 3
    */

    /* 16.4.2 
    How do you test if a check box is selected?
    - isSelected()
    */

    /* 16.4.3
    Can you apply all the methods for Labeled to CheckBox?
    - yes 
    */

    /* 16.4.4
    Can you set a node for the graphic property in a check box?
    - Yes. A CheckBox inherits the graphic property from Labeled.
    */
}
