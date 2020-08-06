package com.example.cricketscorer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int wicket_A = 0;
    int wicket_B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void six_pointsA(View view) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }

    public void four_pointsA(View view) {
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);
    }

    public void three_PointsA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void two_PointsA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void one_PointA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    public void wicket_A(View view) {
        wicket_A = wicket_A + 1;
        displayWicketsForTeamA(wicket_A);
    }
//for Team B


    public void six_PointsB(View view) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }

    public void four_PointsB(View view) {
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB);
    }

    public void three_ThrowB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void two_PointsB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void one_PointB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    public void wicket_B(View view) {
        wicket_B = wicket_B + 1;
        displayWicketsForTeamB(wicket_B);
    }

    //for Reset the score
    public void reset_Score(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        wicket_B = 0;
        wicket_A = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
        displayWicketsForTeamA(wicket_A);
        displayWicketsForTeamB(wicket_B);
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
     * Displays the given score for Team B.
     */
    public void displayWicketsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_wicket);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayWicketsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_wicket);
        scoreView.setText(String.valueOf(score));
    }
}