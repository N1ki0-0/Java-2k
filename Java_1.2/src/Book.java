public class Book
{
    private int Age;
    private String Name;

    public Book(String n, int i)
    {
        Name = n;
        Age = i;
    }

    public Book(String n)
    {
        Name = n;
        Age = 0;
    }

    public Book(int i)
    {
        Name = "Diary";
        Age = i;
    }

    public int getAge()
    {
        return Age;
    }

    public String getFirm()
    {
        return Name;
    }

    public void setAge(int age)
    {
        Age = age;
    }

    public void setFirm(String firm)
    {
        Name = firm;
    }

    public String toString()
    {
        return Name +", age "+ Age;
    }

}
