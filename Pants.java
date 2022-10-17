/**
 * Pants class
 * Assignment 5: Bringing it All Together
 * @author Jessica Klurfeld + R. Jordan Crouser + CSC120 (Fall '22))
 * @version 16 October 2022
 */
public class Pants {

    /**
     * Print ASCII Art Pants
     */
    public void display() {
        System.out.println("        |_____________|");
        System.out.println("       /   /       \\   \\");
        System.out.println("      | __/         \\__ |");
        System.out.println("      |        |        |");
        System.out.println("      |        |        |");
        System.out.println("      |        |        |");
        System.out.println("      |        |        |");
        System.out.println("      |        |        |");
        System.out.println("      |        |        |");
        System.out.println("      |        |        |");
        System.out.println("      |        |        |");
        System.out.println("      |        |        |");
        System.out.println("      |________|________|");
    }

    /** main method (for testing) */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}
