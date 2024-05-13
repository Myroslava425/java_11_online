package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operations {
    void start() throws IOException {
        System.out.println("Welcome to Calculator!!!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = null;
        menu();
        while ((text = reader.readLine()) !=null){
            toOperations(text, reader);
            menu();

        }
    }
    void menu(){
        System.out.println("If you want to find plus please enter 1");
        System.out.println("If you want to find minus please enter 2");
        System.out.println("If you want to find multiplied please enter 3");
        System.out.println("If you want to find divided please enter 4");
        System.out.println("If you want to find percent please enter 5");
        System.out.println("If you want to find factorial please enter 6");
        System.out.println("If you want to find power please enter 7");
        System.out.println("If you want to exit please enter 8");
    }
    void  toOperations (String text, BufferedReader reader) throws IOException {
        switch (text) {
            case "1" -> plus(reader);
            case "2" -> minus(reader);
            case "3" -> multiplied(reader);
            case "4" -> divide(reader);
            case "5" -> percent(reader);
            case "6" -> factorial(reader);
            case "7" -> power(reader);
            case "8" -> System.exit(0);

        }


    }
    void plus(BufferedReader reader) throws IOException {
        System.out.println("Please, enter a first number.");
        int firstNumber = Integer.parseInt(reader.readLine());
        System.out.println("Please, enter a second number.");
        int secondNumber = Integer.parseInt(reader.readLine());
        int plus = firstNumber + secondNumber;
        System.out.println("The sum of the numbers is " + plus + ".");

    }
    void minus(BufferedReader reader) throws IOException {
        System.out.println("Please, enter a first number.");
        int firstNumber = Integer.parseInt(reader.readLine());
        System.out.println("Please, enter a second number.");
        int secondNumber = Integer.parseInt(reader.readLine());
        int minus = firstNumber - secondNumber;
        System.out.println("The difference between the numbers is " + minus + ".");

    }
    void multiplied(BufferedReader reader) throws IOException {
        System.out.println("Please, enter a first number.");
        int firstNumber = Integer.parseInt(reader.readLine());
        System.out.println("Please, enter a second number.");
        int secondNumber = Integer.parseInt(reader.readLine());
        int multiplied = firstNumber * secondNumber;
        System.out.println("The multiplication of the numbers is " + multiplied + ".");

    }
    void divide(BufferedReader reader) throws IOException {
        System.out.println("Please, enter a first number.");
        int firstNumber = Integer.parseInt(reader.readLine());
        System.out.println("Please, enter a second number.");
        int secondNumber = Integer.parseInt(reader.readLine());
        int divide = firstNumber / secondNumber;
        System.out.println("The divided of the numbers is " + divide + ".");

    }
    void percent(BufferedReader reader) throws IOException {
        System.out.println("Please, enter a number.");
        int firstNumber = Integer.parseInt(reader.readLine());
        System.out.println("Please, enter a number from which we will find the percentage indicated earlier.");
        int secondNumber = Integer.parseInt(reader.readLine());
        int percent = firstNumber * secondNumber / 100;
        System.out.println("The divided of the numbers is " + percent + ".");

    }
    void factorial(BufferedReader reader ) throws IOException {
        System.out.println("Please, enter a number.");
        int firstNumber = Integer.parseInt(reader.readLine());
        int factorial = 1;
        for (int i = 1; i <= firstNumber; i ++) {
            factorial*=i;
        }
        System.out.println("The factorial of the numbers is " + factorial + ".");

    }
    void power(BufferedReader reader ) throws IOException {
        System.out.println("Please, enter a first number.");
        int firstNumber = Integer.parseInt(reader.readLine());
        System.out.println("Please, enter the power of the first number.");
        int secondNumber = Integer.parseInt(reader.readLine());
        int power = 1;
        for (int i = 1; i <= secondNumber; i ++) {
            power = power*firstNumber;
        }
        System.out.println(" = " + power + ".");


    }
}
