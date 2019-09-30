package com.muskan.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Button a1,a2,a3,a4,a5,a6,a7,a8,a9,a0,plus,minus,divide,per,multi,equal;
    public TextView t1;
    float Value1, Value2;
    boolean mAddition, mSubtract, mMultiplication, mDivision ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1=findViewById(R.id.B1);
        a1.setOnClickListener(this);

        a2=findViewById(R.id.B2);
        a2.setOnClickListener(this);

        a3=findViewById(R.id.B3);
        a3.setOnClickListener(this);

        a4=findViewById(R.id.B4);
        a4.setOnClickListener(this);

        a5=findViewById(R.id.B5);
        a5.setOnClickListener(this);

        a6=findViewById(R.id.B6);
        a6.setOnClickListener(this);

        a7=findViewById(R.id.B7);
        a7.setOnClickListener(this);

        a8=findViewById(R.id.B8);
        a8.setOnClickListener(this);

        a9=findViewById(R.id.B9);
        a9.setOnClickListener(this);

        a0=findViewById(R.id.B0);
        a0.setOnClickListener(this);

        plus=findViewById(R.id.Badd);
        plus.setOnClickListener(this);

        minus=findViewById(R.id.Bsub);
        minus.setOnClickListener(this);

        divide=findViewById(R.id.Bdiv);
        divide.setOnClickListener(this);

        per=findViewById(R.id.Bper);
        per.setOnClickListener(this);

        multi=findViewById(R.id.Bmul);
        multi.setOnClickListener(this);

        equal=findViewById(R.id.Beuq);
        equal.setOnClickListener(this);

        t1=findViewById(R.id.Tv);


    }

    @Override
    public void onClick(View v) {
        int a = 0;
        int b=0;
        int c;
        switch (v.getId()){

            case R.id.B0:
                t1.setText(t1.getText()+"0");
                break;
            case R.id.B1:
                t1.setText(t1.getText()+"1");

                break;
            case R.id.B2:
                t1.setText(t1.getText()+"2");
                break;
            case R.id.B3:
                t1.setText(t1.getText()+"3");
                break;
            case R.id.B4:
                t1.setText(t1.getText()+"4");
                break;
            case R.id.B5:
                t1.setText(t1.getText()+"5");
                break;
            case R.id.B6:
                t1.setText(t1.getText()+"6");
                break;
            case R.id.B7:
                t1.setText(t1.getText()+"7");
                break;
            case R.id.B8:
                t1.setText(t1.getText()+"8");
                break;
            case R.id.B9:
                t1.setText(t1.getText()+"9");
                break;
            case R.id.Badd:
             if(t1==null){
                 t1.setText("");
             }else{
                 Value1=Float.parseFloat(t1.getText()+"");
                 mAddition=true;
                 t1.setText(null);
             }
                break;
            case R.id.Bsub:
                if(t1==null){
                    t1.setText("");
                }else{
                    Value1=Float.parseFloat(t1.getText()+"");
                    mSubtract=true;
                    t1.setText(null);
                }
                break;
            case R.id.Bmul:

                if(t1==null){
                    t1.setText("");
                }else{
                    Value1=Float.parseFloat(t1.getText()+"");
                    mMultiplication=true;
                    t1.setText(null);
                }

                break;
            case R.id.Bdiv:
                if(t1==null){
                    t1.setText("");
                }else{
                    Value1=Float.parseFloat(t1.getText()+"");
                    mDivision=true;
                    t1.setText(null);
                }
                break;
            case R.id.Bper:
                t1.setText("");
                break;
            case R.id.Beuq:
                Value2 = Float.parseFloat(t1.getText() + "");
                if(mAddition==true){
                    t1.setText(Value1+Value2+"");
                    mAddition=false;
                }else
                if(mSubtract==true){
                    t1.setText(Value1-Value2+"");
                    mSubtract=false;
                }else
                if(mMultiplication==true){
                    t1.setText(Value1*Value2+"");
                    mMultiplication=false;
                }else
                if(mDivision==true){
                    t1.setText(Value1/Value2+"");
                    mDivision=false;
                }

                break;



        }
    }
}
