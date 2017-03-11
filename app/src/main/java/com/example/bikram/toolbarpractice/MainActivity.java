package com.example.bikram.toolbarpractice;

import android.content.Intent;//=======IMPORTANT POINT in menifest file i use  android:launchMode="singleTask" in each activity becuse in this app we back button in toolbar.In back button code I use intent if press back button of third activity(which call the second activity) then second activity again loaded in stack to avoid this I use the code in menifest file
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View v)
    {
        Intent i= new Intent(MainActivity.this,second.class);
      // MainActivity.this.finish();
        startActivity(i);
    }
}
