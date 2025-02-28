import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Array
{
    public static void main(String[] args)
    {
        //Display the menu options, get the user’s choice, and call the required methods to print out the result. Until the user chooses to exit, you should display the menu again.

        boolean exit = false;
        Scanner in = new Scanner(System.in);
        //prompts the user for array size
        System.out.print("Enter array size: ");
        int size = in.nextInt();
        int[] arr = createArray(size);

        while(!exit){
            System.out.println("Choose the option:\n" +"1-Find the array's minimum\n" + "2-Find the array's maximum\n" + 
            "3-Find the average of the array and compute the differences from average\n" + "4-Find the sum of elements with odd- and even-numbered indexes\n" + "5-Exit");
            int num = in.nextInt();

            if(num == 1){
                System.out.println("Minumum value in array is "+arrayMin(arr));
            }
            else if(num == 2){
                System.out.println("Maximum value in array is "+arrayMax(arr) ); 
            }
            else if(num == 3){
            System.out.println( " Average differences is "+ Arrays.toString(averageDifferences(arr)) ); 
            }
            else if(num == 4){
                findSum(arr);
            }
            else if(num == 5){
                exit = true;
            }
            else{
                System.out.println("Invalid value");
            }
        }
    }

    /**
     * Find the sum of elements with odd- and even-numbered indexes. For example, if the array 
     * is {1, 5, 8, 9, 10, 2, 6}, the sum of the odd indexesis 5 + 9 + 2, and the sum of the
     *  even indexes is 1 + 8 + 10 + 6, assuming indexes start at 0.
     */
    public static void findSum(int[] arr){
        int sumOfEvenNums = 0;
        int sumOfOddNums = 0;
        for( int i = 0 ; i < arr.length ; i++){
            if ( i % 2 == 0) {
                sumOfEvenNums += arr[i];
            }
            else{
                sumOfOddNums += arr[i];
            }
        }
        System.out.println("Sum Of Even Index:" + sumOfEvenNums + " Sum Of Odd Index:" + sumOfOddNums);
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        Random rand = new Random();

        for ( int ind = 0; ind < size; ind++ ) {
            int randNum = rand.nextInt(101);
            array[ind] = randNum;
        }

        return array;
    }
    /*
    Find the average of the array. Display how each element of the array differs from the average. 
    For example, if the array is {2, 6, 9, 3, 5}, and the average is 5, then the differences 
    from the average would be {-3, 1, 4, -2, 0}
    */
    public static double[] averageDifferences(int[] array)
    {
        double sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        double average = sum / array.length;
        double[] differences = new double[array.length];
        for(int j = 0; j < differences.length; j++)
        {
            differences[j] = array[j] - average;
        }
        return differences;
    }
    public static int arrayMax(int[] array)
    {
        int largest = 0;
        
        for(int number : array)
        {
            if(number > largest)
            {
                largest = number;
            }
        }
        return largest;
    }

    public static int arrayMin(int[] array)
    {
        int smallest = 100;

        for(int number : array)
        {
            if(number < smallest)
            {
                smallest = number;
            }
        }
        return smallest;
    }
}