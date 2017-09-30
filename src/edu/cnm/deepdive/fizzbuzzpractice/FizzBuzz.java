/**
 * 
 */
package edu.cnm.deepdive.fizzbuzzpractice;

/**
 * @author Kelly Escobar
 *
 */
public class FizzBuzz {

  public static final int UPPER_LIMIT = 250;
  /**
   * @param args
   */
  public static void main(String[] args) {
    fizzbuzz(UPPER_LIMIT);
  }
  
  public static void fizzbuzz(int fizz) {
    for (int i = 1; i <= UPPER_LIMIT; i++) {
      if ((i % 3 == 0) && (i % 5 == 0)) {
        System.out.println("fizzbuzz");
      }
      if (i % 3 == 0) {
      System.out.println("fizz");
      }
      if (i % 5 == 0) {
        System.out.println("buzz");  
      } else {
        System.out.println(i);
      }
        
      }
    }

}
