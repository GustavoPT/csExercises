import java.util.*;

public class MinimumFlips{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String input = in.nextLine();
        int[] nums = {1,0,1,1,0,0,0,1};
        int n = findMinFlip(nums);
        System.out.println(n);
    }

    public static int findMinFlip(int[] nums)
    {
        int n = nums.length;
        String s = "";
        for(int i = 0; i < n; i++)
        {
            s += nums[i];
        }

        long num = Integer.parseInt(s,2);

        int minXor = n;

        long mask = (1 << (n - 1));

        while(n-1 > 0)
        {
            long temp = (num ^ mask);

            minXor = Math.min(minXor,countones(temp));
            n--;
            mask = (mask | (1 << n));
        }

        return minXor;
    }

    public static int countones(long n)
    {
        int c = 0;
        while(n > 0){
            n = n & (n-1);
            c++;
        }
        return c;
    }

}