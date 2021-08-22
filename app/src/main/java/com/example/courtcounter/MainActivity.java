package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    int count1 = 0;

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

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void button1(View view) {
        count = count + 3;
        displayForTeamA(count);
    }

    public void button2(View view){
        count = count + 2;
        displayForTeamA(count);
    }

    public void button3(View view){
        count = count + 1;
        displayForTeamA(count);
    }

    public void buttonb1(View view) {
        count1 = count1 + 3;
        displayForTeamB(count1);
    }

    public void buttonb2(View view){
        count1 = count1 + 2;
        displayForTeamB(count1);
    }

    public void buttonb3(View view){
        count1= count1 + 1;
        displayForTeamB(count1);
    }

    public void reset(View view){
        count = 0;
        count1 = 0;
        displayForTeamB(count1);
        displayForTeamA(count);
    }
}