public class Employee
{
  protected String lastName;
  protected double payRate;
  protected static int count = 0;
  protected int number;

  public Employee()
  { 
    lastName = "";
    payRate = 0;
    number = count;
    count++;
  }

  public void setLastName(String name)
  {
    lastName = name;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setPayRate(double pr)
  {
    payRate = pr;
  }

  public double getPayRate()
  {
    return payRate;
  }

  public String toString()
  {
    String str = lastName + ", earning $" + payRate + " per hour";
    return str;
  }

  public static int getCount()
  {
    return count;
  }
}