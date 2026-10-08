public class CheckPoint15_12 {
    /* 15.12.1
    How does the program make the ball appear to be moving?
    - The Timeline repeatedly calls the moveBall() method, which changes
    the ball's x and y coordinates and updates its position on the screen.
    */

    /* 15.12.2
    How does the code change the direction of the ball movement?
    - protected void moveBall() {
        // Check boundaries
        if (x < radius || x > getWidth() - radius) {
            dx = -dx; // Change ball move direction
        }
        if (y < radius || y > getHeight() - radius) {
            dy = -dy; // Change ball move direction
        }

        // Adjust ball position
        x += dx;
        y += dy;
        circle.setCenterX(x);
        circle.setCenterY(y);
    } */

    /* 15.12.3
    What does the program do when the mouse is pressed on the ball pane?
    - It pauses the ball
    What does the program do when the mouse is released on the ball pane?
    - It continues the animation
    */

    /* 15.12.4
    If line 32 is not in the BounceBallControl, what would happen when you press the up or
    the down arrow key? 
    - it would not change the animation speed
    */

    /* 15.12.5
    if line 23 is not in BallPane, what would happen?
    - The ball wouldn't move */
}
