package com.example.jda8301.spellarhyme;

import java.util.List;

public class Student extends Player {

    // fields/instance variables

    // student information
    private School school;
    private Classroom classroom;

    // How to add profile picture???

    // student login
    private int password;

    /**********************************************************************/

    // student data
    private int mostRecentGoldCoins = 0;
    private int mostRecentSilverCoins = 0;

    private int goldCoins = 0;
    private int silverCoins = 0;

    private String lastPlayed = "[CURRENT DATE]";
    private String mostRecentWordSpelled = "No recent activity";
    private String mostRecentScore = mostRecentGoldCoins + "gold coin(s) and " + mostRecentSilverCoins + " silver coin(s)";
    private int wordsSpelled = 0;
    private double percentCorrectOnTheFirstTry = 0.0;
    private String totalCoinsEarned = goldCoins + "gold coin(s) and " + silverCoins + " silver coin(s)";
    private int currentLevel = 1;
    private double currentBalance = goldCoins + 0.5 * ((double) silverCoins); // is this right?

    /**********************************************************************/

    // constructor
    public Student(String firstName, String lastName, School school, Classroom classroom, int password) {
        super(firstName, lastName);

        this.school = school;
        this.classroom = classroom;
        this.password = password;
    }

    // instance methods
    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}