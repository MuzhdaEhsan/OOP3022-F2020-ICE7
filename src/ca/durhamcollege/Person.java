package ca.durhamcollege;

public class Person
{
    // private variables
    private String m_name;
    private int m_age;

    // public properties
    public String getName()
    {
        return m_name;
    }

    public void setName(String m_name)
    {
        this.m_name = m_name;
    }

    public int getAge()
    {
        return m_age;
    }

    public void setAge(int m_age)
    {
        this.m_age = m_age;
    }
    //constructors
    public Person()
    {
        this.m_name = "Unknown";
        this.m_age = 0;
    }

    public Person(String name, int age)
    {
        this.m_name = name;
        this.m_age = age;
    }

    public Person(String name)
    {
        this.m_name = name;
        this.m_age = 0;
    }

    public Person(int age)
    {
        this.m_age = age;
        this.m_name = "Unknown";
    }

    // methods

    /** This method tests the person class and return a simple message to the console
     * @return {Void}
     */
    public  void  saysHello()
    {
        System.out.println(this.m_name + " says Hello!!");
    }
    /**
     *  This method override the built-in toString method and return the Person properties
     * @return {String}
     */
    @Override
    public String toString()
    {
        String outputstring = "";
        outputstring += "Name: " + this.m_name + " ";
        outputstring += "Age: " + this.m_age;
        return outputstring;
    }
}
