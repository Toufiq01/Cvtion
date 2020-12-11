package com.example.cvtion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] apply_in = new String[]{"Mobile", "Backend"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_singlechoice, apply_in);
        AutoCompleteTextView acTextView = (AutoCompleteTextView) findViewById(R.id.apply);
        acTextView.setThreshold(1);
        //Set the adapter
        acTextView.setAdapter(adapter);

    }
}