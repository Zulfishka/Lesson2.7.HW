package com.geekthech.lesson27hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv_text = findViewById(R.id.current_policies);

        Bundle arguments = getIntent().getExtras();
        tv_text.setText(arguments.get("key").toString());
    }
}