package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input --> Home:Visitor|21:9
        String gameScore = input.nextLine();

        // parts[0] = Home:Visitor, parts[1] = 21:9
        String[] parts = gameScore.split("\\|");

        // teams[0] = Home, teams[1] = Visitor
        String[] teams = parts[0].split(":");

        // scores[0] = 21, scores[1] = 9
        String[] scores = parts[1].split(":");

        // Conversion
        int homeScore = Integer.parseInt(teams[0]);
        int visitorScore = Integer.parseInt(teams[1]);

        // Comparision
        if (homeScore > visitorScore) {
            System.out.println("Winner: " + teams[0]);
        } else if (homeScore < visitorScore) {
            System.out.println("Winner: " + teams[1]);
        } else {
            System.out.println("Draw");
        }

        input.close();
    }
}
