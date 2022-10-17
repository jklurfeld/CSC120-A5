/**
 * Banner class
 * Assignment 5: Bringing it All Together
 * @author Jessica Klurfeld + R. Jordan Crouser + CSC120 (Fall '22)
 * @version 16 October 2022
 */

public class Banner {
    
    /** Message to print on Banner */
    private String message;

    /** Constructor */
    public Banner(String m) {
        this.message = m;
    }

    /** Prints a decorative banner, resized to fit the message */
    public void display() {
        String firstLine = "    ";
        for (int i = 0; i < (message.length() + 4); i++){
            firstLine += "*";
        }
        String secondLine = "  ";
        for (int i = 0; i < (message.length() + 8); i++){
            secondLine += "*";
        }

        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println("*** ~ " + this.message + " ~ ***");
        System.out.println(secondLine);
        System.out.println(firstLine);
    }

    /** main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello world");
        myBanner.display();
        Banner test = new Banner ("HAPPY FALL, EVERYONE!");
        test.display();
    }
}
