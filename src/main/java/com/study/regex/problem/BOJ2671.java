package com.study.regex.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2671 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sound = br.readLine();

        String pattern = "(100+1+|01)+";
        System.out.println(sound.matches(pattern) ? "SUBMARINE" : "NOISE");
    }
}
