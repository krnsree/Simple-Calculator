package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    String s="";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        TextView dis=findViewById(R.id.textView);
        Button button=(Button)view;
        if(button.getId()==R.id.button10)
            s="";
        else if(button.getId()==R.id.button12)
            s=s.substring(0,s.length()-1);
        else
            s+=button.getText().toString();
        dis.setText(s);
    }
}
