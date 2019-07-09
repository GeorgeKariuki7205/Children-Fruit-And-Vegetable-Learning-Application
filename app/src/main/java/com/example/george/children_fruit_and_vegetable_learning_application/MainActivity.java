package com.example.george.children_fruit_and_vegetable_learning_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void typesOfFruits(View view){
//        CharSequence text = "Types Of Fruits.";
//        int duration = Toast.LENGTH_SHORT;
//        Toast toast = makeText(this, text, duration);
//        toast.show();

        Intent intent = new Intent(this, typesOfFruits.class);
        startActivity(intent);


    }
    public void typesOfVegetables(View view){
        CharSequence text = "Types Of Vegetables.";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = makeText(this, text, duration);
        toast.show();
    }
    public void typesOfMinerals(View view){
        CharSequence text = "Types Of Minerals.";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = makeText(this, text, duration);
        toast.show();
    }
}
