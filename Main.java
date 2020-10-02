import java.util.Scanner;
/**
 * Prompts user to enter positive numer, negative  * number quits
 * @author Jaden Rancharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //declares user input
    int num;

    //starts loop
    do{
      System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
      num = input.nextInt();
    }while(num >= 0);
    System.out.println("All done!");
    
  }
}
