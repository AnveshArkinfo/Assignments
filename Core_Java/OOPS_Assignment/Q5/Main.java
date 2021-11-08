package Assign2_Q4;

public class Main {
	
    public static void main(String[] args) {
    	
        Shape shape = new Rectangle();
        shape.draw();
        
        new Line().draw();
        new Cube().draw();
    }
}

/* After Compilation the output should be like this
* 
* The RECTANGLE shape is drawn
* The LINE shape is drawn
* The CUBE shape is drawn
*
*/