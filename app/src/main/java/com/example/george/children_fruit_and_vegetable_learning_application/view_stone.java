package com.example.george.children_fruit_and_vegetable_learning_application;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class view_stone extends AppCompatActivity {
    public String[] fruitType = {"Apricots","Nectarines", "Peaches","Plums"};
    public String[] fruitDescription = {"These are Apricots","These are Nectarines","These are Peaches","These are Plums"};
    public Integer[] image = {R.drawable.stone_apricot,R.drawable.stone_nectarine,R.drawable.stone_peach,R.drawable.stone_plum1,};
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
        toolbar.setSubtitle("Stone Fruits.");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){

            public  void gettingSpecificFruits(int position){
                Intent intent = new Intent(view_stone.this,single_fruit.class);
                intent.putExtra("name",fruitType[position]);
                intent.putExtra("image",image[position]);
                intent.putExtra("fruitTypes","Stone Fruits");
                startActivity(intent);
            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position <= 3){
                    gettingSpecificFruits(position);
                }
            }
        };

        lst.setOnItemClickListener(itemClickListener);
    }
}
