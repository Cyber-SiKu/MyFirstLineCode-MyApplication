package com.example.siku.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SectionIndexer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button tel = (Button) findViewById(R.id.button);
        onActivityResult();
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivityForResult(intent2,1);
//                String data = "Hello SecondActivity";
//                Intent intent1 = new Intent(MainActivity.this,Main2Activity.class);
//                intent1.putExtra("extra_data",data);
//                startActivity(intent1);
            }
        });
    }
}
