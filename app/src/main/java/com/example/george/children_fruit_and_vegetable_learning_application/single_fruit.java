package com.example.george.children_fruit_and_vegetable_learning_application;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class single_fruit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_fruit);

        //Getting the image from the intent.
        ImageView imageFromLayout = (ImageView) findViewById(R.id.imageInLayout);
        TextView nameFromLayout = findViewById(R.id.nameFromLayout);
        TextView fruitTypess = findViewById(R.id.fruitTypes);
        //getting the name of the fruit that has been passed through an intent.
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int image = intent.getIntExtra("image",R.drawable.berries);
        String fruitTypes = intent.getStringExtra("fruitTypes");

        //Setting the properImage.

        imageFromLayout.setImageResource(image);
        nameFromLayout.setText(name);
        fruitTypess.setText(fruitTypes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        toolbar.setTitle("fruits,");
        toolbar.setSubtitle(name);
        ActionBar actionBar = getSupportActionBar();

        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
