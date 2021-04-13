public class TechEmployee extends Employee
{
  protected String qual;
  public TechEmployee()
  {
    super();
    qual = "";
  }

  public void setQual(String ql)
  {
    qual = ql;
  }

  public String getQual()
  {
    return qual;
  }

  public String toString()
  {
    String str = lastName + ", " + qual + ", earning $" + payRate + " per hour";
    return str;
  }

  public void setPayRate(double pr)
  {
    payRate = pr * 2;
  }

  

}