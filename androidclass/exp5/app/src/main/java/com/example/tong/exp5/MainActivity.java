package com.example.tong.exp5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button bnt = (Button)findViewById(R.id.button);
        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText)findViewById(R.id.edittext);
                final String webStr = editText.getText().toString();
                Uri uri = Uri.parse(webStr);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                //Uri uri = Uri.parse(webStr);

                startActivity(intent);
            }
        });
    }
}