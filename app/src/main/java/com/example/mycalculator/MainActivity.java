package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.content.Loader;

import android.os.Bundle;
import android.os.IInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.channels.FileLock;

public class MainActivity extends AppCompatActivity {

    EditText firstnum, secondnum;
    TextView tans;
    Button add, sub, multiply, divide, power;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnum = findViewById(R.id.edFirstValue);
        secondnum = findViewById(R.id.edSecondNumber);
        tans = findViewById(R.id.edAns);
        add = findViewById(R.id.btAdd);
        sub = findViewById(R.id.btsub);
        multiply = findViewById(R.id.btMultiply);
        divide = findViewById(R.id.btDivide);
        power = findViewById(R.id.btPower);

    }

    public void Add(View view) {

        float first,second,ans;
        first=Float.parseFloat(firstnum.getText().toString());
        second=Float.parseFloat(secondnum.getText().toString());
        ans=first+second;
        tans.setText("= "+ans);
    }

    public void Sub(View view) {
        float first,second,ans;
        first=Float.parseFloat(firstnum.getText().toString());
        second= Float.parseFloat(secondnum.getText().toString());
        ans=first-second;
        tans.setText("= "+ans);
    }

    public void Multiply(View view) {
        float first,second,ans;
        first=Float.parseFloat(firstnum.getText().toString());
        second=Float.parseFloat(secondnum.getText().toString());
        ans=first*second;
        tans.setText("= "+ans);
    }

    public void Divide(View view) {
        float first,second,ans;
        first=Float.parseFloat(firstnum.getText().toString());
        second=Float.parseFloat(secondnum.getText().toString());
        ans=first/second;
        if(second==0)
            tans.setText("undefined");
        else
            tans.setText("= "+ans);
    }

    public void Power(View view) {
        double first,second,ans;
        first=Double.parseDouble(firstnum.getText().toString());
        second=Double.parseDouble(secondnum.getText().toString());
        ans=Math.pow(first,second);
        tans.setText("= "+ans);
    }
}