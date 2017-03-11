package com.example.bikram.toolbarpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by bikram on 3/11/2017.
 */

public class second extends AppCompatActivity {

    Button b1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        b1=(Button)findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(second.this,MainActivity.class);
               // second.this.finish();
                startActivity(i);
            }
        });
    }
    public void click(View v)
    {
        Intent i= new Intent(second.this,third.class);
       // second.this.finish();
        startActivity(i);
    }
}