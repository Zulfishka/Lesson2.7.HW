package com.geekthech.lesson27hw;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer first, second;

    private Button button2;

    private String sign;

    private Boolean isOperationClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = findViewById(R.id.button2);
        textView = findViewById(R.id.text_view);
        first = Integer.valueOf(textView.getText().toString());

        button2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("key", textView.getText().toString());
            startActivity(intent);
        });
    }

    private void setNumber(String number) {
        if (textView.getText().toString().equals("0") || isOperationClick) {
            textView.setText(number);
        } else {
            textView.append(number);
        }
    }

    @SuppressLint("NonConstantResourceId")
    public void onNumberClick(View view) {
        button2.setVisibility(View.INVISIBLE);

        switch (view.getId()) {
            case R.id.btn_1:
                setNumber("1");
                break;
            case R.id.btn_2:
                setNumber("2");
                break;
            case R.id.btn_3:
                setNumber("3");
                break;
            case R.id.btn_4:
                setNumber("4");
                break;
            case R.id.btn_5:
                setNumber("5");
                break;
            case R.id.btn_6:
                setNumber("6");
                break;
            case R.id.btn_7:
                setNumber("7");
                break;
            case R.id.btn_8:
                setNumber("8");
                break;
            case R.id.btn_9:
                setNumber("9");
                break;
            case R.id.btn_0:
                setNumber("0");
                break;
            case R.id.btn_clear:
                textView.setText("0");
                first = 0;
                second = 0;
                break;
        }
        isOperationClick = false;
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    public void onOperationClick(View view) {
        button2.setVisibility(View.INVISIBLE);
        switch (view.getId()) {
            case R.id.btn_plus:
                first = Integer.valueOf(textView.getText().toString());
                sign = "+";
                break;
            case R.id.btn_minus:
                first = Integer.valueOf(textView.getText().toString());
                sign = "-";
                break;
            case R.id.btn_multiply:
                first = Integer.valueOf(textView.getText().toString());
                sign = "*";
                break;
            case R.id.btn_divide:
                first = Integer.valueOf(textView.getText().toString());
                sign = "/";
                break;
            case R.id.btn_equal:
                button2.setVisibility(View.VISIBLE);
                second = Integer.valueOf(textView.getText().toString());

                switch (sign) {
                    case "+": {

                        int result = first + second;
                        textView.setText(Integer.toString(result));
                        break;
                    }
                    case "-": {

                        int result = first - second;
                        textView.setText(Integer.toString(result));
                        break;
                    }
                    case "*": {

                        int result = first * second;
                        textView.setText(Integer.toString(result));
                        break;
                    }
                    case "/": {

                        int result = first / second;
                        textView.setText(Integer.toString(result));
                        break;
                    }
                }
        }
        isOperationClick = true;
    }
}
