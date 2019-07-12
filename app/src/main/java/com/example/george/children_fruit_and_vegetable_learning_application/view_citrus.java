package com.example.george.children_fruit_and_vegetable_learning_application;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class view_citrus extends AppCompatActivity {
    public String[] fruitType = {"Grape Fruits","Limes ", "Mandarines","Oranges","Tangelos"};
    public String[] fruitDescription = {"These are Grape Fruits","These are Limes","These are Mandarines","These are Oranges","These are Tangelos"};
    public Integer[] image = {R.drawable.citrus_grape_fruit,R.drawable.citrus_lime,R.drawable.citrus_mandarine,R.drawable.citrus_orange,R.drawable.citrus_tangelo};
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
        toolbar.setSubtitle("Citrus");

        //Adding the back naviation
        //ADDING THE BACK NAVIGATION.

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){

            public  void gettingSpecificFruits(int position){
                Intent intent = new Intent(view_citrus.this,single_fruit.class);
                intent.putExtra("name",fruitType[position]);
                intent.putExtra("image",image[position]);
                intent.putExtra("fruitTypes","Citrus Fruits");
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
