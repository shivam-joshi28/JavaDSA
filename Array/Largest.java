import java.util.Scanner;

public class Largest 
{
      // Function for taking input and we have use int[] because we are returning array
      public static int[] takeInput()
      {
        System.out.print("Enter size of the array : ");
          Scanner s = new Scanner(System.in);
          // taking input size
          int size = s.nextInt();
  
          // array initialisation
          int[] arr= new int [size];
  
          // taking array elements from user
          for(int i = 0; i < size; i++)
          {
              System.out.print("Enter element at "+ i + "th index : ");
              arr[i] = s.nextInt();
          }
          return arr;
      }
  
      // function for finding largest no. in an Array
      public static int largest(int arr[])
      {
          int max = Integer.MIN_VALUE; // Integer.Min_value is similiar to -infinity
          
          for(int i=0; i<arr.length; i++)
          {
              if(arr[i] > max)
              {
                  max = arr[i];
              }
          }
          return max;
  
      }
  
      public static void main(String [] args)
      {
          int [] arr = takeInput();
          int lar = largest(arr);
          System.out.println("Largest NO. :");
          System.out.println(lar);
      }
}





  

