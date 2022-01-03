import java.util.Scanner;
/**
 * Coding Bat Warmup stringE
 * Return true if the given string contains between 1 and 3 'e' chars.
 *
 * @Author: Cole Cianflone
 * Date: Jan 3rd, 2021
 */
public class StringE
{
	public static void main(String[] args)
	{
		String userInput;
		// title
		System.out.println("=====================\n"+
				               " eString - CodingBat\n"+
				               "=====================\n"+
				               "Will return true if string has between 1-3 'e's\n");

		// input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter in a string, any string: ");
		userInput = sc.nextLine();

		// method invocation
		System.out.println(stringE(userInput));

	}

	/**
	 * loops through string, checks each position at i index. If it's 'e',
	 * increment eCount variable. Uses eCount variable to see if there is between 1 and 3 'e's
	 * @param String str
	 * @return bool eCount >= 1 && eCount <= 3
	 */
	public static boolean stringE(String str)
	{
	  int eCount = 0;

	  for(int i = 0; i < str.length(); i++)
	  {
	    if(str.charAt(i) == 'e')
	      eCount++;
	  }

	  return (eCount >= 1 && eCount <= 3);
	}
}
