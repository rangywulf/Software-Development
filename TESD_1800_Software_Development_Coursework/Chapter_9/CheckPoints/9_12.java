public class 9_12 {
    /* 9.12.1
    If a class contains only private data fields and no setter moethods, is the class immutable?
    - Not necessarily. To be immutable, the class must also contain no getter methods that would
    return a reference to a mutable data field object. */

    /* 9.12.2
    If all the data fields in a class are private and of primitive types, and the class doesn't
    contain any setter methods, is the class immutable?
    - Yes */

    /* 9.12.3
    Is the following class immutable?

    public class A {
        private int[] values;

        public int[] getValues() {
            return values;
        }
    }
    
    - No. because values is a reference type. */
}
