package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ReportActivity extends AppCompatActivity {


    @BindView(R.id.ConfirmBTN) Button confirm;
    @BindView(R.id.cancelBTN) Button cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        ButterKnife.bind(this);
        RGDemo();
        confirm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),FeedbackActivity.class);
                startActivity(intent);

            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }


    RadioGroup radioGroup;
    RadioButton content;
    RadioButton bug;
    RadioButton requiremnt;

    public void RGDemo(){
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        content=(RadioButton)findViewById(R.id.Content);
        bug=(RadioButton)findViewById(R.id.Bug);
        requiremnt=(RadioButton)findViewById(R.id.FeatureRequiremnt);
        Button confirm=(Button)findViewById(R.id.ConfirmBTN);
        /*confirm.setOnClickListener(comfirm);*/
        Button cancel=(Button)findViewById(R.id.cancelBTN);
        /*cancel.setOnClickListener(show);*/
    }





    private View.OnClickListener show=new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            if(content.isChecked()){
                Toast.makeText(getApplicationContext(),"you have selected to report bug",Toast.LENGTH_SHORT).show();
            }
            if(bug.isChecked()){
                Toast.makeText(getApplicationContext(),"you have selected to report bug",Toast.LENGTH_SHORT).show();
            }
            if(requiremnt.isChecked()){
                Toast.makeText(getApplicationContext(),"you have selected to report bug",Toast.LENGTH_SHORT).show();
            }
        }

    };
}
