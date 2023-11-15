public class Author
{
    String name;
    String email;
    char gender;
    public Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        if(gender != 'm' && gender != 'f')
            throw new IllegalArgumentException("Недопустимый пол: "+ gender);
        this.gender = gender;
    }
    public String getName(){return name;}
    public String getEmail(){return email;}
    public char getGender(){return gender;}
    public void setEmail(String email){this.email = email;}
    public String toString()
    {
        return this.name + " (" + this.gender + ") at "+this.email;
    }
}
