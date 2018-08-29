import java.util.*;

    
// Rahul and Ankit are the only two waiters in 
// Royal Restaurant. Today, the restaurant 
// received N orders. The amount of tips may differ 
// when handled by different waiters, if Rahul takes 
// the ith order, he would be tipped Ai rupees and if 
// Ankit takes this order, the tip would be Bi rupees.
// In order to maximize the total tip value they 
// decided to distribute the order among themselves. 
// One order will be handled by one person only. 
// Also, due to time constraints Rahul cannot take 
// more than X orders and Ankit cannot take more than 
// Y orders. It is guaranteed that X + Y is greater 
// than or equal to N, which means that all the orders 
// can be handled by either Rahul or Ankit. Find out 
// the maximum possible amount of total tip money after 
// processing all the orders.

// https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/
// https://www.geeksforgeeks.org/first-non-repeating-character-using-one-traversal-of-string-set-2/
public class Main {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        // get the input for the number of test cases
        int numberTestCases = in.nextInt();

        String line2 = in.next();

        String line3 = in.next();

        // System.out.println("helo");
        String line4 = in.next();

        int i = 0;

        System.out.println("this is line2 " +line2);
        System.out.println(line2.charAt(0));
        System.out.println(line2.charAt(1));
        System.out.println(line2.charAt(2));

        // get the number of orders the restaurant received
        char n = line2.charAt(0);

        // get X orders for rahul
        char x = line2.charAt(1);

        // get the y orders for amkit
        char y = line2.charAt(2);

        // System.out.println(n + "," + x + "," + y);
        
        // ArrayList<Integer> integers = new ArrayList<Integer>();
        
        // int temp;

        // for(int i = 0; i < n;i++)
        // {
        //     temp = in.nextInt();
        //     integers.add(temp);
        // }
    }
}