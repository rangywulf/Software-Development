package Software-Development.TESD_1800_Software_Development_Coursework.Chapter_14.Checkpoints;

public class CheckPoint14_5 {
    /* 14.5.1
    What is a binding property?
    - The binding of wrapper objects that know how to notify listeners of changes. A binding property is the one that follows the source, 
    - copying the source's value whenever it changes.
    What interface defines a binding property?
    - javafx.beans.property.Property
    What interface defines a source object?
    - javafx.beans.value.ObservableValue
    What are the binding object types for int, long, float, double, and boolean?
    - DoubleProperty,  FloatProperty, LongProperty, IntegerProperty, BooleanProperty
    Are Integer and Double binding properties?
    - no. they need IntegerProperty or DoubleProperty
    Can Integer and Double be used as source objects in a binding? 
    - No. A source must be an ObservableValue, meaning something that can announce "I changed!"
    - Plain Integer and Double are just values. They can't announce anything, so nothing could follow them.
    */

    /* 14.5.2
    Following the JavaFX binding property naming convention, for a binding property named age of the IntegerProperty type,
    what is its value getter method, value setter method, and property getter method?
    getAge()
    setAge(int value)
    ageProperty()
    */

    /* 14.5.3
    Can you create an object of IntegerProperty using new INtegerProperty(3)?
    - No. IntegerProperty is an abstract class, a blueprint that Java won't let you build directly. 
    If not, what is the correct way to create it?
    - IntegerProprty i1 = new SimpleIntegerProperty(3);
    What will be the output if line 8 is replaced by d1.bind(d2.multiply(2)) in BindingDemo.java?
    What will be the output if line 8 is replaced by d1.bind(d2.add(2)) in BindingDemo.java?
    - they don't change d2. They build a forumula that d1 follows, like a spreadsheet cell. 
    - d1 is 4.0 and d2 is 2.0
    - d1 is 140.4 and d2 is 70.2
    - and
    - d1 is 4.0 and d2 is 2.0
    - d1 is 72.2 and d2 is 70.2
    */

    /* 14.5.4
    What is unidirectional binding and what is bidirectional binding?
    - Unidirectional binding: One-way only: source changes -> target updates. Target can not change the source.
    - Bidirectional binding: Two-way: either object can change, and the other one automatically syncs to match.
    Are all binding properties capable of bidirectional binding?
    - Yes. bindBidirectional is defined in Property, and every binding property is a Property.
    Write a statement to bind property d1 with property d2 bidirectionally.
    - d1.bindBidirectional(d2);
    
    */
}
