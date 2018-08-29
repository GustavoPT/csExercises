package Patterns.Observer;

import java.util.ArrayList;
import java.util.Observer;

public class StockGrabber implements Subject
{

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber()
    {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver)
    {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver)
    {
        int observerIndex = observers.indexOf(deleteObserver);
        
        System.out.println("Observer " + (observerIndex + 1) + " deleted");

        observers.remove(deleteObserver);
    }

    @Override
    public void notifyObserver()
    {

        for(Observer observer: observers){
//            observer.update(ibmPrice,aaplPrice,googPrice);
        }
    }

    public void setIbmPrice(double newIBMPrice)
    {
        this.ibmPrice = newIBMPrice;

    }
}
