package com.example.android.musicquiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    EditText messageEditText;
    private Button changeActivityButton;
    private ImageButton changeActivityButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageEditText = (EditText) findViewById(R.id.userName);
        changeActivityButton = (Button) findViewById(R.id.button4);
        changeActivityButton1 = (ImageButton) findViewById(R.id.imageButton);


        // By clicking on start - sends user to Quiz screen with the name entered
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                String message = messageEditText.getText().toString();
                intent.putExtra("message_key", message);
                startActivity(intent);
            }
        });

        //By clicking on info buton - sends user to info screen
        changeActivityButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(intent);
            }
        });
    }
}
