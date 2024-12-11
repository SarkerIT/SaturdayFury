package com.upskill.java_1;

public class MyClass {
    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length > 0) {
            System.out.println("Command-line arguments passed:");
            // Iterate through the arguments and print each one
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command-line arguments passed.");
        }
    }
}
