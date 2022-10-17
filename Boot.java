/**
 * Boot class
 * Assignment 5: Bringing it All Together
 * @author Jessica Klurfeld + R. Jordan Crouser + CSC120 (Fall '22))
 * @version 16 October 2022
 */
public class Boot {
  
    private String direction;
  
    /** Constructor */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

    /** Prints an ASCII Art Boot */
    public void display() {
        if (this.direction.equals("left")) {
          System.out.print("     |________|");
        } else if (this.direction.equals("right")) {
          System.out.print(" |________|");
        } else {
          System.out.println("Which boot?");
        }
    }

    /** main method (for testing) */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
}
