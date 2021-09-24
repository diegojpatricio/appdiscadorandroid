package com.example.discador;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // É o que liga a classe java com a classe xml de layout
        edtDisplay = findViewById(R.id.edtDisplay);
    }

    public void inserirDigitacao (View v) {
        switch (v.getId()) {
            case R.id.btn0:
                edtDisplay.setText(edtDisplay.getText().toString() + "0");
                break;
            case R.id.btn1:
                edtDisplay.setText(edtDisplay.getText().toString() + "1");
                break;
            case R.id.btn2:
                edtDisplay.setText(edtDisplay.getText().toString() + "2");
                break;
            case R.id.btn3:
                edtDisplay.setText(edtDisplay.getText().toString() + "3");
                break;
            case R.id.btn4:
                edtDisplay.setText(edtDisplay.getText().toString() + "4");
                break;
            case R.id.btn5:
                edtDisplay.setText(edtDisplay.getText().toString() + "5");
                break;
            case R.id.btn6:
                edtDisplay.setText(edtDisplay.getText().toString() + "6");
                break;
            case R.id.btn7:
                edtDisplay.setText(edtDisplay.getText().toString() + "7");
                break;
            case R.id.btn8:
                edtDisplay.setText(edtDisplay.getText().toString() + "8");
                break;
            case R.id.btn9:
                edtDisplay.setText(edtDisplay.getText().toString() + "9");
                break;
            case R.id.btnHashtag:
                edtDisplay.setText(edtDisplay.getText().toString() + "#");
                break;
            case R.id.btnAste:
                edtDisplay.setText(edtDisplay.getText().toString() + "*");
                break;
            default: break;
        }
    }

    public void apagar(View v) {
        edtDisplay.setText("");
    }

    public void discar (View v) {
        Intent intent = new Intent(this, DiscarActivity.class);
        startActivity(intent);
        finish();
    }

}
