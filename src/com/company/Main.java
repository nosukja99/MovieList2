package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String movieTitle;
        ArrayList<String> movieTitles = movieTitles = new ArrayList<>();
        BufferedReader bfr= new BufferedReader(new InputStreamReader(System.in));
        boolean answer;
        String inAnswer;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your favorite movie name.");
        movieTitle = bfr.readLine();
        movieTitles.add(movieTitle);

        System.out.println("Do you want add more movie? <Y/y> Or not input <Q/q>");
        inAnswer = scanner.next().toLowerCase();

        if (inAnswer.equals("q"))
            answer = false;
        else
            answer = true;

        while(answer==true)
        {
            System.out.println("Please enter your favorite movie name.");
            movieTitle = bfr.readLine();
            boolean result;
            result= Contains(movieTitles, movieTitle);
            if (result == false)
            {
                movieTitles.add(movieTitle);
            }
            else
            {
                System.out.println("The movie already existed.");
            }
            System.out.println("Do you want add more movie? <Y/y> Or not input <Q/q>");
            inAnswer = scanner.next().toLowerCase();
            if (inAnswer.equals("q"))
                answer = false;
            else
                answer = true;
        }
        for (int y = 0; y < movieTitles.size(); y++) {
            System.out.println(movieTitles.get(y));
        }
    }

    public static boolean Contains(ArrayList<String> list, String name)
    {
        for (int i=0; i<list.size();i++)
        {
           if(name.equalsIgnoreCase(list.get(i)))
            {
                return true;
            }
        }
        return false;
    }
}

