package calculator.calculator;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {

EditText input1;
    EditText input2;
    Button additionBtn;
    int firstNum;
    int secondNum;
    int output;
    String outputToString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        additionBtn = (Button) findViewById(R.id.addition_btn);

    }

    public void onAdditionButtonClicked(View button) {
    firstNum = Integer.parseInt((input1.getText().toString()));
     secondNum = Integer.parseInt((input2.getText().toString()));
       output = Calculator.addition(firstNum, secondNum);
        outputToString = Integer.toString(output);


        Intent intent = new Intent(CalculatorActivity.this, OutputActivity.class);
        intent.putExtra("output", outputToString);
        startActivity(intent);
    }



}
