package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;



public class TaskTwo {

    public static void exer() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello, enter some text again.");
        String input = bufferedReader.readLine().replaceAll("[^a-zA-Z]", "");

        char[] array = input.toCharArray();
        Arrays.sort(array);
        System.out.println(array);

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }

            }
            System.out.println(array[i] + "-" + counter);
            counter = 0;
        }
    }
}





/*public class TaskTwo {
    void exer() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello, enter some text again.");
        String exer = reader.readLine();
        //System.out.println(exer);
        char[] exer1 = exer.toCharArray();
        Arrays.sort(exer1);
        System.out.println(Arrays.toString(exer1) + " and press the key Enter, please.");
        }
    }*/

