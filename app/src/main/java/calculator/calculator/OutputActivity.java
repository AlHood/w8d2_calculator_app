package calculator.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {

    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        output = (TextView) findViewById(R.id.output);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String outputString = extras.getString("output");

                output.setText(outputString);




    }
}
