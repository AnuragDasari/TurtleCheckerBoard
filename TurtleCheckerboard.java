/**
* @author  Anurag Dasari // 
* ITSC1212 - 001, Mazumder
* @version 1.0 // add .1 for each update
* @since   2021-02-22 // date last updated
* Module_9 :Lab
* This application is drawing Checkerboard pattern using turtle
*/
public class TurtleCheckerboard {
    public static void main(String[] args) {
        World w = new World(500,500);           //New world 500x500 pixels
        Turtle tom = new Turtle(w);             //New turtle tom
        tom.penUp();                            //Pen Up
        tom.moveTo(50,50);                      //Move turtle to coordinates X=50, Y=50
        tom.setHeading(0);                      //Heading set to 0                    
        tom.penDown();                          //Pen down

        for (int y = 0; y < 4; y++) {           //Loop for drawing 4 squares
            for (int x = 0; x < 1; x++) {       //Loop for drawing the squares along Y axis
                tom.drawSquare();
            }
            tom.turn(180);                      //Turn turtle 180 degrees
            tom.penUp();                        //Pen up
            tom.forward(100);                   //Move turtle forward 100 pixels
            tom.turn(180);                      //Turn turtle 180 degrees
            tom.penDown();                      //Pen down
        }
        tom.penUp();
        tom.moveTo(150,50);
        tom.penDown();
        for (int y = 0; y < 4; y++) {           //Loop for drawing 4 squares
            for (int x = 0; x < 1; x++) {       //Loop for drawing the squares along Y axis
                tom.drawSquare();
            }
            tom.turn(180);                      //Turn turtle 180 degrees
            tom.penUp();                        //Pen up
            tom.forward(100);                   //Move turtle forward 100 pixels
            tom.turn(180);                      //Turn turtle 180 degrees
            tom.penDown();                      //Pen down
        }
        tom.penUp();
        tom.moveTo(250,50);
        tom.penDown();
        for (int y = 0; y < 4; y++) {           //Loop for drawing 4 squares 
            for (int x = 0; x < 1; x++) {       //Loop for drawing the squares along Y axis
                tom.drawSquare();
            }
            tom.turn(180);                      //Turn turtle 180 degrees
            tom.penUp();                        //Pen up
            tom.forward(100);                   //Move turtle forward 100 pixels
            tom.turn(180);                      //Turn turtle 180 degrees
            tom.penDown();                      //Pen down
        }
        tom.penUp();
        tom.moveTo(350,50);
        tom.penDown();
        for (int y = 0; y < 4; y++) {           //Loop for drawing 4 squares 
            for (int x = 0; x < 1; x++) {       //Loop for drawing the squares along Y axis
                tom.drawSquare();
            }
            tom.turn(180);                      //Turn turtle 180 degrees
            tom.penUp();                        //Pen up
            tom.forward(100);                   //Move turtle forward 100 pixels
            tom.turn(180);                      //Turn turtle 180 degrees
            tom.penDown();                      //Pen down
        }
        tom.setVisible(false);                  //Turtle invisible
    }
    
}
