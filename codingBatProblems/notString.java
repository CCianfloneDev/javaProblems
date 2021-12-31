import java.util.Scanner;
/** Coding Bat Java Warmup notString
 * Purpose: Demonstrate understanding of String class, manipulating strings
 * Given a string, return a new string where "not " has been added to the front.
 * However, if the string already begins with "not", return the string unchanged.
 *
 * @Author: Cole Cianflone
 * Date: Dec 31, 2021
 */
public class notString
{
	public static void main(String[] args)
	{
		String userInput;
		// title
		System.out.println("=====================\n"+
		                   "notString - CodingBat\n"+
		                   "=====================\n");

		// input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter in a string, any string:");
		userInput = sc.nextLine();

		// method Invocation
		System.out.println(notString(userInput));
	}

	/**
	 * Checks string to see if it begins with "not", if so return the string unchanged,
	 * if it doesn't begin with "not", it will return a string beginning with "not".
	 * @param string
	 * @return the string unchanged, or the string beginning with "not".
	 */
	public static String notString(String string)
	{
		if(string.length() >= 3 && string.substring(0, 3).equals("not"))
			return " String unchanged: " + string + "\n";

		return " String modified: not " + string + "\n";
	}
}
