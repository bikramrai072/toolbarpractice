package com.example.bikram.toolbarpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by bikram on 3/11/2017.
 */

public class third  extends AppCompatActivity {

    Button b1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        b1=(Button)findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(third.this,second.class);//
               // third.this.finish();
                startActivity(i);
            }
        });
    }
}