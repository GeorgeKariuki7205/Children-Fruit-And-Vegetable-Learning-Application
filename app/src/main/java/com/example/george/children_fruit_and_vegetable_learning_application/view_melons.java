package com.example.george.children_fruit_and_vegetable_learning_application;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class view_melons extends AppCompatActivity {
    public String[] fruitType = {"Honeydew Melon","Rock Melon ", "Thorn Melon","Water Melon"};
    public String[] fruitDescription = {"These are Honeydew Melon","These are Rock Melon","These are Thorn Melon","These are Water Melon"};
    public Integer[] image = {R.drawable.melon_honeydewmelon,R.drawable.melon_rock_melon,R.drawable.melon_thornmelon,R.drawable.melon_watermelon};
    public ListView lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        lst = (ListView) findViewById(R.id.listview);
        typesOfFruitsClass typesOfFruits = new typesOfFruitsClass(this,fruitType,fruitDescription,image);
        lst.setAdapter(typesOfFruits);
        //Adding the tool bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setSubtitle("Melons");

        //Adding the back naviation
        //ADDING THE BACK NAVIGATION.

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){

            public  void gettingSpecificFruits(int position){
                Intent intent = new Intent(view_melons.this,single_fruit.class);
                intent.putExtra("name",fruitType[position]);
                intent.putExtra("image",image[position]);
                intent.putExtra("fruitTypes","Melons");
                startActivity(intent);
            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position <= 4){
                    gettingSpecificFruits(position);
                }
            }
        };

        lst.setOnItemClickListener(itemClickListener);

    }
}
