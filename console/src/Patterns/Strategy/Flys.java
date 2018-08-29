package Patterns.Strategy;

public interface Flys
{
    String fly();
}

class ItFlys implements Flys
{

    public String fly()
    {
        return "Flying high";
    }
}

class CantFly implements Flys
{

    public String fly()
    {
        return "Can't fly";
    }
}