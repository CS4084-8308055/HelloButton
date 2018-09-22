package com.example.david_w_beck.hellobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCounter = 0;
    private TextView mMessageTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // This method is called when the app launches
        // Do not change these lines
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Code to be added here
        mMessageTextView = findViewById(R.id.message_textview);

        final Button resetButton = findViewById(R.id.reset_button);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter = 0;
                updateView();
            }
        });

        //mMessageTextView.setText("Changed");
        //Log.d("HB", "This is a logcat log. Logs are important!");

        // Example crash
        //mMessageTextView = findViewById(0);
        //mMessageTextView.setText("This will crash");
    }

    public void handleDecrement(View view) {
        mCounter --;
        updateView();
    }

    public void handleIncrement(View view) {
        mCounter ++;
        updateView();
    }

    private void updateView() {
        if (mCounter > 10){
            mMessageTextView.setVisibility(View.INVISIBLE);
        }
        else {
            mMessageTextView.setVisibility(View.VISIBLE);
            mMessageTextView.setText(getString(R.string.message_format, mCounter));
        }
    }
}
