package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int fact = 1, ce = 0, ae = 0, temp, rev = 0, remainder, input0 = 0, input = 0;
    double input1 = 0, input2 = 0, ans;
    TextView edt1;
    boolean Addition, Substract, Multiplication, Division, Modulus, Power, decimal, Root, Celsius, Fah, Armstrong, Fact, Reverse, RandN;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSubstract, buttonMultiply, buttonDivide, buttonMod, buttonAC, buttonRoot, buttonDot, buttonPower, buttonEqual, buttonCelsius, buttonFah, buttonArm, buttonRandN, buttonReverse, buttonFact;

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
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSubstract = (Button) findViewById(R.id.buttonSubstract);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonMod = (Button) findViewById(R.id.buttonMod);
        buttonAC = (Button) findViewById(R.id.buttonAC);
        buttonRoot = (Button) findViewById(R.id.buttonRoot);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonPower = (Button) findViewById(R.id.buttonPower);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonCelsius = (Button) findViewById(R.id.buttonCelsius);
        buttonFah = (Button) findViewById(R.id.buttonFah);
        buttonArm = (Button) findViewById(R.id.buttonArm);
        buttonRandN = (Button) findViewById(R.id.buttonRandN);
        buttonReverse = (Button) findViewById(R.id.buttonReverse);
        buttonFact = (Button) findViewById(R.id.buttonFact);

        edt1 = (TextView) findViewById(R.id.display);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "1");
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                button1.startAnimation(animation);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "2");
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                button2.startAnimation(animation);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "3");
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                button3.startAnimation(animation);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "4");
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                button4.startAnimation(animation);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "5");
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                button5.startAnimation(animation);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "6");
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                button6.startAnimation(animation);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "7");
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                button7.startAnimation(animation);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "8");
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                button8.startAnimation(animation);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "9");
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                button9.startAnimation(animation);
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "0");
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                button0.startAnimation(animation);
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                buttonAdd.startAnimation(animation);
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Addition = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });
        buttonSubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                buttonSubstract.startAnimation(animation);
                if (edt1.getText().length() != 0){
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Substract = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                buttonMultiply.startAnimation(animation);
                if (edt1.getText().length() != 0){
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                buttonDivide.startAnimation(animation);
                if (edt1.getText().length() != 0){
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Division = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });
        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                buttonMod.startAnimation(animation);
                if (edt1.getText().length() != 0){
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Modulus = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });
        buttonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                buttonPower.startAnimation(animation);
                if (edt1.getText().length() != 0){
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Power = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });
        buttonRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                buttonRoot.startAnimation(animation);
                if (edt1.getText().length() != 0){
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Root = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });
        buttonCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                buttonCelsius.startAnimation(animation);
                if (edt1.getText().length() != 0){
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Celsius = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });
        buttonFah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                buttonFah.startAnimation(animation);
                if (edt1.getText().length() != 0){
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Fah = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });
        buttonArm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                buttonArm.startAnimation(animation);
                if (edt1.getText().length() != 0){
                    input = Integer.parseInt(edt1.getText() + "");
                    Armstrong = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });
        buttonFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                buttonFact.startAnimation(animation);
                if (edt1.getText().length() != 0){
                    input = Integer.parseInt(edt1.getText() + "");
                    Fact = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });
        buttonRandN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                buttonRandN.startAnimation(animation);
                if (edt1.getText().length() != 0){
                    input1 = Float.parseFloat(edt1.getText() + "");
                    RandN = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });
        buttonReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                buttonReverse.startAnimation(animation);
                if (edt1.getText().length() != 0){
                    input = Integer.parseInt(edt1.getText() + "");
                    Reverse = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                buttonEqual.startAnimation(animation);
                if (Addition || Substract || Multiplication || Division || Modulus || Power || RandN) {
                    input2 = Float.parseFloat(edt1.getText() + "");
                }

                if (Addition) {
                    ans = input1 + input2;
                    edt1.setText(input1 + " + " + input2 + " = " + ans);
                    Addition = false;
                }

                if (Substract) {
                    ans = input1 - input2;
                    edt1.setText(input1 + " - " + input2 + " = " + ans);
                    Substract = false;
                }

                if (Multiplication) {
                    ans = input1 * input2;
                    edt1.setText(input1 + " * " + input2 + " = " + ans);
                    Multiplication = false;
                }

                if (Division) {
                    ans = input1 / input2;
                    edt1.setText(input1 + " / " + input2 + " = " + ans);
                    Division = false;
                }
                if (Modulus) {
                    ans = input1 % input2;
                    edt1.setText(input1 + " % " + input2 + " = " + ans);
                    Modulus = false;
                }
                if (Power) {
                    ans = Math.pow(input1, input2);
                    edt1.setText(input1 + " ^ " + input2 + " = " + ans);
                    Power = false;
                }
                if (Root) {
                    ans = Math.sqrt(input1);
                    edt1.setText(input1 + "² = " + ans);
                    Root = false;
                }
                if (Celsius) {
                    ans = (input1 - 32) * 5/9;
                    edt1.setText("Temperature of " + input1 + " Fahrenheit in Celsius is:" + ans + " Celsius");
                    Celsius = false;
                }
                if (Fah) {
                    ans = (input1 * 9/5) + 32;
                    edt1.setText("The Temperature of " + input1 + " Celsius in Fahrenheit is: " + ans + " Fahrenheit");
                    Fah = false;
                }
                if (Armstrong) {
                    temp = input;
                    while(input > 0){
                        ae = input % 10;
                        input = input / 10;
                        ce = ce + (ae * ae * ae);
                    }
                    if(temp != ce) {
                        edt1.setText(temp + " is not an Armstrong Number"+"");
                    }
                    else{
                        edt1.setText(temp + "is an Armstrong Number" + "");
                    }
                    Armstrong = false;
                }
                if(Fact){
                    for(int i=1;i<=input;i++){
                        fact=fact*i;
                    }
                    edt1.setText("Factorial of " + input + " is " + fact );
                    Fact = false;
                }
                if(RandN){
                    int randNumber = (int)(Math.random() * (input2 - input1 + 1) + input1);
                    edt1.setText("Random Number Between " + input1 + " to " + input2 + " is " + randNumber );
                    RandN = false;
                }
                if(Reverse){
                    temp = input;
                    while(input != 0){
                        remainder = input % 10;
                        rev = rev * 10 + remainder;
                        input /= 10;
                    }
                    edt1.setText("Reverse of " + temp + " is " + rev );
                    Reverse = false;
                }
            }
        });
        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                buttonAC.startAnimation(animation);
                edt1.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                buttonDot.startAnimation(animation);
                if (decimal) {
                    //do nothing or you can show the error
                } else {
                    edt1.setText(edt1.getText() + ".");
                    decimal = true;
                }

            }
        });

    }
}