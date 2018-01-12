package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.scorekeeperapp.R.drawable.foul;

public class HandballActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;
    // Tracks the score for Team B
    int scoreTeamB = 0;
    // Tracks the fouls for Team A
    int foulTeamA = 0;
    // Tracks the fouls for Team B
    int foulTeamB = 0;
    // Tracks the exclusions for Team A
    int exclusionTeamA = 0;
    // Tracks the exclusions for Team B
    int exclusionTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handball);
    }


    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Increase the number of 2min suspensions for Team A by 1 point.
     */
    public void addFoulForTeamA(View v) {
        foulTeamA =foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }
    /**
     * Increase the number of exclusions for Team A by 1 point.
     */
    public void addExclusionForTeamA(View v) {
        exclusionTeamA = exclusionTeamA + 1;
        displayExclusionForTeamA(exclusionTeamA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Increase the number of 2min suspensions for Team B by 1 point.
     */
    public void addFoulForTeamB(View v) {
        foulTeamB =foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }
    /**
     * Increase the number of exclusions for Team B by 1 point.
     */
    public void addExclusionForTeamB(View v) {
        exclusionTeamB = exclusionTeamB + 1;
        displayExclusionForTeamB(exclusionTeamB);
    }

    /**
     * Resets the score, suspensions and exclusions for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA  = 0;
        foulTeamB  = 0;
        exclusionTeamA = 0;
        exclusionTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
        displayExclusionForTeamA(exclusionTeamA);
        displayExclusionForTeamB(exclusionTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays suspensions for Team A.
     */
    public void displayFoulForTeamA(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * Displays suspensions for Team B.
     */
    public void displayFoulForTeamB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));
    }
    /**
     * Displays exclusions for Team A.
     */
    public void displayExclusionForTeamA(int exclusion) {
        TextView exclusionView = (TextView) findViewById(R.id.team_a_exclusion);
        exclusionView.setText(String.valueOf(exclusion));
    }

    /**
     * Displays exclusions for Team B.
     */
    public void displayExclusionForTeamB(int exclusion) {
        TextView exclusionView = (TextView) findViewById(R.id.team_b_exclusion);
        exclusionView.setText(String.valueOf(exclusion));
    }


}
