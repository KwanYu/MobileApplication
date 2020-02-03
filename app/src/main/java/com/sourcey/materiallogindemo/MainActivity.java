package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {


    @BindView(R.id.captureBTN) Button captureBtn;
    @BindView(R.id.galleryBTN) Button galleryBtn;
    @BindView(R.id.futureBTN)  Button futureBTN ;
    @BindView(R.id.reportBTN)  Button reportBTN ;


    Button _loginButton;
    TextView _signupLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        captureBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CameraActivity.class);
                startActivity(intent);

            }
        });


        galleryBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent gallery = new Intent(getApplicationContext(), GalleryActivity.class);
                startActivity(gallery);

            }
        });

        futureBTN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent choose = new Intent(getApplicationContext(),futureActivity.class);
                startActivity(choose);

            }
        });

        reportBTN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent choose = new Intent(getApplicationContext(),ReportActivity.class);
                startActivity(choose);

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}