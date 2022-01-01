package Java;
/** Simple program to simulate a droid. Codecademy Project: Learn Java - Build A Droid
 * Purpose: Demonstrate understanding of invoking and declaring methods
 *
 * @Author: Cole Cianflone
 * Date: Dec 22nd, 2021
 */
public class Droid {

    int batteryLevel;
    String name;

    /**
     * Droid constructor
     * @param name
     */
    public Droid(String name)
    {
      this.name = name;
      batteryLevel = 100;
    }

    /**
     * Perform task method, prints out name + " is performing: " + task,
     * and depletes batteryLevel by 10
     * @param task
     */
    public void performTask(String task)
    {
      System.out.println(name + " is performing: " + task);
      batteryLevel -= 10;
    }
    
    /**
     * Returns energyReport, prints out name + "'s battery is currently at: " + batteryLevel.
     * @return name + "'s battery is currently at: " + batteryLevel
     */
    public String energyReport()
    {
      return name + "'s battery is currently at: " + batteryLevel;
    }
    
    /**
     * Perform energyTransfer, transfers power to another Droid object,
     * and depletes amount of power transferd from invoked Droid object.
     * @param power
     * @param Droid 
     */
    public void energyTransfer(int power, Droid transferTo)
    {
      batteryLevel -= power;
      transferTo.batteryLevel += power;
    }
    
    /**
     * Returns strin representation of Droid object.
     * @return "Hello, I'm the droid: " + name
     */
    public String toString()
    {
      return "Hello, I'm the droid: " + name;
    }

    public static void main(String[] args)
    {
      // 2 new droid objects
      Droid droid01 = new Droid("Codey");
      Droid droid02 = new Droid("Cole");

      // testing methods
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
