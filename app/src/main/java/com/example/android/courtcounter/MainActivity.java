package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 points  for Team A.
     */
    public void addThreePoints(View view) {
        displayForTeamA(3);
    }

    /**
     * Adds 2 points  for Team A.
     */
    public void addTwoPoints(View view) {
        displayForTeamA(2);
    }

    /**
     * Adds 1 points  for Team A.
     */
    public void addOnePoint(View view) {
        displayForTeamA(1);
    }
}
