package com.kuliahdhevan.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstNumber;
    EditText secondNumber;
    TextView resultValue;
    Button addBtn;
    Button subBtn;
    Button divBtn;
    Button mulBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        resultValue = findViewById(R.id.resultValue);
    }

    public void add(View view) {
        int result = Integer.parseInt(firstNumber.getText().toString()) + Integer.parseInt(secondNumber.getText().toString());
        resultValue.setText(String.valueOf(result));
    }

    public void sub(View view) {
        int result = Integer.parseInt(firstNumber.getText().toString()) - Integer.parseInt(secondNumber.getText().toString());
        resultValue.setText(String.valueOf(result));
    }

    public void div(View view) {
        int result = Integer.parseInt(firstNumber.getText().toString()) / Integer.parseInt(secondNumber.getText().toString());
        resultValue.setText(String.valueOf(result));
    }


    public void mul(View view) {
        int result = Integer.parseInt(firstNumber.getText().toString()) * Integer.parseInt(secondNumber.getText().toString());
        resultValue.setText(String.valueOf(result));
    }
}