package montero.ana.codelinestore.presentation;

import java.util.Scanner;

public class ConsoleBuilder {
    private static final Scanner scanner = new Scanner(System.in);

    public ConsoleBuilder() {
    }

    public static String inputReader(String consoleText) {
        System.out.print(consoleText);
        return scanner.nextLine().toLowerCase().trim();
    }
}