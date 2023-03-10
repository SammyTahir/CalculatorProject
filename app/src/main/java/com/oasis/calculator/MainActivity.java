package com.oasis.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,
    buttonadd,buttonsub,buttonmul,buttondiv,buttonequal,buttonc;

    EditText oasisEdittext;

    float mValueOne,mvalueTwo;

    boolean oasisAddition,mSubstraction,oasisMultiplication,oasisDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button)findViewById(R.id.button10);
        buttonadd = (Button)findViewById(R.id.buttonadd);
        buttonsub = (Button) findViewById(R.id.buttonsub);
        buttonmul = (Button) findViewById(R.id.buttonmul);
        buttondiv = (Button)findViewById(R.id.buttondiv);
        buttonequal=(Button)findViewById(R.id.buttonequl);
        buttonc = (Button) findViewById(R.id.buttonc);
        oasisEdittext = (EditText) findViewById(R.id.edit1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oasisEdittext.setText(oasisEdittext.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oasisEdittext.setText(oasisEdittext.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oasisEdittext.setText(oasisEdittext.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oasisEdittext.setText(oasisEdittext.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oasisEdittext.setText(oasisEdittext.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oasisEdittext.setText(oasisEdittext.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oasisEdittext.setText(oasisEdittext.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oasisEdittext.setText(oasisEdittext.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oasisEdittext.setText(oasisEdittext.getText()+"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oasisEdittext.setText(oasisEdittext.getText()+"0");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oasisEdittext.setText(oasisEdittext.getText()+".");
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(oasisEdittext == null)
                {
                    oasisEdittext.setText("");
                }else {
                    mValueOne = Float.parseFloat(oasisEdittext.getText()+"");
                    oasisAddition = true;
                    oasisEdittext.setText(null);
                }

            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(oasisEdittext.getText()+"");
                mSubstraction = true;
                oasisEdittext.setText(null);
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(oasisEdittext.getText()+"");
                oasisMultiplication = true;
                oasisEdittext.setText(null);
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(oasisEdittext.getText()+"");
                oasisDivision = true;
                oasisEdittext.setText(null);
            }
        });
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oasisEdittext.setText("");
            }
        });
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mvalueTwo = Float.parseFloat(oasisEdittext.getText()+"");

                if (oasisAddition == true)
                {
                    oasisEdittext.setText(mValueOne + mvalueTwo+"");
                    oasisAddition = false;
                }
                if (mSubstraction == true)
                {
                    oasisEdittext.setText(mValueOne - mvalueTwo+"");
                    mSubstraction = false;

                }
                if (oasisMultiplication == true)
                {
                    oasisEdittext.setText(mValueOne * mvalueTwo+"");
                    oasisMultiplication = false;

                }
                if (oasisDivision == true)
                {
                    oasisEdittext.setText(mValueOne / mvalueTwo+"");
                    oasisDivision = false;
                }
            }
        });



    }






}