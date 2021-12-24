package Java;

/** Codecademy Learn-Java Project: Fizz Buzz
 * FizzBuzz Program will take Multiples of 3 print Fizz instead of number,
 * multiples of 5 print Buzz, and multiples of both print FizzBuzz.
 * Purpose: Demonstrate understanding of for loops, if statements, and comparision operators.
 *
 * Auhtor: Cole Cianflone
 * Date: Dec 7th, 2021
 */
public class FizzBuzz
{
  final static int FIZZBUZZ_START = 1;
  final static int FIZZBUZZ_FINISH = 100;
  
  public static void main(String[] args)
  {
    // title
    System.out.println("This is the classic FizzBuzz Program\n\n");

    for(int i = FIZZBUZZ_START; i <= FIZZBUZZ_FINISH; i++) {
      boolean divisibleByThree = i % 3;
      boolean divisibleByFive = i % 5;
      
      if(divisibleByThree && divisibleByFive) {
        System.out.println("FizzBuzz!");
      }else if(divisibleByThree) {
        System.out.println("Fizz!");
      }else if(divisibleByFive) {
        System.out.println("Buzz!");
      }else {
        System.out.println(i);
      }
    }
  }
}
