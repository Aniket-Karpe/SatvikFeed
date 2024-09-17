package com.aklabs.sativikfeed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.aklabs.sativikfeed.Adapters.MycustomeAdapter;
import com.aklabs.sativikfeed.model.Shapes;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    ArrayList<Shapes> shapesArrayList;
    MycustomeAdapter mycustomeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gridView=findViewById(R.id.gridview1);
        shapesArrayList=new ArrayList<>();

        Shapes s1= new Shapes(R.drawable.allshapes,"Prafecic");
        shapesArrayList.add(s1);
        mycustomeAdapter=new MycustomeAdapter(shapesArrayList,getApplicationContext());
        gridView.setAdapter(mycustomeAdapter);

    }
}