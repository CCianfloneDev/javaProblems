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

	/**
	 * TransitCalculator constructor
	 * @param int numberOfDays, int numberOfRides
	 */
	TransitCalculator(int numberOfDays, int numberOfRides)
	{
		this.numberOfDays = numberOfDays;
		this.numberOfRides = numberOfRides;
	}

	/**
	 * Calculates and returns prices of 7dayUnlimtedRidePass
	 * @returns double price per ride with 7dayUnlimtedRidePass
	 */
	double unlimited7Price()
	{
		double multipler = Math.ceil((double) numberOfDays / 7);
		return (double)( farePrices[1] * multipler ) / numberOfRides;
	}

	/**
	 * Calculates and returns prices of 30dayUnlimtedRidePass
	 * @returns double price per ride with 30dayUnlimtedRidePass
	 */
	double unlimited30Price()
	{
		double multipler = Math.ceil((double) numberOfDays / 30);
		return ( farePrices[2] * multipler ) / numberOfRides;

	}

	/**
	 * makes new double[] array and stores the ride prices
	 * @return double[] array of prices
	 */
	double[] getRidePrices()
	{
		double[] prices = {farePrices[0] * numberOfDays,
				   unlimited7Price(),
				   farePrices[2]};
		return prices;
	}
	
	/**
	 * Finds best fare price
	 * @return String "You should get the " + fareOption + " option at $" + ridePrice + " per ride.";
	 */
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
