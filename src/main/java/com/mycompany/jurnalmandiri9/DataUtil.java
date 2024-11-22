package com.mycompany.jurnalmandiri9;

import java.util.Scanner;

public class DataUtil {
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int input;

        input = scanner.nextInt();
        
        return input;
    }

    public static String getStringInput() {
        Scanner scanner = new Scanner(System.in);
        String input;

        input = scanner.nextLine();
        
        return input;
    }
}
