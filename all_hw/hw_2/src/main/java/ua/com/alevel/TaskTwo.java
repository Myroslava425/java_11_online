package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TaskTwo {
    void exer() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello, enter some text again.");
        String exer = reader.readLine();
        //System.out.println(exer);
        char[] exer1 = exer.toCharArray();
        Arrays.sort(exer1);
        System.out.println(Arrays.toString(exer1));



        }

    }

