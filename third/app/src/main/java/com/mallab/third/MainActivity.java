package com.mallab.third;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    int n1,n2;
    float num1,num2;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText e1=(EditText)findViewById(R.id.editText1);
        final EditText e2=(EditText)findViewById(R.id.editText2);
        Button b1=(Button)findViewById(R.id.button1);
        Button b2=(Button)findViewById(R.id.button2);
        Button b3=(Button)findViewById(R.id.button3);
        Button b4=(Button)findViewById(R.id.button4);
        final TextView t=(TextView)findViewById(R.id.textView1);
        b1.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View arg0) {
                        // TODO Auto-generated method stub
                        n1=Integer.parseInt(e1.getText().toString());
                        n2=Integer.parseInt(e2.getText().toString());
                        t.setText(e1.getText().toString()+"+"+e2.getText().toString()+" = "+(n1+n2));
                    }
                });
        b2.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View arg0) {
                        // TODO Auto-generated method stub
                        n1=Integer.parseInt(e1.getText().toString());
                        n2=Integer.parseInt(e2.getText().toString());
                        t.setText(e1.getText().toString()+"-"+e2.getText().toString()+"= "+(n1-n2));
                    }

                });
        b3.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View arg0) {
                        // TODO Auto-generated method stub
                        n1=Integer.parseInt(e1.getText().toString());
                        n2=Integer.parseInt(e2.getText().toString());
                        t.setText(e1.getText().toString()+"*"+e2.getText().toString()+" = "+(n1*n2));
                    }
                });
        b4.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View arg0) {
                        // TODO Auto-generated method stub
                        num1=Float.parseFloat(e1.getText().toString());
                        num2=Float.parseFloat(e2.getText().toString());
                        t.setText(e1.getText().toString()+"/"+e2.getText().toString()+" = "+(num1/num2));
                    };
                });
    }
    }