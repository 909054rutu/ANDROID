package com.example.myapplication;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }
    public void sub(View view){
        EditText t1=findViewById(R.id.t1);
        EditText t2=findViewById(R.id.t2);
        EditText t3=findViewById(R.id.t3);

        int a=Integer.parseInt(t1.getText().toString());
        int b=Integer.parseInt(t2.getText().toString());

        int sub=a-b;
        t3.setText(""+sub);

    }
    public void mul(View view){
        EditText t1=findViewById(R.id.t1);
        EditText t2=findViewById(R.id.t2);
        EditText t3=findViewById(R.id.t3);

        int a=Integer.parseInt(t1.getText().toString());
        int b=Integer.parseInt(t2.getText().toString());

        int mul=a*b;
        t3.setText(""+mul);

    }
    public void div(View view){
        EditText t1=findViewById(R.id.t1);
        EditText t2=findViewById(R.id.t2);
        EditText t3=findViewById(R.id.t3);

        int a=Integer.parseInt(t1.getText().toString());
        int b=Integer.parseInt(t2.getText().toString());

        int div=a/b;
        t3.setText(""+div);

    }
    public void add(View view){
        EditText t1=findViewById(R.id.t1);
        EditText t2=findViewById(R.id.t2);
        EditText t3=findViewById(R.id.t3);

        int a=Integer.parseInt(t1.getText().toString());
        int b=Integer.parseInt(t2.getText().toString());

        int Add=a+b;
        t3.setText(""+Add);

    }
}