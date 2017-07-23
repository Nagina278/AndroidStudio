package com.bus.bus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BusActivity extends AppCompatActivity {

    private Button YesButton;
    private Button NoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

        YesButton = (Button) findViewById(R.id.yes_button);
        YesButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(BusActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });

        NoButton = (Button) findViewById(R.id.no_button);
        NoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(BusActivity.this,R.string.message_toast,Toast.LENGTH_LONG).show();
            }
        });

    }
}
