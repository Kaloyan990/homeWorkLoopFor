
import java.util.Scanner;


public class javaTasks {
    public static void main(String[] args) {

        productOfTwoNumbers(); // Task1ForStatement
        System.out.println(productOfTwoNumbers());

        printMinAndMaxNumbers(); //TASK 2
        printTriangle(); //Task3
        printMatrixOfNumbers(); // TASK 4
        isDivideTo5And3WithoutRemainder(); //TASK 5
        isEvenAndDivideBy4WithoutRemainder(); //TASK 6

    }

    private static void isEvenAndDivideBy4WithoutRemainder() {
        int numberFromTask6 = 1000000;

        for (int allNumbers = 0; allNumbers <= numberFromTask6; allNumbers++) {
            if (allNumbers % 2== 0 && allNumbers % 4 == 0) {
                System.out.println("Numbers that are even and divisible by 4: " + allNumbers);
            }
        }
    }

    private static void isDivideTo5And3WithoutRemainder() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number you want: ");
        int numberFromConsole = console.nextInt();

        for (int numbers = 0; numbers <= numberFromConsole; numbers++) {
            if (numbers % 5 == 0 && numbers % 3 == 0) {
                System.out.println(numbers + " Is divisible by 5 and 3 without remainder");
            }
        }
    }

    private static void printMatrixOfNumbers() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of rows in matrix: ");
        int numbers = console.nextInt();

        for (int row = 1; row <= numbers; row++)
        {
            for (int column = row; column <= row + numbers - 1; )
            {
                System.out.print(column);
                column++;
            }
            System.out.println();

        }

        System.out.println();

    }

    private static void printTriangle() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = console.nextInt();

        for (int numbersOfRows = 1; numbersOfRows <= rows; numbersOfRows++) {


            for (int spacesBeforeStars = rows; spacesBeforeStars >= numbersOfRows; spacesBeforeStars--) {
                System.out.print(" ");
            }


            for (int numbersOfStarsInEachRow = 1; numbersOfStarsInEachRow <= numbersOfRows; numbersOfStarsInEachRow++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    private static int printMinAndMaxNumbers() {
        Scanner console = new Scanner(System.in);
        System.out.println("Numbers of arguments needed: ");
        int numbersFromConsole = console.nextInt();
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        System.out.printf("Please enter %d numbers %n", numbersFromConsole);
        for (int i = 0; i < numbersFromConsole; i++)
        { int current = console.nextInt();
            if (current > largest)
            { largest = current; }
            if (current < smallest)
            { smallest = current; } }
        System.out.println("largest of N number is : " + largest);
        System.out.println("smallest of N number is : " + smallest);

        return numbersFromConsole;
    }

    private static int productOfTwoNumbers() {
        int product = 1;
        for (int counter = 5; counter <= 10; counter++) {
            product = product * counter;
        }
        return product;
    }
}