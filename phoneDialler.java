package com.example.keerthi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class phoneDialler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialler);

        EditText number = findViewById(R.id.phone_number);
        Button call = findViewById(R.id.call);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = number.getText().toString();

                Intent it = new Intent(Intent.ACTION_DIAL);
                it.setData(Uri.parse("tel:" + num));
                startActivity(it);
            }
        });
    }
}