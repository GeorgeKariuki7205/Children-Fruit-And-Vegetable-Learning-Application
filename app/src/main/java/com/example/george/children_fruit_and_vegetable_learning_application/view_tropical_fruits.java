package com.example.george.children_fruit_and_vegetable_learning_application;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class view_tropical_fruits extends AppCompatActivity {
    public String[] fruitType = {"Bananas","Coconuts", "Kiwis","Mangoes","Passion Fruits","Star Fruits"};
    public String[] fruitDescription = {"These are Bananas","These are Coconuts","These are Kiwis","These are Mangoes","These are Passion Fruits","These are Star Fruits"};
    public Integer[] image = {R.drawable.tropical_banana2,R.drawable.tropical_coconut,R.drawable.tropical_kiwi,R.drawable.tropical_mangoes2,R.drawable.tropical_passion2,R.drawable.tropical_star_fruit};
    public ListView lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        lst = (ListView) findViewById(R.id.listview);
        typesOfFruitsClass typesOfFruits = new typesOfFruitsClass(this,fruitType,fruitDescription,image);
        lst.setAdapter(typesOfFruits);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setSubtitle("Tropical Fruits.");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){

            public  void gettingSpecificFruits(int position){
                Intent intent = new Intent(view_tropical_fruits.this,single_fruit.class);
                intent.putExtra("name",fruitType[position]);
                intent.putExtra("image",image[position]);
                intent.putExtra("fruitTypes","Tropical Fruits");
                startActivity(intent);
            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position <= 5){
                    gettingSpecificFruits(position);
                }
            }
        };

        lst.setOnItemClickListener(itemClickListener);
    }
}
