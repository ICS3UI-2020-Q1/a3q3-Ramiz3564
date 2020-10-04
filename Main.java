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
    
    String mark = input.nextLine(); 
     

    //get the grade from the user 
    switch (mark) {
   case "a": 
      System.out.println("This is between 80% and 100%");
      break;
   case "b": 
      System.out.println("This is between 70% and 79%");
      break;
   case "c": 
      System.out.println("This is between 60% and 69%");
      break;
   case "d": 
      System.out.println("This is between 50% and 59%");
      break;
   case "f": 
      System.out.println("This is between 0% and 49%");
      break;
 
    }
    
    
  }
}
