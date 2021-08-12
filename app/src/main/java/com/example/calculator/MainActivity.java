package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//public class MainActivity extends AppCompatActivity {
//
//    private TextView result;
//    private EditText height;
//    private Button result_btn;
//    private Button male;
//    private Button female;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        result = findViewById(R.id.result);
//        height = findViewById(R.id.height);
//        result_btn = findViewById(R.id.result_btn);
//        male = findViewById(R.id.male);
//        female = findViewById(R.id.female);
//        String stat = "";
//        male.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String mal = "m";
//            }
//        });
//
//        female.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String fem = "f";
//            }
//        });
//
//        result_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(height.get().toString().trim().equals(""))
//                    Toast.makeText(MainActivity.this, R.string.no_user_input, Toast.LENGTH_LONG).show();
//                else {
//                    String height_info = height.getText().toString();
//                }
//
//            }
//        });
//
//    }
//}