/**
 * Scarecrow class 
 * Assignment 5: Bringing it All Together
 * @author Jessica Klurfeld + R. Jordan Crouser + CSC120 (Fall '22))
 * @version 16 October 2022
 */

class Scarecrow {

    /** Parts of the Scarecrow */
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    private Boot leftFoot;
    private Boot rightFoot;
    Banner sign;
    private String message;

    /** Constructor */
    public Scarecrow(Pumpkin h, Shirt s, Pants p, Boot l, Boot r) {
        head = h;
        body = s;
        legs = p;
        leftFoot = l;
        rightFoot = r;
        //sign = b;
    }

    /** Displays the Scarecrow */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    }

    /** Main method (for testing) */
    public static void main(String[] args) {

        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants(), new Boot("left"), new Boot("right"));

        // If a message was passed in on the command line, extract and store it
        if (args.length > 0) {
            myScarecrow.message = args[0];
        }
        else{
            myScarecrow.message = "Happy Fall!";
        }
        myScarecrow.sign = new Banner(myScarecrow.message);
        myScarecrow.display();
    }

}
