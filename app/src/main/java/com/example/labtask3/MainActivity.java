package com.example.labtask3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar); // get the reference of Toolbar
        setSupportActionBar(toolbar);

       EditText enteredNumber = findViewById(R.id.number);
       Button CallButton = findViewById(R.id.call);

        CallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dialedNumber = enteredNumber.getText().toString();
                if (dialedNumber.trim().length() > 10) {
                    String dial = "tel:" + dialedNumber;
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                } else {
                    Toast.makeText(MainActivity.this, "Enter Correct number!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.item1)
        {
            Toast.makeText(this, "Cliked on Item 1", Toast.LENGTH_SHORT).show();
        }

        else if (itemId == R.id.item2)
        {
            Toast.makeText(this, "Cliked on Item 2", Toast.LENGTH_SHORT).show();
        }
        else if (itemId == R.id.item3)
        {
            Toast.makeText(this, "Cliked on Item 3", Toast.LENGTH_SHORT).show();
        }
        else if (itemId == R.id.item4)
        {
            Toast.makeText(this, "Cliked on Item 4", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}