/**
 * Shirt class
 * Assignment 5: Bringing it All Together
 * @author Jessica Klurfeld + R. Jordan Crouser + CSC120 (Fall '22))
 * @version 16 October 2022
 */
public class Shirt {

    /**
     * Print ASCII Art Shirt
     */
    public void display() {
        System.out.println("     _____/          \\_____");
        System.out.println("    '                      '");
        System.out.println("   '  /                  \\  '");
        System.out.println("  '  /  |             |   \\  '");
        System.out.println(" /--/   |             |    \\--\\");
        System.out.println("/__/    |             |     \\__\\");
        System.out.println("        |_____________|");
    }

    /** main method (for testing) */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }
}
