package com.example.android.musicquiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
    RadioButton answer1q1, answer2q1, answer3q1, answer4q1;
    String selectedAnswer;
    Button submit;
    int score = 0;
    int points;
    TextView messageTextView;
    private Button changeActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        messageTextView = (TextView) findViewById(R.id.tvMessage);
        changeActivityButton = (Button) findViewById(R.id.submit);

        //Click on submit button - shows toast message with score, resets score,
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                allQuestions();
                Toast.makeText(QuizActivity.this, "Correct Answers: " + score + "/5",
                        Toast.LENGTH_LONG).show();
                resetScore();

            }
        });


        String message = "Hi " + getIntent().getStringExtra("message_key") + "!";

        messageTextView = (TextView) findViewById(R.id.tvMessage);
        messageTextView.setText(message);

    }

    // Check if right answer is selected for question one, if yes +1 score
    private void question1Answer() {
        RadioButton answer3 = (RadioButton) findViewById(R.id.answer3q1);
        boolean question1answer3Checked = answer3.isChecked();
        if (question1answer3Checked) {
            score += 1;
        }
    }

    // Check if right answer is selected for question two, if yes +1 score
    private void question2Answer() {
        RadioButton answer2 = (RadioButton) findViewById(R.id.answer2q2);
        boolean question2answer2Checked = answer2.isChecked();
        if (question2answer2Checked) {
            score += 1;
        }
    }

    // Check if right answer is selected for question three, if yes +1 score
    private void question3Answer() {
        RadioButton answer4 = (RadioButton) findViewById(R.id.answer4q3);
        boolean question3answer4Checked = answer4.isChecked();
        if (question3answer4Checked) {
            score += 1;
        }
    }

    // Check if right answer is selected for question four, if yes +1 score
    private void question4Answer() {
        RadioButton answer1 = (RadioButton) findViewById(R.id.answer1q4);
        boolean question4answer1Checked = answer1.isChecked();
        if (question4answer1Checked) {
            score += 1;
        }
    }

    // Check if right answer is selected for question five, if yes +1 score
    private void question5Answer() {
        RadioButton answer2 = (RadioButton) findViewById(R.id.answer2q5);
        boolean question5answer2Checked = answer2.isChecked();
        if (question5answer2Checked) {
            score += 1;
        }
    }

    //Sums up the question checks
    public void allQuestions() {
        question1Answer();
        question2Answer();
        question3Answer();
        question4Answer();
        question5Answer();
    }

    //resets score
    private void resetScore() {
        score = 0;
    }
}
