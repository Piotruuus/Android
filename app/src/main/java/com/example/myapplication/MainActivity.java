package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText editTextPrzyklad;
     Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextPrzyklad= findViewById(R.id.editTextprzyklad);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String tekst = editTextPrzyklad.getText().toString();
                if(tekst!=""){
                    Toast.makeText(MainActivity.this, tekst, Toast.LENGTH_SHORT).show();
                }
                RadioGroup radioGroupEgzamin = findViewById(R.id.egzaminRadioGroup);
                int odpowiedzId = radioGroupEgzamin.getCheckedRadioButtonId();
                if (odpowiedzId == R.id.radioButton3){
                    Toast.makeText(MainActivity.this, "Dobrze!", Toast.LENGTH_LONG).show();
                }
                if (odpowiedzId == R.id.radioButton){
                    Toast.makeText(MainActivity.this, "Przecież już to zdawałeś...", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "głupiś czy udajesz?", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}