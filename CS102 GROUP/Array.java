public static void main(String[] args)
{
    
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
    System.out.println("Sum Of Even Numbers:" + sumOfEvenNums + "Sum Of Odd Numbers:" + sumOfOddNums);
}