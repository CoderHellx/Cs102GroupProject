import java.util.Random;

public static void main(String[] args)
{
    
}

public int[] createArray(int size) {
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
public static int[] averageDifferences(int[] array)
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
}