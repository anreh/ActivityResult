package com.example.taruc.activityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button btnSend;
private TextView txtMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSend=findViewById(R.id.btnSend);

        txtMsg=findViewById(R.id.txtMsg);
        btnSend.setOnClickListener(this);
    }

    //public void send(View v){







   // }

    @Override
    public void onClick(View v) {
        Intent intent= new Intent(this, SecondActivity.class);
        //intent.setData(Uri.parse());
        startActivityForResult(intent, 0);

        //startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==0){
            if(data!=null) {
                txtMsg.setText(data.getStringExtra("key"));

            }
            else {
                txtMsg.setText("Error: There is no message to be displayed.");
            }
        }
    }
}
