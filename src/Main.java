import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Array array = new Array();
        array.setArray();
        array.tinder();
    }
}

class Array
{
    int length;
    int[] Array;

    public void setArray()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        length = scanner.nextInt();

        Array = new int[length];

        System.out.println("Enter the elements of array: ");
        for(int i=0; i<length; i++)
        {
            System.out.print("Element N"+(i+1)+": ");
            Array[i] = scanner.nextInt();
        }

        System.out.println("Following array: ");
        System.out.println(Arrays.toString(Array));
    }

    public void tinder()
    {
        boolean pairFind = false;
        int smallestNumber = Integer.MAX_VALUE;
        int biggestNumber = Integer.MIN_VALUE;

        for(int i=0; i<Array.length; i++)
        {
            for(int j=1; j<Array.length; j++)
            {
                if(Array[i]+Array[j]==0 && Array[i]>biggestNumber)
                {
                    biggestNumber = Array[i];
                    smallestNumber = Array[j];
                    pairFind=true;
                }
            }
        }

        if(pairFind) {System.out.println("Biggest pair: " +biggestNumber + " " + smallestNumber );}
        else System.out.println("Lack of pairs");
    }
}


