package Java;

/** Simple program to simulate a droid. Codecademy Project: Learn Java - Build A Droid
 * Purpose: Demonstrate understanding of invoking and declaring methods
 * Author: Cole Cianflone
 * Date: Dec 22nd, 2021
 */

public class Droid {

    int batteryLevel;
    String name;

    public Droid(String name)
    {
      this.name = name;
      batteryLevel = 100;
    }

    public void performTask(String task)
    {
      System.out.println(name + " is performing: " + task);
      batteryLevel -= 10;
    }

    public String energyReport()
    {
	    return name + "'s battery is currently at: " + batteryLevel;
	  }

    public void energyTransfer(int power, Droid transferTo)
    {
      batteryLevel -= power;
      transferTo.batteryLevel += power;
    }

    public String toString()
    {
      return "Hello, I'm the droid: " + name;
    }

    public static void main(String[] args)
    {
      Droid droid01 = new Droid("Codey");
      Droid droid02 = new Droid("Cole");

      System.out.println(droid01);
      droid01.performTask("Mopping floor");
      System.out.println(droid01.energyReport());

      System.out.println(droid02);
      System.out.println(droid02.energyReport());

      droid01.energyTransfer(-10, droid02);
      System.out.println(droid02.energyReport());
      System.out.println(droid01.energyReport());

    }
  }
