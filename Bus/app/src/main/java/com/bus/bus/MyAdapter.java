package com.bus.bus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user on 22/7/2017.
 */

public class MyAdapter extends ArrayAdapter<String> {

    private String [] placeNames;
    private Integer[] placePicture;
    private String [] desc;
    private String [] book;
    private Activity context;

    public MyAdapter(Activity context, String[] placeNames, Integer[] placePicture,  String[] desc ,String[] book) {
        super(context, R.layout.listview_item,placeNames);

        this.context = context;
        this.placeNames= placeNames;
        this.desc=desc;
        this.placePicture = placePicture;
        this.book=book;


    }

    @NonNull
    @Override
    public View getView (int position, @Nullable View convertView, @Nullable ViewGroup parent){

        View r = convertView;
        ViewHolder viewHolder = null;
        if (r == null)
        {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.listview_item,null,true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);

        }
        else {
            viewHolder = (ViewHolder)r.getTag();
        }

        viewHolder.mplace.setImageResource(placePicture[position]);
        viewHolder.mName.setText(placeNames[position]);
        viewHolder.mDesc.setText(desc[position]);
        viewHolder.mExp.setText(book[position]);

        return r;


    }

    class ViewHolder
    {
        ImageView mplace;
        TextView mName;
        TextView mDesc;
        TextView mExp;
        ViewHolder(View v)
        {
            mplace = (ImageView) v.findViewById(R.id.imageView);
            mName =  (TextView) v.findViewById(R.id.textView2);
            mDesc =  (TextView) v.findViewById(R.id.textView3);
            mExp =  (TextView) v.findViewById(R.id.textView4);


        }
    }

}
