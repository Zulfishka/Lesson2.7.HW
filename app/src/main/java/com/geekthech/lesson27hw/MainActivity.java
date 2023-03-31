package com.geekthech.lesson27hw;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer first,second,sum;
    private Button btnEqual;

    private String sign;

    private Boolean isOperationClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEqual = findViewById(R.id.btn_equal);
        textView=findViewById(R.id.text_view);
        first = Integer.valueOf(textView.getText().toString());
    }

    private void setNumber (String number) {
        if (textView.getText().toString().equals("0") || isOperationClick) {
            textView.setText(number);
        } else {
            textView.append(number);
        }
    }
    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_1:
          //      if (textView.getText().toString().equals("0")) {
           //         textView.setText("1");
          //  } else {
         //           textView.append("1");
           //     }
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
                                                    sum = 0;
                                                    break;
        }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
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
                second = Integer.valueOf(textView.getText().toString());

                if (sign.equals("+")) {

                    Integer result = first + second;
                    textView.setText(result.toString());
                } else if (sign.equals("-")) {

                    Integer result = first - second;
                    textView.setText(result.toString());
                } else if (sign.equals("*")) {

                    Integer result = first * second;
                    textView.setText(result.toString());
                } else if (sign.equals("/")) {

                    Integer result = first / second;
                    textView.setText(result.toString());
                }

        }
        isOperationClick = true;
    }


}