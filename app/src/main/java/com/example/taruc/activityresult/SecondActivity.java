package com.example.taruc.activityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
private Button btnSubmit;
private EditText txtEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnSubmit=findViewById(R.id.btnSubmit);
        txtEdit=findViewById(R.id.txtEdit);
        btnSubmit.setOnClickListener(this);

    }

    public void onClick (View v){
        String message =  txtEdit.getText().toString();


        //use intent to communicate with another activity
        Intent intent = new Intent();
        intent.putExtra("key", message);
        setResult(0, intent);
        finish();
       // startActivity(intent);
    }



}
