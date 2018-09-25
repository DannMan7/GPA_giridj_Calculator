package com.example.user.gpa_giridj_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;
import android.widget.Toast;

public class GPACalculationScreen extends AppCompatActivity {

    private static final String INFO = GPACalculationScreen.class.getSimpleName();
    TextView mTV6;
    EditText mET1;
    EditText mET2;
    EditText mET3;
    EditText mET4;
    EditText mET5;
    Button calculateBtn;
    View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpacalculation_screen);
        Log.i(INFO, "On Create Called");

        mTV6 = findViewById(R.id.tv6);
        mET1 = findViewById(R.id.et1);
        mET2 = findViewById(R.id.et2);
        mET3 = findViewById(R.id.et3);
        mET4 = findViewById(R.id.et4);
        mET5 = findViewById(R.id.et5);
        mView = getWindow().getDecorView();
        calculateBtn = findViewById(R.id.btn_calculate);
        mET1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(mET1.getText() != null)
                {
                    if(mET1.getText().length() <= 0)
                    mET1.setError("Invalid Entry");
                }
            }
        });
        mET2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(mET1.getText() != null)
                {
                    if(mET1.getText().length() <= 0)
                    mET2.setError("Invalid Entry");
                }
            }
        });
        mET3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(mET1.getText() != null)
                {
                    if(mET1.getText().length() <= 0)
                    mET3.setError("Invalid Entry");
                }
            }
        });
        mET4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(mET1.getText() != null)
                {
                    if(mET1.getText().length() <= 0)
                    mET4.setError("Invalid Entry");
                }
            }
        });
        mET5.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(mET1.getText() != null)
                {
                    if(mET1.getText().length() <= 0)
                    mET5.setError("Invalid Entry");
                }
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(INFO, "On Start Called");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(INFO, "On Stop Called");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(INFO, "On Pause Called");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(INFO, "On Resume Called");
    }
    private boolean isEmpty(EditText etText)
    {
        if(etText.getText().toString().trim().length() > 0)
        {
            return false;
        }
        return true;
    }
    private boolean checkText()
    {
        if(!isEmpty(mET1))
        {
            if(!isEmpty(mET2))
            {
                if(!isEmpty(mET3)) {
                    if (!isEmpty(mET4))
                    {
                        if(!isEmpty(mET5))
                        {
                            return true;
                        }

                    }
                }
            }
        }
        Toast.makeText(this, "You have failed to enter a number above!", Toast.LENGTH_SHORT).show();
            return false;
    }

    public void read_info(View view) {
        if (checkText()) {
            double dGpa = (Double.parseDouble(mET1.getText().toString().trim()) +
                    Double.parseDouble(mET2.getText().toString().trim()) +
                    Double.parseDouble(mET3.getText().toString().trim()) +
                    Double.parseDouble(mET4.getText().toString().trim()) +
                    Double.parseDouble(mET5.getText().toString().trim())) / 5;
            String sGpa = ("" + dGpa);
            if (dGpa < 60) {
                //  view.setBackgroundResource(R.color.red);
                mView.setBackgroundResource(R.color.red);
                calculateBtn.setTextColor(getResources().getColor(R.color.transparent));
            }
            if (dGpa >= 60 && dGpa < 80) {
                //view.setBackgroundResource(R.color.yellow);
                mView.setBackgroundResource(R.color.yellow);
                calculateBtn.setTextColor(getResources().getColor(R.color.transparent));
            }
            if (dGpa >= 80 && dGpa <= 100) {
                //view.setBackgroundResource(R.color.green);
                mView.setBackgroundResource(R.color.green);
                calculateBtn.setTextColor(getResources().getColor(R.color.transparent));
            }

            mTV6.setText(sGpa);

        }
    }
}
