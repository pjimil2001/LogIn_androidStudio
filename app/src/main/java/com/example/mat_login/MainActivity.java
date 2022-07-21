package com.example.mat_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText etid,etpassword;
    LinearLayout llsubmit;
    CheckBox cbprivacy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etid = findViewById(R.id.etid);
        etpassword = findViewById(R.id.etpassword);
        cbprivacy = findViewById(R.id.cbprivacy);


    }

            public void onsubmit(View view) {
                if (etid.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "enter id", Toast.LENGTH_SHORT).show();
                }
                else if (etpassword.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "enter valid password", Toast.LENGTH_SHORT).show();
                }

                else if(!cbprivacy.isChecked()){
                    Toast.makeText(MainActivity.this, "check the privacy", Toast.LENGTH_SHORT).show();

                }
                else if (etid.getText().toString().equals(123) || etpassword.getText().toString().equals("asd" )){
                    Intent i =new Intent(MainActivity.this,register_Activity.class);
                    startActivity(i);
                }

                else{

                    Log.e("id",etid.getText().toString());
                    Log.e("password",etpassword.getText().toString());


                }
            }
        }

