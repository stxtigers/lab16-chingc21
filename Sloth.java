public class Sloth implements Animal
{
  private static final int numberofLimbs = 4;
  private int weight;
  private int length;
  private int speed;
  private int number;
  private int location;
  private static int count = 0;

  public Sloth(int length1, int weight1)
  {
    length = length1;
    weight = weight1;
    speed = 1;
    number = count;
    count++;
  }

  public String toString()
  {
    String s = "Sloth " + number + ", location " + location;
    return s;
  }

  public String sound()
  {
    String noise = "aahh-eeeeeee";
    return noise;
  }

  public void move(int numberOfSeconds)
  {
    location = location + numberOfSeconds * speed;
  }
}