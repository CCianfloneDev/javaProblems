import java.util.Scanner;

/**
 * CodingBat Warmup-1 endUp solution
 * Given a string, return a new string where the last 3 chars are upper case.
 * If the string has less than 3 chars, uppercase whatever is there.
 *
 * @author: Cole Cianflone
 * Date: Jan 7th, 2022
 */

public class endUp
{
	public static void main(String[] args)
	{
		String userInput;
		// title
		System.out.println("=====================\n"+
                       "  endUp - CodingBat\n"+
                       "=====================\n"+
                       "Will return string where last 3 chars are uppercase\n");

		// input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter in a string, any string: ");
		userInput = sc.nextLine();

		// Method invocation
		System.out.println(endUp(userInput));
	}

	/**
	 * If string is less than or equal to 3, return string all uppercase
	 * Stores last three characters and front characters, then returns
	 * concatenated front and back String with the back all uppercase.
	 * @param String str
	 * @return front + back.toUpperCase();
	 */
	public static String endUp(String str)
	{
		if(str.length() <= 3)
			return str.toUpperCase();

		int lastThree = str.length() - 3;
		String front = str.substring(0, lastThree);
		String back = str.substring(lastThree);

		return front + back.toUpperCase();
	}
}
