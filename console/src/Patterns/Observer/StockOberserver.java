package Patterns.Observer;

public class StockOberserver implements Observer
{

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;
    private int observerID;
    private Subject stockGrabber;


    public StockOberserver(Subject stockGrabber)
    {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
    }

    @Override
    public void update(double ibmPrice,double aaplPrice,double googPrice)
    {

    }

}
