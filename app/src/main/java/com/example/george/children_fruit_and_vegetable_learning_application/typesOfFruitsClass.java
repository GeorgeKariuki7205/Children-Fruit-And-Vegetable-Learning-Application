package com.example.george.children_fruit_and_vegetable_learning_application;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class typesOfFruitsClass extends ArrayAdapter<String>{
    //The arrays that describe the types of Fruits.
    String[] fruitType;
    String[] fruitDescription;
    Integer[] image;
    private Activity context;

    public typesOfFruitsClass(Activity context, String[] fruitType,String[] fruitDescription,Integer[] image) {
        super(context, R.layout.activity_types_of_fruits,fruitType);

        this.fruitType = fruitType;
        this.fruitDescription = fruitDescription;
        this.image = image;
        this.context = context;
    }

    @NonNull
    @Override
    public  View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        View r = convertView;
        ViewHolder viewHolder = null;

        if(r == null){
            LayoutInflater layoutInflater = context.getLayoutInflater();

            r = layoutInflater.inflate(R.layout.activity_types_of_fruits, null,true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) r.getTag();
        }

        viewHolder.image.setImageResource(image[position]);
        viewHolder.fruiTtype.setText(fruitType[position]);
        viewHolder.fruitDescription.setText(fruitDescription[position]);
        return  r;

    }

    class  ViewHolder {
        TextView fruiTtype;
        TextView fruitDescription;
        ImageView image;

        ViewHolder( View v){
            fruiTtype = v.findViewById(R.id.Typeoffruit);
            fruitDescription = v.findViewById(R.id.descriptionOfFruit);
            image = v.findViewById(R.id.img);
        }
    }
}
