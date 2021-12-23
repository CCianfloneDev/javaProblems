package Java;
/** Codecademy Learn-Java Project: Fizz Buzz
 * FizzBuzz Program will take Multiples of 3 print Fizz instead of number,
 * 	multiples of 5 print Buzz, and multiples of both print FizzBuzz.
 * Purpose: Demonstrate understanding of for loops, if statements, and comparision operators.
 *
 * Auhtor: Cole Cianflone
 * Date: Dec 7th, 2021
 */
public class FizzBuzz
{
  public static void main(String[] args)
  {
    // title
    System.out.println("This is the classic FizzBuzz Program\n\n");

    for(int i = 1; i <= 100; i++)
    {
      if(i % 3 == 0 && i % 5 == 0)
        System.out.println("FizzBuzz!");
        else if(i % 5 == 0)
          System.out.println("Buzz!");
          else if(i % 3 == 0)
            System.out.println("Fizz!");
            else
              System.out.println(i);
    }
  }
}