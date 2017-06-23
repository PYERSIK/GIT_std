package com.example.danich.git_prog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvOut;
    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);



        View.OnClickListener oclBtn1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Во, теперь ништяк :3");
            }
        };
        btn1.setOnClickListener(oclBtn1);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn2:
                Intent intent = new Intent(this, ActivityTask.class);
                startActivity(intent);
                break;
            case R.id.btn3:
                Intent intent1 = new Intent(this, Main2Activity.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}
