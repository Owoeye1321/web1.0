package com.tobiloba.mydiary;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {
    //to reference the activity
    private  final Activity context;

    //to line up the list topics
    private final String[] topicArray;

    //to reference  the about array
    private final String[] aboutArray;
    //to reference the  chapter
    private final String[] chapterArray;

    public CustomListAdapter(Activity context, String[] topicArray, String[] aboutArray , String[] chapterArray){
        super(context, R.layout.row , topicArray);

        this.context = context;
        this.topicArray= topicArray;
        this.aboutArray=aboutArray;
        this.chapterArray=chapterArray;

    }
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        @SuppressLint({"InflateParams", "ViewHolder"}) View rowView = inflater.inflate(R.layout.row,null,true);

        //this code gets reference to the row.xml file
        TextView topic =rowView.findViewById(R.id.Topic);
        TextView about = rowView.findViewById(R.id.about);
        TextView chapter =rowView.findViewById(R.id.chapter);

        //this codes sets the objects to a values from the arrays
        topic.setText(topicArray[position]);
        about.setText(aboutArray[position]);
        chapter.setText(chapterArray[position]);
        return rowView;


    }

}
