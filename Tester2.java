public class Tester2
{
  public static void main(String[] args)
  {
    Employee e = new Employee();
    e.setPayRate(15);
    System.out.println(e.getPayRate());
    e.setLastName("Smith");
    System.out.println(e.getLastName());
    System.out.println(e.toString());
    TechEmployee e2 = new TechEmployee();
    e2.setQual("forklift driver");
    System.out.println(e2.getQual());
    e2.setPayRate(15);
    System.out.println(e.getPayRate());
    e2.setLastName("Smith");
    System.out.println(e.getLastName());
    System.out.println(e2.toString());
    System.out.println(e2.getCount());
  }
}