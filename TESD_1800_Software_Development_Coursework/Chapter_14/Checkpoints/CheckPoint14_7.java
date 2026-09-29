package Software-Development.TESD_1800_Software_Development_Coursework.Chapter_14.Checkpoints;

public class CheckPoint14_7 {
    /* 14.7.1
    How do you create a color?
    - public Color(double r, double g, double b, double opacity);
    What is wrong about creating a Color using: new Color(1.2, 2.3, 3.5, 4)?
    - Every color is out of range. Valid range is 0.0 to 1.0.
    Which of two colors is darker, new Color(0, 0, 0, 1) or new Color (1, 1, 1, 1)?
    - the first one. 
    Does invoking c.darker() change the color value in c?
    - No. Since Color is immutable, darker() cannot modify c itself. It returns a brand new Color
    - object that's darker, c stays exactly as it was unless you reassign it, like c = c.darker();
    */
   
    /* 14.7.2
    How do you create a Color object with a random color?
    Color randomColor = Color.color(Math.random(), Math.random(), Math.random());
    */

    /* 14.7.3
    How do you set a circle object c with blue fill color using the setFill method and the setStyle method?
    - c.setFill(Color.BLUE);
    - c.setStyle("-fx-fill: blue;");
    */
