package com.example.karam.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView x;
    int y=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x=(TextView)findViewById(R.id.counter_value);
        x.setText(""+y);

    }


    public void showText(View view) {
        Toast toast =Toast.makeText(this,getString(R.string.message),Toast.LENGTH_LONG);
        toast.show();
    }

    public void increas(View view) {
        y=y+1;
        x.setText(""+y);

    }
}
