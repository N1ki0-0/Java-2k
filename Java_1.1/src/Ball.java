import java.lang.*;
public class Ball
{
    private int Age;
    private String Firm;

    public Ball(String n, int i)
    {
        Firm = n;
        Age = i;
    }

    public Ball(String n)
    {
        Firm = n;
        Age = 0;
    }

    public Ball(int i)
    {
        Firm = "abibas";
        Age = i;
    }

    public int getAge()
        {
            return Age;
        }

    public String getFirm()
    {
        return Firm;
    }

    public void setAge(int age)
    {
        Age = age;
    }

    public void setFirm(String firm)
    {
        Firm = firm;
    }

    public String toString()
    {
        return Firm +", age "+ Age;
    }

}
