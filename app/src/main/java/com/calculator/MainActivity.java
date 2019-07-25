package com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView input;
    Button doubleZero,subButton, addButton, decimal, div, multi, remainder, clear, equal, one, two, three, four, five, six, seven, eight, nine, zero;
    boolean addition, subtraction, division, multiplication, modulus;
    float val1, val2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doubleZero = findViewById(R.id.doubleZero);
        subButton = findViewById(R.id.subButton);
        addButton = findViewById(R.id.addButton);
        decimal = findViewById(R.id.decimal);
        div = findViewById(R.id.division);
        multi = findViewById(R.id.multiply);
        clear = findViewById(R.id.clear);
        equal = findViewById(R.id.equal);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        input = findViewById(R.id.input);
        remainder = findViewById(R.id.remainder);
        result = findViewById(R.id.result);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "0");
            }
        });

        doubleZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "00");
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + ".");
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().length() != 0) {
                    val1 = Float.parseFloat(input.getText() + "");
                    addition = true;
                    input.setText(null);
                }
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().length() != 0) {
                    val1 = Float.parseFloat(input.getText() + "");
                    subtraction = true;
                    input.setText(null);
                }
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().length() != 0) {
                    val1 = Float.parseFloat(input.getText() + "");
                    multiplication = true;
                    input.setText(null);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().length() != 0) {
                    val1 = Float.parseFloat(input.getText() + "");
                    division = true;
                    input.setText(null);
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(null);
                result.setText(null);
                result.setVisibility(View.INVISIBLE);
                input.setVisibility(View.VISIBLE);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (addition | multiplication | division | modulus | subtraction){
                    val2 = Float.parseFloat(input.getText() + "");
                }
                if (addition) {
                    input.setVisibility(View.INVISIBLE);
                    result.setText(val1 + val2 + "");
                    result.setVisibility(View.VISIBLE);
                    addition = false;
                } else if (subtraction) {
                    result.setText(val1 - val2 + "");
                    subtraction = false;
                } else if (multiplication) {
                    result.setText(val1 * val2 + "");
                    multiplication = false;
                } else if (division) {
                    result.setText(val1 / val2 + "");
                    division = false;
                } else if (modulus) {
                    result.setText(val1 % val2 + "");
                    modulus = false;
                }
                else {
                    result.setText(null);
                }
            }
        });
    }

}
