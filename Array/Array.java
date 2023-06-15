import java.util.Scanner;

// Array is collection of  items of same data type at contigous memory location

public class Array
{   
    public static void main(String[] args)
    {
    // to take input we need to use scanner class 
    Scanner s = new Scanner(System.in);

    // taking size of array
    int size = s.nextInt();

    // array initialisation
    int[] arr = new int[size];

    // taking input from User
    for(int i=0 ; i<size; i++)
    {
        System.out.print("Enter element at " + i + "th index : ");
        arr[i] = s.nextInt();
    }

    // Printing array
    System.out.println("Array Element are : ");

    for (int i=0; i < size; i++)
    {
         System.out.print(arr[i]+ " ");
    }

    }
    


}
