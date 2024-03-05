import java.util.Scanner;
public class array{
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        final int ARRAY_SIZE = 21;
        int[] arrayNumber = new int[ARRAY_SIZE];
        int highestNumber = 0; int lowestNumber = 2147483647; int numberLoop = 0; int loopCounter = 0;
        double averageArrayNumbers = 0; double arrayTotal = 0;

        System.out.println("Welcome to the array number storage machine");
        System.out.println("Enter the value of your number (enter -1 to stop)");

        for (int i = 1; i < ARRAY_SIZE; i++){

            System.out.printf("please enter the value of array number " + i + ": ");
            numberLoop = keyboard.nextInt();
            keyboard.nextLine();

            if (numberLoop != -1 && i <= 21){

                arrayNumber[i] = numberLoop;

                if (arrayNumber[i] > highestNumber){
                    highestNumber = arrayNumber[i];
                }
                
                if (arrayNumber[i] < lowestNumber){
                    lowestNumber = arrayNumber[i];
                }

                arrayTotal += arrayNumber[i];
                loopCounter++;
                averageArrayNumbers = arrayTotal / loopCounter;

                } else {
                i = 20;
            }
        }

        System.out.println("\nThe highest number you input was: " + highestNumber);
        System.out.println("The lowest number you input was: " + lowestNumber);
        System.out.printf("The total average of all the numbers was %.2f", averageArrayNumbers);
        System.out.println("\nHere are the numbers you entered in reverse order:");

        for (int k = 20; k >= 0; k--) {
            if (!(arrayNumber[k] == 0)) {
                System.out.printf(arrayNumber[k] + ", ");
            }
        }
        
        System.out.println("\nIn the great words of Porky Pig");
        System.out.println("Th-Th-Thats All Folks!");
        keyboard.close();
    }
}
