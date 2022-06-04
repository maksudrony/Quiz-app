package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private String [] questions= {"Java is a person?",
         "Java was introduced in 1233?", "Java was created by using python?",
         "Java has abstract classes?", "Java supports interface?"};
 private boolean [] answers= {false, false, false, true, true};
 TextView question;
 private int score= 0;
 private int index= 0;
 Button yes;
 Button no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes= findViewById(R.id.yes);
        no= findViewById(R.id.no);
        question= findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if the array is not going out of bound
                if (index<=questions.length-1){
                    // if you have given correct answer
                    if (answers[index]==true){
                        score++;
                    }
                    // go to the next question
                    index++;
                    if (index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your Score is " + score + " / " + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if the array is not going out of bound
                if (index<=questions.length-1){
                    // if you have given correct answer
                    if (answers[index]==false){
                        score++;
                    }
                    // go to the next question
                    index++;
                    if (index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your Score is " + score + " / " + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}