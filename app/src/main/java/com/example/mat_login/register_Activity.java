package com.example.mat_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import android.widget.Toast;

public class register_Activity extends AppCompatActivity {

    EditText etid,etname,etnumber,etaddress;
    RadioButton rbmale,rbfemale;
    LinearLayout llsubmit,llreseat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etid=findViewById(R.id.etid);
        etname=findViewById(R.id.etname);
        etnumber=findViewById(R.id.etnumber);
        etaddress=findViewById(R.id.etaddress);
        llsubmit=findViewById(R.id.llsubmit);



        llsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (etid.getText().toString().isEmpty()){
                    Toast.makeText(register_Activity.this, "enter id", Toast.LENGTH_SHORT).show();
                } else if (etname.getText().toString().isEmpty()) {
                    Toast.makeText(register_Activity.this, "enter valid name", Toast.LENGTH_SHORT).show();
                } else if (etnumber.getText().toString().isEmpty()) {
                    Toast.makeText(register_Activity.this, "enter valid number", Toast.LENGTH_SHORT).show();
                } else if (etaddress.getText().toString().isEmpty()){
                    Toast.makeText(register_Activity.this, "enter  address", Toast.LENGTH_SHORT).show();
                }else{


                    Log.e("id", etid.getText().toString());
                    Log.e("name", etname.getText().toString());
                    Log.e("number", etnumber.getText().toString());
                    Log.e("address", etaddress.getText().toString());

                }
            }
        });



    }

    public void onResetTap(View view){
        etid.setText("");
        etname.setText("");
        etnumber.setText("");
        etaddress.setText("");

    }
}