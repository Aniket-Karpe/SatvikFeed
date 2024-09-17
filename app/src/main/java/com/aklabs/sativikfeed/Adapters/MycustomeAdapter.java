package com.aklabs.sativikfeed.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.aklabs.sativikfeed.R;
import com.aklabs.sativikfeed.model.Shapes;

import java.util.ArrayList;

public class MycustomeAdapter extends ArrayAdapter<Shapes> {


    private ArrayList<Shapes> shapesarraylist;
    Context context;

    public MycustomeAdapter( ArrayList<Shapes> Shapesarrrlist, Context context) {
        super(context, R.layout.grid_laout_files,Shapesarrrlist);
        this.shapesarraylist = Shapesarrrlist;
        this.context = context;
    }

    private static class MyviewHolder{
        TextView shapesName;
        ImageView shapesImages;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            Shapes shpes=getItem(position);
            MyviewHolder  myviewHolder;
            if(convertView==null)
            {
                myviewHolder=new MyviewHolder();
                LayoutInflater inflater=LayoutInflater.from(getContext());
                convertView=  inflater.inflate(R.layout.grid_laout_files,parent,false);
                myviewHolder.shapesImages=(ImageView) convertView.findViewById(R.id.imageView);
                myviewHolder.shapesName=(TextView) convertView.findViewById(R.id.text1);
                convertView.setTag(myviewHolder);
            }
            else{
myviewHolder=(MyviewHolder)convertView.getTag();
            }
            myviewHolder.shapesName.setText(shpes.getShapenames());
            myviewHolder.shapesImages.setImageResource(shpes.getHsapeImages());
            return  convertView;
    }
}
