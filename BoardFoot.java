/*
* The BoardFoot program lets you choose two parameters for a board
* then calculates the height related to one board food.
*
* @author  Cameron Teed
* @version 1.0
* @since   2020-04-29
* Class BoardFoot.
*/

import java.util.Scanner; // import scanner

final class BoardFoot {

   private BoardFoot() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

  /**
  * Function calculates the height in board length.
  *
  * @param length
  * @param width
  * @return boardFoot
  */
  public static float boardFoot(final float length, final float width) {

    // defines volume constant
    final float volume = 144;

    // calculates height from length width and volume
    float height = volume / (length * width);

    // returns height
    return height;
  }

  /**
  * Function gets user input for height and length and passes it to woodcutter.
  *
  * @param args
  */
  public static void main(final String[] args) {

    // Begins try statment
    try {

      // Create scanner object
      Scanner myObj = new Scanner(System.in);

      // receives length input
      System.out.println("Insert the length of the board (inches): ");
      float length = myObj.nextFloat();

      // receives width input
      System.out.println();
      System.out.println("Insert the width of the board (inches): ");
      float width = myObj.nextFloat();

      // checks if user inputted correct number
      if (length > 0 && width > 0) {

        // receives information from boardFoot
        float calcHeight = boardFoot(length, width);

        // Outputs the board height
        System.out.println();
        System.out.println("The height that makes your dimensions equal to one"
        + " Board Foot " + calcHeight + " inches");
        System.out.println();
        System.out.println("Done");

      // Runs if number less than 0 was inputted
      } else {

        // Outputs that the correct number needs to be inputed
        System.out.println();
        System.out.println("Please enter a number greater than 0");
        }

    // Catches errors
    } catch (Exception e) {
      // Runs if anything other than an intiger is inputted
      System.out.println();
      System.out.println("Invalid input. Please try again");
    }
  }
}
