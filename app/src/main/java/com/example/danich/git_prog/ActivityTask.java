package com.example.danich.git_prog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTask extends AppCompatActivity {

    Button btn01;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        btn01 = (Button) findViewById(R.id.btn01);
        txt = (TextView) findViewById(R.id.txt);

        final View.OnClickListener oclBtnOk01 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Меняем текст в TextView (tvOut)
                txt.setText("КРАСАВЭЛЛА!");

            }
        };
        btn01.setOnClickListener(oclBtnOk01);
    }
}