import java.util.*;
import java.util.ArrayList;

//   https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1

public class Main{

    // public class Node
    // {
    //     private AnyType data;
    //     private Node<AnyType> next;
    //     public Node(AnyType data, Node<AnyType> next)
    //     {
    //         this.data = data;
    //         this.next = next;
    //     }
    // }

    public static int getMiddleValue(ArrayList<Integer> list)
    {
        int size = list.size();
        int middle;
        int middleValue;

        // if its even 
        if(size == 0)
        {
            middleValue = -1;
        }
        else if(size % 2 == 0)
        {
            middle = (size / 2) + 1;
            middleValue = list.get(middle);
        }
        else 
        {
            middle = (size / 2);
            middleValue = list.get(middle);
        }
        return middleValue;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         ArrayList<Integer> list = new ArrayList<Integer>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);

         System.out.println(getMiddleValue(list));       
    }
}