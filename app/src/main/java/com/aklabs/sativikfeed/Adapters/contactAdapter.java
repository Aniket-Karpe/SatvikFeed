package com.aklabs.sativikfeed.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aklabs.sativikfeed.R;
import com.aklabs.sativikfeed.model.Contact;

import java.util.ArrayList;

public class contactAdapter extends RecyclerView.Adapter<contactAdapter.ContactViewholder> {
Context context;
ArrayList<Contact> contactslist;

    public contactAdapter(Context context, ArrayList<Contact> contactslist) {
        this.context = context;
        this.contactslist = contactslist;
    }

    @NonNull
    @Override
    public ContactViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.contacts_list_view,parent,false);
        //View grainView= LayoutInflater.from(parent.getContext()).inflate(R.layout.items_of_grains,parent,false);
        ContactViewholder viewholder=new ContactViewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewholder holder, int position) {
        holder.imv1.setImageResource(contactslist.get(position).getcImg());
        holder.tvTitle.setText(contactslist.get(position).getCname());
        holder.tvsubTitle.setText(contactslist.get(position).csubname);

    }

    @Override
    public int getItemCount() {
        return contactslist.size();
    }

    public class ContactViewholder extends RecyclerView.ViewHolder{
     ImageView imv1;
     TextView tvTitle,tvsubTitle;

    public ContactViewholder(@NonNull View itemView) {
        super(itemView);
        imv1=itemView.findViewById(R.id.imgv1);
        tvTitle=itemView.findViewById(R.id.tvcontact);
        tvsubTitle=itemView.findViewById(R.id.tvsubcontact);


    }
}

}
