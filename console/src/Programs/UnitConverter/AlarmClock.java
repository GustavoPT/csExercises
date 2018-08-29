package Programs.UnitConverter;

public class AlarmClock {
    // Alarm Clock – A simple clock where it plays a sound after X number of minutes/seconds or at a particular time.
    // TODO: Check best way to determine when to set the timer off and whether to put the in their own methods
    public static void main(String[] args)
    {

        displayOptions();
        long startTime = System.currentTimeMillis();
        long elapsedTime = getElapsedTime(startTime);
        long elapsedSeconds = getElapsedSeconds(elapsedTime);
        long elapsedMinutes = getElapsedMinutes(elapsedSeconds);

        System.out.println("elapsed time(seconds)" + elapsedSeconds);
    }

    public static void displayOptions()
    {
        System.out.println("Welcome to the timer");
        System.out.println("m)Do you want to wait for the timer in minutes?");
        System.out.println("s)Do you want to wait for the timer in seconds?");
    }

    public static long getElapsedTime(long startTime)
    {
        long elapsedTime = System.currentTimeMillis() - startTime;
        return elapsedTime;
    }

    public static long getElapsedSeconds(long elapsedTime)
    {
        long elapsedSeconds = elapsedTime / 1000;
        return elapsedSeconds;
    }

    public static long getSecondsDisplay(long elapsedSeconds)
    {
        long secondsDisplay = elapsedSeconds % 60;
        return secondsDisplay;
    }

    public static long getElapsedMinutes(long elapsedSeconds)
    {
        return elapsedSeconds / 60;
    }
}
