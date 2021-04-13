public class Tester
{
  public static void main(String[] args)
  {
    Squirrel s1 = new Squirrel(1, 1);
    s1.move(2);
    System.out.println(s1.toString());
    GreySquirrel gs1 = new GreySquirrel(1, 1);
    gs1.move(2);
    System.out.println(gs1.toString());
    FlyingSquirrel fs1 = new FlyingSquirrel(1, 1);
    fs1.move(2);
    System.out.println(fs1.toString());
    Sloth s2 = new Sloth(1, 1);
    s2.move(2);
    System.out.println(s2.toString());
  }
}