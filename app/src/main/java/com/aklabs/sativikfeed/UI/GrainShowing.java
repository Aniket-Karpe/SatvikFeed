package com.aklabs.sativikfeed.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;

import com.aklabs.sativikfeed.Adapters.GrainAdaper;
import com.aklabs.sativikfeed.Adapters.contactAdapter;
import com.aklabs.sativikfeed.R;
import com.aklabs.sativikfeed.model.Contact;
import com.aklabs.sativikfeed.model.Grains;

import java.util.ArrayList;
import java.util.List;

public class GrainShowing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grain_showing);
     //   List<Grains> grains=new ArrayList();
        ArrayList<Contact> contacts=new ArrayList();
     //   grains.add(new Grains(R.drawable.closebarley,"Closebarley","The  market"));
     //   grains.add(new Grains(R.drawable.rawjawar,"RawJawar","The Raw jawar "));
     //   grains.add(new Grains(R.drawable.legumes,"Legumes","The Lugumes market"));


        RecyclerView recy=findViewById(R.id.grainsrecycler);

        recy.setLayoutManager(new LinearLayoutManager(this));
        Contact c1=new Contact("Aniket Karpe","Self Business",R.drawable.c);
        contacts.add(new Contact("Aniket Karpe","Self Business",R.drawable.e));
        contacts.add(new Contact("Aniket Karpe","Self Business",R.drawable.g));
        contacts.add(new Contact("Aniket Karpe","Self Business",R.drawable.a));
        contacts.add(new Contact("Aniket Karpe","Self Business",R.drawable.e));
        contacts.add(new Contact("Aniket Karpe","Self Business",R.drawable.g));
        contacts.add(new Contact("Aniket Karpe","Self Business",R.drawable.a));
        contacts.add(new Contact("Aniket Karpe","Self Business",R.drawable.e));
        contacts.add(new Contact("Aniket Karpe","Self Business",R.drawable.g));
        contacts.add(new Contact("Aniket Karpe","Self Business",R.drawable.a));
        contacts.add(new Contact("Aniket Karpe","Self Business",R.drawable.e));
        contacts.add(new Contact("Aniket Karpe","Self Business",R.drawable.g));
        contacts.add(new Contact("Aniket Karpe","Self Business",R.drawable.a));
        contacts.add(new Contact("Aniket Karpe","Self Business",R.drawable.e));
        contacts.add(new Contact("Aniket Karpe","Self Business",R.drawable.g));
        contacts.add(new Contact("Aniket Karpe","Self Business",R.drawable.a));
        contacts.add(new Contact("Aniket Karpe","Self Business",R.drawable.e));
        contacts.add(new Contact("Aniket Karpe","Self Business",R.drawable.g));
        contacts.add(new Contact("Aniket Karpe","Self Business",R.drawable.a));
          contacts.add(c1);
        contactAdapter adapter =new contactAdapter(this,contacts);
        recy.setAdapter(adapter);



    }
}




