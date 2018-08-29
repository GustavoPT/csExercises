import java.util.*;

// https://practice.geeksforgeeks.org/problems/maximum-height-of-the-staircase/0

public class SquireBlocks{

    public static void main(String[] args) 
    {

        Scanner in = new Scanner(System.in);

        System.out.println("Please input number of test cases");
        int testCases = in.nextInt();

        int i;
        int temp;

        ArrayList<Integer> a = new ArrayList<Integer>();

        System.out.println("Please input the numbers ");

        for(i = 0; i < testCases;i++)
        {
            temp = in.nextInt();
            a.add(temp);
        }

        for(i = 1; i <= testCases;i += i)
        {
            System.out.println(i);
        }

    }
}