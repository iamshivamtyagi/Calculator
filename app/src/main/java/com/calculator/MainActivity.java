package com.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView input, showInput;
    Button doubleZero,subButton, addButton, decimal, div, multi, remainder, clear, equal, one, two, three, four, five, six, seven, eight, nine, zero;
    boolean addition, firstNum = false, secondNum = false, subtraction, division, multiplication, modulus, operation;
    float val1, val2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showInput = findViewById(R.id.showInput);
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
                if (firstNum && secondNum) {
                    showInput.setText(null);
                    result.setText(null);
                    input.setText(null);
                }
                secondNum = false;
                input.setText(input.getText() + "1");
                showInput.setText(showInput.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNum && secondNum) {
                    showInput.setText(null);
                    result.setText(null);
                    input.setText(null);
                }
                secondNum = false;
                input.setText(input.getText() + "2");
                showInput.setText(showInput.getText() + "2");
                secondNum = false;
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNum && secondNum) {
                    showInput.setText(null);
                    result.setText(null);
                    input.setText(null);
                }
                secondNum = false;
                input.setText(input.getText() + "3");
                showInput.setText(showInput.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNum && secondNum) {
                    showInput.setText(null);
                    result.setText(null);
                    input.setText(null);
                }
                secondNum = false;
                input.setText(input.getText() + "4");
                showInput.setText(showInput.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNum && secondNum) {
                    showInput.setText(null);
                    result.setText(null);
                    input.setText(null);
                }
                secondNum = false;
                input.setText(input.getText() + "5");
                showInput.setText(showInput.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNum && secondNum) {
                    showInput.setText(null);
                    result.setText(null);
                    input.setText(null);
                }
                secondNum = false;
                input.setText(input.getText() + "6");
                showInput.setText(showInput.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNum && secondNum) {
                    showInput.setText(null);
                    result.setText(null);
                    input.setText(null);
                }
                secondNum = false;
                input.setText(input.getText() + "7");
                showInput.setText(showInput.getText() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNum && secondNum) {
                    showInput.setText(null);
                    result.setText(null);
                    input.setText(null);
                }
                secondNum = false;
                input.setText(input.getText() + "8");
                showInput.setText(showInput.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNum && secondNum) {
                    showInput.setText(null);
                    result.setText(null);
                    input.setText(null);
                }
                secondNum = false;
                input.setText(input.getText() + "9");
                showInput.setText(showInput.getText() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNum && secondNum) {
                    showInput.setText(null);
                    result.setText(null);
                    input.setText(null);
                }
                secondNum = false;
                input.setText(input.getText() + "0");
                showInput.setText(showInput.getText() + "0");
            }
        });

        doubleZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNum && secondNum) {
                    showInput.setText(null);
                    result.setText(null);
                    input.setText(null);
                }
                secondNum = false;
                input.setText(input.getText() + "00");
                showInput.setText(showInput.getText() + "00");
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNum && secondNum) {
                    showInput.setText(null);
                    result.setText(null);
                    input.setText(null);
                }
                secondNum = false;
                input.setText(input.getText() + ".");
                showInput.setText(showInput.getText() + ".");
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().length() != 0 && !operation) {
                    val1 = Float.parseFloat(input.getText() + "");
                    addition = true;
                    input.setText(null);
                    firstNum = true;
                    operation = true;
                    showInput.setText(showInput.getText() + "+");
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
                    firstNum = true;
                    showInput.setText(showInput.getText() + "-");
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
                    showInput.setText(showInput.getText() + "X");
                    firstNum = true;
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
                    showInput.setText(showInput.getText() + "/");
                    firstNum = true;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(null);
                result.setText(null);
                showInput.setText(null);
                firstNum = false;
                secondNum = false;
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (addition | multiplication | division | modulus | subtraction){
                    val2 = Float.parseFloat(input.getText() + "");
                }
                if (addition) {
                    result.setText(val1 + val2 + "");
                    addition = false;
                    secondNum = true;
                } else if (subtraction) {
                    result.setText(val1 - val2 + "");
                    subtraction = false;
                    secondNum = true;
                } else if (multiplication) {
                    result.setText(val1 * val2 + "");
                    multiplication = false;
                    secondNum = true;
                } else if (division) {
                    result.setText(val1 / val2 + "");
                    division = false;
                    secondNum = true;
                } else if (modulus) {
                    result.setText(val1 % val2 + "");
                    modulus = false;
                    secondNum = true;
                }
                else {
                    result.setText(null);
                    secondNum = true;
                }
            }
        });
    }

}
