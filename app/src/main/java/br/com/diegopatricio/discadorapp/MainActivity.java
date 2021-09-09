package br.com.diegopatricio.discadorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v) {
        EditText screen = findViewById(R.id.screen);
        switch (v.getId()) {
            case R.id.buttonUm:
                screen.setText(screen.getText().toString() + "1");
                break;
            case R.id.buttonDois:
                screen.setText(screen.getText().toString() + "2");
                break;
            case R.id.buttonTres:
                screen.setText(screen.getText().toString() + "3");
                break;
            case R.id.buttonQuatro:
                screen.setText(screen.getText().toString() + "4");
                break;
            case R.id.buttonCinco:
                screen.setText(screen.getText().toString() + "5");
                break;
            case R.id.buttonSeis:
                screen.setText(screen.getText().toString() + "6");
                break;
            case R.id.buttonSete:
                screen.setText(screen.getText().toString() + "7");
                break;
            case R.id.buttonOito:
                screen.setText(screen.getText().toString() + "8");
                break;
            case R.id.buttonNove:
                screen.setText(screen.getText().toString() + "9");
                break;
            case R.id.buttonEstrela:
                screen.setText(screen.getText().toString() + "*");
                break;
            case R.id.buttonHash:
                screen.setText(screen.getText().toString() + "#");
                break;
            case R.id.buttonZero:
                screen.setText(screen.getText().toString() + "0");
                break;
            case R.id.buttonLimpar:
                String str = screen.getText().toString();
                screen.setText(str.substring(0, str.length() - 1));
                break;
        }
    }
}