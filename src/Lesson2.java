import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson2 {
    // exercise 1
    static void randomNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Submit min: ");
        int min = scanner.nextInt();
        System.out.println("Submit max: ");
        int max = scanner.nextInt();

        int search = min + random.nextInt(max-min);
        System.out.println("Your's number between " + min + " to " + max + " is " + search + ". ");
    }

    // exercise 2
    static void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Submit min: ");
        int min = scanner.nextInt();
        System.out.println("Submit max: ");
        int max = scanner.nextInt();

        System.out.println("Guess number from " + min + " to " + max );

        int targetNumber = min + random.nextInt(max-min);

        int mark = 0;
        int counter = 0;
        do {
            System.out.println("Submit your's suspicion: ");
            int guessedNumber = scanner.nextInt();
            if (targetNumber == guessedNumber) {
                counter++;
                System.out.println("Gratulation! You guessed by " + counter + " times. ");
                mark = 1;
            } else if (guessedNumber > targetNumber) {
                counter++;
                System.out.println("Your's guess is miss, target number is lower.");
            } else {
                counter++;
                System.out.println("Your's guess is miss, target number is higher.");
            }
        } while (mark != 1);
    }

    // exercise 3
    static void sixNumbersFrom0to49() {

        Random random = new Random();

        int[] tab = new int[6];

        for(int i = 0; i<=5; i++){
            int searchedNumber = random.nextInt(50);
            tab[i] = searchedNumber;
        }
        for (int i=0; i<=5; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    // exercise 4
    static void sixNumbersFrom0to49WithoutDuble() {

        Random random = new Random();
        int sizeTab = 5;
        int[] tab = new int[6];

        for(int i = 0; i<=sizeTab; i++){
            int searchedNumber = 1 + random.nextInt(49);
            // asList - traktuje jako tabele jako liste
            if (Arrays.asList(tab).contains(searchedNumber)){
                i--;
            } else {
                tab[i] = searchedNumber;
            }
        }
        for (int i=0; i<=5; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    // exercise 5
    static void sixNumbersFrom0to49WithoutDubleCollection() {

        Random random = new Random();
        int sizeArrayList = 5;
        ArrayList<Integer> tab = new ArrayList<>(sizeArrayList);

        for (int i = 0; i <= sizeArrayList; i++) {
            int searchedNumber = 1 + random.nextInt(49);
            // if (tab.contains(searchedNumber)) to to samo co if (tab.contains(searchedNumber)==true)
            if (tab.contains(searchedNumber)) {
                i--;
            } else {
                tab.add(searchedNumber);
            }
        }
        for (int i = 0; i <= sizeArrayList; i++) {
            System.out.print(tab.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        sixNumbersFrom0to49WithoutDubleCollection();

    }
}
