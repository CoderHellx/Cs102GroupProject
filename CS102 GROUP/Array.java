public static void main(String[] args)
{
    //Display the menu options, get the user’s choice, and call the required methods to print out the result. Until the user chooses to exit, you should display the menu again.
    boolean exit = false;
    
<<<<<<< HEAD
    while(!exit){
        System.out.println("Choose the option:\n" +"1-Find the array's minimum\n" + "2-Find the array's maximum\n" + 
        "3- Find the average of the array\n" + "4-Find the sum of elements with odd- and even-numbered indexes\n" + "5-Exit");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println();
        if(num == 1){

        }
        else if(num == 2){

        }
         else if(num == 3){

        }
         else if(num == 4){

        }
        else if(num == 5){
            exit = true;
        }
        else{
            System.out.println("Unvalid value");
        }
=======
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
>>>>>>> 3a424b3b482a9c051731cb2a1c9d43045294ef95
    }
}