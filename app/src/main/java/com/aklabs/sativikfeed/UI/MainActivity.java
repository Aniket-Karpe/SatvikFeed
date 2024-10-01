package com.aklabs.sativikfeed.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import com.aklabs.sativikfeed.Adapters.MycustomeAdapter;
import com.aklabs.sativikfeed.R;
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
        Shapes s2= new Shapes(R.drawable.normals,"normals");
        Shapes s3= new Shapes(R.drawable.unbelieavable,"Unbelivable");
        Shapes s4= new Shapes(R.drawable.allshapes,"Concentartic");
        shapesArrayList.add(s1);
        shapesArrayList.add(s2);
        shapesArrayList.add(s3);
        shapesArrayList.add(s4);
        mycustomeAdapter=new MycustomeAdapter(shapesArrayList,getApplicationContext());
        gridView.setAdapter(mycustomeAdapter);
        gridView.setNumColumns(2);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btn=findViewById(R.id.btnforward);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, GrainShowing.class);
                startActivity(intent);
            }
        });

    }
}