package com.aklabs.sativikfeed.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aklabs.sativikfeed.R;
import com.aklabs.sativikfeed.model.Grains;

import java.util.List;

public class GrainAdaper extends RecyclerView.Adapter<GrainAdaper.MyGrainsviewholder> {

    private List<Grains> grainslist;

    public GrainAdaper(List<Grains> grains) {
        this.grainslist = grains;
    }

    @NonNull
    @Override
    public MyGrainsviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View grainView= LayoutInflater.from(parent.getContext()).inflate(R.layout.items_of_grains,parent,false);
        return new MyGrainsviewholder(grainView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyGrainsviewholder holder, int position) {
       holder.griansimages.setImageResource(grainslist.get(position).getGrianimages());
       holder.grainsText.setText(grainslist.get(position).getGraintitle());
       holder.grainsdesc.setText(grainslist.get(position).getGrainsubtitle());

    }

    @Override
    public int getItemCount() {
        return grainslist.size();
    }
    public  static class MyGrainsviewholder extends RecyclerView.ViewHolder{

ImageView griansimages;
TextView grainsText;
TextView grainsdesc;
        public MyGrainsviewholder(@NonNull View itemView) {
            super(itemView);
            griansimages=itemView.findViewById(R.id.imagesshowing);
            grainsText=itemView.findViewById(R.id.tvTitle);
            grainsdesc=itemView.findViewById(R.id.tvSubtitle);
        }
    }
}
