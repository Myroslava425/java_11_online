package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TaskOne {
    void ex() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello, enter some text.");
        String ex = reader.readLine();
        /*System.out.println(ex);*/
        char[] ex1 = ex.toCharArray();
        int sum = 0;
        for (char cChar : ex1) {

            int a = (int) cChar;
            if (a >= 48 && a <= 57) {
                //System.out.println(": " + (int)cChar);
                sum = sum + Character.getNumericValue(cChar);
            }
        }
        System.out.println("sum = " + sum);
    }

}






















