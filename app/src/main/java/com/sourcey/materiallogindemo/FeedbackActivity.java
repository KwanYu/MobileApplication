package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FeedbackActivity extends AppCompatActivity {


    @BindView(R.id.uploadBTN)
    Button uploadBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        ButterKnife.bind(this);

        uploadBTN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                /*login();*/
                Intent main = new Intent(getApplicationContext(), ThanksActivity.class);
                startActivity(main);

            }
        });

    }
}
