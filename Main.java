 import java.util.Scanner;
/**
 *This program converts letter grades into percentages
 * @author Zach Ramirez 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for input
    Scanner input = new Scanner(System.in); 
    //ask user for letter grade 
    System.out.println("Please enter a letter grade");
    
    int mark = input.nextInt(); 

    //get the grade from the user 
    switch (mark) {
   case 1: 
      System.out.println("This is between 80% and 100%");
      break;
   case 2: 
      System.out.println("This is between 70% and 79%");
      break;
   case 3: 
      System.out.println("This is between 60% and 69%");
      break;
   case 4: 
      System.out.println("This is between 50% and 59%");
      break;
   case 5: 
      System.out.println("This is between 0% and 49%");
      break;
 
    }
    
    
  }
}
