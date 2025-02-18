package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;




public class Factorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


    }
    public void fact(View view){
        int f=1;
        EditText t1=findViewById(R.id.t1);
        TextView t2=findViewById(R.id.t2);
        int a=Integer.parseInt(t1.getText().toString());
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        t2.setText(""+f);
    }

}