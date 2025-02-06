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