public static void main(String[] args)
{
    //Display the menu options, get the user’s choice, and call the required methods to print out the result. Until the user chooses to exit, you should display the menu again.
    boolean exit = false;
    
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
    }
}