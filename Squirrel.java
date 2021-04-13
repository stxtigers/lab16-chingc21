public class Squirrel implements Animal
{
  public static final int numberofLimbs = 4;
  protected int weight;
  protected int length;
  protected int speed;
  protected int number;
  protected int location;
  protected static int count = 0;

  public Squirrel(int length1, int weight1)
  {
    length = length1;
    weight = weight1;
    speed = 4;
    location = 0;
    number = count;
    count++;
  }

  public String toString()
  {
    String s = "Squirrel " + number + ", location " + location;
    return s;
  }

  public String sound()
  {
    String noise = "squeak";
    return noise;
  }

  public void move(int numberOfSeconds)
  {
    location = location + numberOfSeconds * speed;
  }
}