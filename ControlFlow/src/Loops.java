import java.util.Scanner;

public class Loops {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayEverything() {
        Main.displayBreak("Loops");
        Main.displayBreak("For loop");
        forLoop();

        Main.displayBreak("While loop");
        whileLoop();

        Main.displayBreak("Do while loop");
        doWhileLoop();

        Main.displayBreak("Break and continue");
        breakAndContinue();

        Main.displayBreak("For each loop");
        forEachLoop();
    }

    private static void forLoop() {
        for (int i = 0; i < 5; i++)
            System.out.println("Hello World!");
    }

    private static void whileLoop() {
       String input = "";

       while (!input.equals("quit")) {
           input = provideInput();
           System.out.println(input);
           input = input.toLowerCase();
       }
    }

    private static String provideInput() {
        System.out.print("Provide some input (quit to leave): ");
        return scanner.nextLine();
    }

    private static void doWhileLoop() {
        int i = 0;

        do { // at least once
            System.out.println("Hello World!");
            i++;
        } while (i < 0);
    }

    private static void breakAndContinue() {
        String input;

        while (true) {
            input = provideInput();
            input = input.toLowerCase();

            if(input.equals("pass"))
                continue;

            if(input.equals("quit"))
                break;

            System.out.println(input);
        }
    }

    private static void forEachLoop() {
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
