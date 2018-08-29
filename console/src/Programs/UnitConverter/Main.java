package Programs.UnitConverter;
import java.util.*;


// Unit Converter (temp, currency, volume, mass and more) –
// Converts various units between one another.
// The user enters the type of unit being entered,
// the type of unit they want to convert to
// and then the value. The program will
// then make the conversion.

public class Main {


    public static void displayOptions()
    {
        System.out.println("Welcome to unit converter!!");
        System.out.println("Enter the type of units that you would like to convert!!");
        System.out.println("v) volume t) temp c) currency m) mass");
    }

    public static void celsiusToFarenheight(double celsius)
    {

    }

    public static void displayTemperatureOptions()
    {
        System.out.println("Which do you want?");
        System.out.println("1)Do you want to convert celsius to farenheight?");
        System.out.println("2)Do you want to convert fareheight to celsius?");
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        displayOptions();
        int volume = 0;
        int temperature = 0;
        int currency = 0;
        int mass = 0;

        String input = in.nextLine();
        char letter;

        if(input.length() > 1)
        {
            System.out.println("It seems that you did not input a letter");
        }
        else
        {
            // Check what letter
            letter = input.charAt(0);

            switch (letter){
                case 'v':
                    System.out.println("You want to convert volume?");
                    volume = 1;
                    break;
                case 't':
                    System.out.println("You want to convert temperature?");
                    temperature = 1;
                    break;
                case 'c':
                    System.out.println("You want to convert currency?");
                    currency = 1;
                    break;
                case 'm':
                    System.out.println("You want to convert mass?");
                    mass = 1;
                    break;
            }
        }


        int response = 0;

        if(temperature == 1)
        {
            displayTemperatureOptions();
            response = in.nextInt();
        }

        if(response == 1)
        {
            System.out.println("You want to convert celsius to fareheight");
        }
        else
        {
            System.out.println("You want to convert fareheight to celsius");
        }
    }
}
