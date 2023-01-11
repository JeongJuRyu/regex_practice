package com.study.regex.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BOJ1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        while(!s.equals("#")){
            Matcher matcher = pattern.matcher(s);
            int cnt = 0;
            while(matcher.find()){
                cnt++;
            }
            System.out.println(cnt);
            s = br.readLine();
        }
    }
}
