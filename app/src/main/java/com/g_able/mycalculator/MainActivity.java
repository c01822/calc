package com.g_able.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CalculatorListener {

    EditText firstOperandEditText, secondOperandEditText;
    TextView resultTextView;
    MainController mainController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstOperandEditText = (EditText) findViewById(R.id.operand_one_edit_text);
        secondOperandEditText = (EditText) findViewById(R.id.operand_two_edit_text);
        resultTextView = (TextView) findViewById(R.id.operation_result_text_view);

        mainController = new MainController();
        mainController.setListener(this);
    }

    double first;
    double second;

    private void setUpData() {
        first = Double.parseDouble(firstOperandEditText.getText().toString());
        second = Double.parseDouble(secondOperandEditText.getText().toString());
    }

    public void onAdd(View view) {
        setUpData();
        mainController.add(first, second);
    }

    public void onSub(View view) {
        setUpData();
        mainController.sub(first, second);
    }

    public void onMul(View view) {
        setUpData();
        mainController.mul(first, second);
    }

    public void onDiv(View view) throws Exception {
        setUpData();
        mainController.div(first, second);
    }

    @Override
    public void onSuccess(String result) {
        resultTextView.setText(String.valueOf(result));
    }

}
