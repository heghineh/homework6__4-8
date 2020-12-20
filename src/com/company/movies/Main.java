package com.company.movies;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        Movie[] movies = new Movie[10];
        System.out.println("Enter the titles of movies:");

        for (int i = 0; i < movies.length; i++) {
            System.out.print("[" + (i + 1) + "] --> ");
            String name = scanner.nextLine();
            Movie movie = new Movie(name, random.nextInt(11));
            movies[i] = movie;
        }

        for (int i = 0; i < movies.length; i++) {
            System.out.println("Title: " + movies[i].getTitle() + "  Rating:  " + movies[i].getRating());
        }

        System.out.println();

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getRating() >= 8)
                System.out.println("Title: " + movies[i].getTitle() + "  Rating:  " + movies[i].getRating());
        }
    }
}