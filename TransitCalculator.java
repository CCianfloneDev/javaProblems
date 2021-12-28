package Java;
import java.util.Scanner;
/** Codecademy Best Fare Calculator - Java Project
 * Purpose: Demonstrate understanding of methods, arrays, and loops, as per Codecademy project guidelines
 *
 * @Author: Cole Cianflone
 * Date: Dec 27th, 2021
 */
public class TransitCalculator
{
	// fields
	int numberOfDays,
		numberOfRides;

	String[] fareOptions = {"Pay-per-ride (single ride): ",
							"7-day Unlimited Rides: ",
							"30-day Unlimted Rides: "};

	double[] farePrices = {2.75, 33.00, 127.00};

	// constructor
	TransitCalculator(int numberOfDays, int numberOfRides)
	{
		this.numberOfDays = numberOfDays;
		this.numberOfRides = numberOfRides;
	}

	// methods
    double unlimited7Price()
    {
      double multipler = Math.ceil((double) numberOfDays / 7);
      return (double)( farePrices[1] * multipler ) / numberOfRides;
    }

    double unlimited30Price()
    {
      double multipler = Math.ceil((double) numberOfDays / 30);
      return ( farePrices[2] * multipler ) / numberOfRides;

    }

	double[] getRidePrices()
	{
		double[] prices = {farePrices[0] * numberOfDays,
						   unlimited7Price(),
						   farePrices[2]};
		return prices;
	}

    String getBestFare()
    {
      double[] ridePrices = getRidePrices();
      int cheapestIndex = 0;

      for (int i = 0; i < ridePrices.length; i++)
      {
        if (ridePrices[i] < ridePrices[cheapestIndex])
          cheapestIndex = i;
      }
      return "You should get the " + fareOptions[cheapestIndex] +
      		 " option at $" + ridePrices[cheapestIndex] + " per ride.";
    }

	// main testing
	public static void main(String[] args)
	{
		int myRides = 14,
			myDays = 7;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter how many rides you plan to take: ");
		myRides = sc.nextInt();
		System.out.print("Enter how many days you plan to use the pass: ");
		myDays = sc.nextInt();

		TransitCalculator ticket1 = new TransitCalculator(myDays, myRides);

		System.out.println("\n" + ticket1.getBestFare());
	}

}
